#1. **Inventory Stock Alert**:
#**Problem Statement**: Whenever a new rental is created, 
#check the inventory quantity for the rented film. If the quantity 
#falls below a certain threshold (e.g., 5 copies), log a warning message in a `low_stock_alerts` table.

#**Trigger Description**: Create an `AFTER INSERT` trigger on the `rental` table 
#that updates the inventory count for the rented film and inserts a row into the 
#`low_stock_alerts` table if the count is below the threshold.

CREATE TABLE low_stock_alerts (
    alert_id INT AUTO_INCREMENT PRIMARY KEY,
    film_id INT,
    alert_message VARCHAR(255),
    alert_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO low_stock_alerts (film_id, alert_message)
VALUES
    (1, 'Low stock alert: Film with inventory ID 1 has only 3 copies left.'),
    (5, 'Low stock alert: Film with inventory ID 5 has only 2 copies left.'),
    (10, 'Low stock alert: Film with inventory ID 10 has only 4 copies left.');

DELIMITER //
CREATE TRIGGER rental_after_insert_trigger
AFTER INSERT ON rental
FOR EACH ROW
BEGIN
    DECLARE current_stock INT;
    SELECT inventory_id INTO current_stock
    FROM inventory
    WHERE film_id = NEW.inventory_id;    
    IF current_stock < 5 THEN
        INSERT INTO low_stock_alerts (film_id, alert_message)
        VALUES (NEW.inventory_id, CONCAT('Low stock alert: Film with inventory ID ', NEW.inventory_id, ' has only ', current_stock, ' copies left.'));
    END IF;
END //
DELIMITER ;

#2. **Prevent Deletion of Active Customers**:
#**Problem Statement**: Prevent the deletion of a customer who has any active rentals.

#**Trigger Description**: Create a `BEFORE DELETE` trigger on the `customer` table that checks for active rentals. If active rentals exist, raise an error and prevent the deletion.

delimiter //
create trigger prevent_customer_deletion_trigger
before delete on customer
for each row
begin
    declare active_rentals int;

    select count(*)
    into active_rentals
    from rental
    where customer_id = old.customer_id
    and return_date is null; 
    
    if active_rentals > 0 then
        signal sqlstate '45000'
        set message_text = 'Cannot delete customer with active rentals.';
    end if;
end //
delimiter ;

#3. **Update Last Updated Timestamp**:
#**Problem Statement**: Automatically update the `last_update` timestamp column in the `film` table whenever a film's details are modified.

#**Trigger Description**: Create a `BEFORE UPDATE` trigger on the `film` table that sets the `last_update` column to the current timestamp.



#4. **Log Film Deletion**:
#**Problem Statement**: Log details of any film deletions into a `deleted_films_log` table for auditing purposes.

#**Trigger Description**: Create an `AFTER DELETE` trigger on the `film` table that inserts the deleted film's details into the `deleted_films_log` table.

Create table deleted_films_log(
film_id INTEGER,
title VARCHAR(255),
release_year VARCHAR (5)
)
select * from deleted_films_log;

DELIMITER //
CREATE TRIGGER Log_Film_Deletion
BEFORE DELETE ON film
FOR EACH ROW
BEGIN
INSERT into deleted_films_log(film_id ,title ,release_year) 
VALUE(OLD.film_id,OLD.title,old.release_year);
END;
//
DELIMITER ;

DELETE from film 
where film_id=1;

#5. **Ensure Valid Rental Dates**:
#**Problem Statement**: Ensure that the `return_date` 
#in the `rental` table is always after the `rental_date`.

#**Trigger Description**: Create a `BEFORE INSERT` or 
#`BEFORE UPDATE` trigger on the `rental` table that checks if the 
#`return_date` is after the `rental_date`. 
#If not, raise an error to prevent the insert or update.