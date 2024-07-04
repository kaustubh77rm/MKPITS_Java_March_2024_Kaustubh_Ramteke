#### Problem 1:Find the total number of films in the database.**
SELECT count(film_id) 
as totalFilms 
from film;

#### Problem 2:Find the average rental rate of all films.**
select AVG(rental_rate) 
as averageRentalRate 
from film

### Problem 3:**Find the total number of rentals made.**
select count(*) 
as total_number_of_rentals
from rental

### Problem 4:**Find the highest replacement cost of any film.**
select max(replacement_cost) 
as highest_rep_cost 
from film

### Problem 5:**Find the total revenue generated from rentals.**
select amount(rental_duration*rental_rate) as total_revenue from rental
select * from film

### Problem 6:**Find the average length of films.**
select avg(length) as average_length from film

### Problem 7:
**Find the minimum rental duration among all films.**
select min(rental_duration) as min_ren_dur from film

### Problem 8:
**Find the total number of distinct customer IDs in the rental table.**
select distinct(customer_id) as dis_cus_id from rental

### Problem 9:
**Find the average payment amount made by customers.**
select avg(amount) 
as avg_pay_amount  
from payment

### Problem 10:
**Find the total number of inventory items available.**
select count(inventory_id) 
as total_inv_id 
from inventory

### Problem 11:
**Find the total number of distinct films rented.**
select count(film_id) 
as distinct_films 
from film

### Problem 12:
**Find the highest payment amount made by any customer.**
select max(rental_duration*length) 
as highest_payment 
from film

### Problem 13:
**Find the average length of films that have a rating of 'PG'.**
select avg(length) 
as avg_length 
from film 
where rating='pg' 

### Problem 14:
**Find the total number of payments made in May 2005.**
select * from film
select count(payment_id) 
from payment 
where payment_date 
between '2005-05-01' and '2005-05-31'

### Problem 15:
**Find the total number of films with a rental duration of 7 days.**
select count(film_id) 
as total_num_of_films 
from film 
where rental_duration='7';

### Problem 16:
**Find the average replacement cost of films with a rental rate of 2.99.**
select avg(replacement_cost) 
as avg_replacement_cost 
from film 
where rental_rate='2.99'