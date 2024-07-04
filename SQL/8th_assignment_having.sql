#1. High revenue categories:
#Find categories with an average rental revenue greater than $10.
SELECT c.name AS category, AVG(p.amount) AS avg_rental_revenue
FROM category c
JOIN film_category fc ON c.category_id = fc.category_id
JOIN film f ON fc.film_id = f.film_id
JOIN inventory i ON f.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
JOIN payment p ON r.rental_id = p.rental_id
GROUP BY c.name
HAVING AVG(p.amount)>10;

#2. Customers with many rentals:
#Identify customers who have rented more than 30 films.
SELECT c.customer_id, c.first_name, c.last_name, COUNT(r.rental_id) AS rental_count
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
HAVING COUNT(r.rental_id) > 30;

#3. Popular languages:
#List languages with more than 50 films.
SELECT c.customer_id, c.first_name, c.last_name, COUNT(r.rental_id) AS rental_count
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id, c.first_name, c.last_name
HAVING COUNT(r.rental_id) > 30;

#4. Stores with high revenue:
#Find stores with total revenue exceeding $5000.
SELECT s.store_id, SUM(p.amount) AS total_revenue
FROM store s
JOIN customer c ON s.store_id = c.store_id
JOIN rental r ON c.customer_id = r.customer_id
JOIN payment p ON r.rental_id = p.rental_id
GROUP BY s.store_id
HAVING SUM(p.amount) > 5000;

#5. Actors in popular films:
#Show actors who have appeared in more than 10 films.
-- actor , filmactor ,film
select concat(a.first_name,' ', a.last_name) as 'actor'
from actor a
join film_actor fa
on a.actor_id = fa.actor_id
join film f
on f.film_id = fa.film_id
group by a.first_name
having count(f.film_id)>10

#6. Staff with high customer interactions:
#List staff members who have handled more than 500 customer transactions.
select concat(s.first_name,' ', s.last_name) as name
from staff s
left outer join rental r
on s.staff_id = r.staff_id
left outer join customer c
on r.customer_id = c.customer_id
group by s.first_name
having count(c.customer_id>500)
 
#7. Active customers:
#Identify customers who have rented in the last 30 days.
select concat(c.first_name,' ',c.last_name) as name
from customer c
left outer join rental r
on c.customer_id=r.customer_id
group by c.first_name
having max(r.rental_date) = now() - interval 18 year

#8. Long rentals:
#List films with an average rental duration of more than 7 days.
select f.title
from film f
join inventory i
on f.film_id = i.film_id
join rental r
on i.inventory_id = r.inventory_id

#9. Highly rented films:
#Identify films that have been rented more than 30 times.
select f.film_id,f.title,count(r.rental_id) as rental_count
from film f
join inventory i 
on f.film_id = i.film_id
join rental r 
on i.inventory_id = r.inventory_id
join payment p 
on r.rental_id = p.rental_id
group by f.film_id, f.title
having count(r.rental_id) > 30
order by rental_count desc;

#10. Customers with diverse film preferences:
#Find customers who have rented films from at least 5 different categories.
select c.customer_id,c.first_name,c.last_name
from customer c
join rental r 
on c.customer_id = r.customer_id
join inventory i 
on r.inventory_id = i.inventory_id
join film_category fc 
on i.film_id = fc.film_id
join category cat 
on fc.category_id = cat.category_id
group by c.customer_id
having count(distinct cat.category_id) >= 5;