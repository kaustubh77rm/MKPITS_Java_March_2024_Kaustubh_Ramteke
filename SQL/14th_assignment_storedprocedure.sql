#1. **Retrieve Actor Information by Last Name**:
# Write a procedure that accepts an actor's last name as input and 
# returns a list of all actors with that last name, including their first name, last name and actor ID.

delimiter $$
create procedure actorname(in ln char(10))
begin 
select first_name,last_name,actor_id from actor 
where last_name=ln;
end $$
delimiter ; 

call actorname('Chase');
select @fn;

drop procedure actorname;

#2. **List Films by Category**:
#Create a procedure that takes a category name as input and 
#returns all films in that category, including film title, description, release year, and rating.
select * from film

delimiter $$
create procedure film_proc(in cat_nm char(10))
begin
select f.title, f.description, f.release_year, f.rating from film f
join film_category fc
on f.film_id = fc.film_id
join category c
on c.category_id = fc.category_id
where c.name=cat_nm;
end $$
delimiter ;

call film_proc('action');

#3. **Calculate Total Payment by Customer**:
#Develop a procedure that accepts a customer ID and 
#returns the total amount paid by that customer. 
#The result should include the customer ID, first name, last name, and total payment amount.
delimiter $$
create procedure pay_cus(in cus_id int(5))
begin 
select c.customer_id,c.first_name,c.last_name, sum(p.amount) as 'total amount paid'
from customer c
join payment p
on c.customer_id = p.customer_id
where c.customer_id = cus_id;
end $$
delimiter ; 

drop procedure pay_cus;
call pay_cus(1);

#4. **Count Rentals by Date Range**:
#Implement a procedure that accepts a start date and 
#an end date and returns the number of rentals made within that date range. 
#Include the rental ID and rental date in the results.
delimiter $$
create procedure proc_rentals_date(in start_date date, in end_date date)
begin 
select rental_id, rental_date, return_date
from rental
where rental_date between start_date and end_date;
end $$
delimiter ;

call proc_rentals_date('2005-05-27', '2006-02-15');

#5.**Update Film Rental Rate**:
#Write a procedure to update the rental rate of a specific film. 
#The procedure should accept the film ID and the new rental rate 
#as inputs and then update the rental rate for that film in the database. 
#Return the film ID, old rental rate, and new rental rate as output.

delimiter $$
create procedure update_rental_rate(in p_film_id int, in p_new_rental_rate decimal(4,2))
begin
declare v_old_rental_rate decimal(4,2);
select rental_rate into v_old_rental_rate
from film
where film_id = p_film_id;
update film
set rental_rate = p_new_rental_rate
where film_id = p_film_id;
select p_film_id as film_id, v_old_rental_rate as old_rental_rate, p_new_rental_rate as new_rental_rate;
end $$
delimiter ;

call update_rental_rate(1, 4.99);

#Problem Statement 1: 
#Calculate Late Fees for Rentals
#Design a stored procedure that calculates late fees for rentals 
#based on the return date and the due date. 
#The procedure should take the rental ID as input and update 
#the late fee for the corresponding rental.

delimiter $$
create procedure lf(in rental_id int, in end_date date)
begin 
select rental_id, rental_date, return_date
from rental
where rental_date between start_date and end_date;
end $$
delimiter ;
drop procedure lf;
call lf('2005-05-27', '2006-02-15');

#Problem Statement 2: 
#Generate a Rental Receipt
#Create a stored procedure that generates a rental receipt 
#for a given rental ID. The receipt should include rental details, 
#customer information, and total cost. The procedure should output the receipt to the console.

#Problem Statement 3: 
#Identify Inactive Customers
#Develop a stored procedure that identifies inactive customers 
#who haven't made any rentals in the last six months. 
#The procedure should output a list of these customers along with their contact information.

#Problem Statement 4: 
#Determine Movie Recommendations
#Write a stored procedure that suggests movie recommendations 
#for a given customer based on their rental history and preferences. 
#The procedure should consider the genre and rating of previously rented movies to provide personalized recommendations.

#Problem Statement 5: 
#Calculate Revenue by Category
#Design a stored procedure that calculates the total revenue 
#generated by each film category. The procedure should output a report 
#showing the revenue for each category and the percentage of total revenue it represents.