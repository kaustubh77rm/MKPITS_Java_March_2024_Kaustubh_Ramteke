#self join
#Problem Statement 1: Retrieve Customers Who Have Rented the Same Film Twice
#Retrieve the customer IDs and film titles for customers who have rented the same film more than #once.
select r1.customer_id, f.title
from rental r1
join rental r2 
on r1.customer_id = r2.customer_id 
join inventory i 
on r1.inventory_id = i.inventory_id
join film f 
on i.film_id = f.film_id
group by r1.customer_id, f.title
order by f.title;

#Problem Statement 2: Find Actors Who Have Worked Together in a Film
select concat(a1.first_name, ' ', a1.last_name) as actor1,
concat(a2.first_name, ' ', a2.last_name) as actor2,
f.title as film_title
from film_actor fa1
join actor a1 on fa1.actor_id = a1.actor_id
join film_actor fa2 on fa1.film_id = fa2.film_id and fa1.actor_id <> fa2.actor_id
join actor a2 on fa2.actor_id = a2.actor_id
join film f on fa1.film_id = f.film_id
where a1.actor_id < a2.actor_id
order by film_title, actor1, actor2;

#Problem Statement 3: Identify Customers Who Share the Same Address
#Retrieve pairs of customer names who share the same address.

#Problem Statement 4: Find Employees and Their Managers
#Retrieve employee names and their corresponding manager names within the same department.

#Problem Statement 5: Identify Films with Similar Titles
#Retrieve pairs of film titles that have a similar title structure (e.g., differing by one character #or having a common substring).