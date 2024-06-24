DELIMITER //
CREATE FUNCTION AddTwoNumbers(num1 INT, num2 INT)
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE result INT;
    SET result = num1 + num2;
    RETURN result;
END //
DELIMITER ;

SELECT AddTwoNumbers(5, 3);

#15.A Procedures
#1. **Calculate Late Fees for a Rental**:
#   Write a function that accepts a rental ID and calculates the total late fees incurred for that rental. The function should return the total late fee amount based on the difference between the return date and the due date.

#2. **Get Film Rating by Title**:
#   Create a function that takes a film title as input and returns the film's rating. The function should search for the film by title and return its rating (e.g., G, PG, PG-13, R, NC-17).

delimiter //
create function get_film_rating_by_title(film_title varchar(255))
returns varchar(10)
deterministic
begin
    declare rating varchar(10);
    select rating into rating
    from film
    where title = film_title;

    return rating;
end //
delimiter ;

select get_film_rating_by_title()

#3. **Count Films by Language**:
#   Develop a function that accepts a language name and returns the number of films available in that language. The function should query the films and languages tables to provide the count.

delimiter //
create function count_films_by_language(language_name varchar(255))
returns int
deterministic
begin
    declare language_id int;
    declare film_count int;

    select language_id into language_id
    from language
    where name = language_name;

    select count(*) into film_count
    from film
    where language_id = language_id;

    return film_count;
end //

delimiter ;
drop function count_films_by_language
select count_films_by_language('english')

#4. **Check Film Availability**:
#   Implement a function that takes a film ID as input and returns a Boolean value indicating whether the film is currently available for rent. The function should check the inventory and rental tables to determine availability.

DELIMITER //
CREATE FUNCTION CheckFilmAvailability(film_id INT)
RETURNS BOOLEAN
deterministic
BEGIN
    DECLARE available BOOLEAN;
    SELECT COUNT(*) INTO available
    FROM inventory inv
    LEFT JOIN rental rnt ON inv.inventory_id = rnt.inventory_id
    WHERE inv.film_id = film_id
    AND rnt.return_date IS NULL; 

    RETURN available;
END //

DELIMITER ;
select CheckFilmAvailability(4)

#5. **Get Customer Rental History**:
#Write a function that accepts a customer ID and returns the 
#total number of rentals made by that customer. 
#The function should aggregate the rentals based on the provided customer ID and return the count.

#15.B Functions

#Problem Statement 1: Calculate Total Order Value
#Design a user-defined function that takes order quantity and 
#unit price as input and calculates the total order value for each order.

DELIMITER //
CREATE FUNCTION CalculateTotalOrderValue(order_quantity INT, unit_price DECIMAL(10,2))
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE total_value DECIMAL(10,2);
    SET total_value = order_quantity * unit_price;
    RETURN total_value;
END //
DELIMITER ;
select calculatetotalordervalue(12,20)

#Problem Statement 2: Calculate Age from Birthdate
#Develop a user-defined function that takes a person's birthdate 
#as input and calculates their current age in years.

#Problem Statement 3: String Reversal
#Design a user-defined function that takes a string as input and returns the reversed string.

#Problem Statement 4: Calculate BMI (Body Mass Index)
#Create a user-defined function that takes a person's weight (in kilograms) 
#and height (in meters) as input and calculates their BMI.

#Problem Statement 5: Generate a Unique Customer ID
#Design a user-defined function that generates a unique customer ID 
#based on a predefined pattern and the customer's personal details.