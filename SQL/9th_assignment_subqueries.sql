#sub-query
#1. Find customers who rented a specific film:
#Retrieve the names of customers who rented the film with the title 'Inception'.
select c.first_name, c.last_name
from customer c
join rental r 
on c.customer_id = r.customer_id
join inventory i 
on r.inventory_id = i.inventory_id
where i.film_id = (
    select f.film_id
    from film f
    where f.title = 'inception'
);

#2. Find films rented by a specific customer:
#Retrieve the titles of films rented by a customer with a given customer_id.
select f.title
from film f
where f.film_id in 
(
    select i.film_id
    from inventory i
    where i.inventory_id in 
    (
        select r.inventory_id
        from rental r
        where r.customer_id = 1
    )
);

#3. Find rental details for the most recent rental:
#Retrieve the rental details for the most recent rental transaction in the database.
SELECT *
FROM rental r
WHERE r.rental_date = 
(
    SELECT MAX(rental_date)
    FROM rental
);


show full tables 
where table_type = 'view'

#4. Find the average rental duration compared to the overall average:
#Compare the average rental duration of films in a specific category 
#with the overall average rental duration.
-- Calculate the overall average rental duration
select avg(f.rental_duration) 
from film f
where f.film_id in
(
select fc.film_id
from film_category fc
where fc.category_id=1
)

#5. Find films with rental counts above average:
#Retrieve films with rental counts greater than the average number of rentals across all films.
#- Count film wise rental
#- Display films whose rental count is > avg rental count#
select f.title as 'film name'
from film f
join inventory i 
on f.film_id = i.film_id
join rental r 
on i.inventory_id = r.inventory_id
group by f.film_id
having count(r.rental_id) > (
    select avg(film_rental_count) 
    from (
        select count(r2.rental_id) as film_rental_count
        from film f2
        join inventory i2 
        on f2.film_id = i2.film_id
        join rental r2 
        on i2.inventory_id = r2.inventory_id
        group by f2.film_id
    ) as avg_rentals
);

#6. Find customers who rented the same film as another customer:
#Identify customers who rented the same film as a specific customer (based on customer_id).

#7. Find customers who have rented from both stores:
#Identify customers who have rented films from both store_id 1 and store_id 2.

#8. Find actors who have appeared in the same film:
#Retrieve actors who have appeared in the same film as a specific actor (based on actor_id).

#9. Find films rented by top-revenue customers:
#Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue.

#10. Find films that have not been rented:
#Retrieve titles of films that have not been rented by any customer.