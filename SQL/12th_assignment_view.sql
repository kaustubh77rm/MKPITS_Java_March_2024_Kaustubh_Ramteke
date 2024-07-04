### Problem Statement 1
#**Create a view named `customer_rental_info` that lists each customer's 
#full name (first and last), email, the number of rentals they have made, 
#and the total amount they have spent on rentals.**

create and rename view customer_rental_info as
(
select c.first_name,c.last_name,c.email,count(r.rental_id), sum(f.rental_rate) 
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id = r.inventory_id
join film f
on f.film_id=i.film_id
group by c.customer_id
order by c.first_name asc
)
select * from view_customer

### Problem Statement 2
#**Create a view named `top_rented_films` that displays the top 10 most rented films, 
#including the film title and the number of times it has been rented.**
create view viewTopFilms as
(
select f.film_id,f.title, count(r.rental_id) as 'no of times film rented'
from film f
join inventory i
on i.film_id = f.film_id
join rental r
on r.inventory_id = i.inventory_id
join customer c 
on c.customer_id = r.customer_id
group by f.title
order by f.title
)
drop view viewtopfilms
select * from viewtopfilms

### Problem Statement 3
#**Create a view named `active_customers` that lists all customers who 
#have rented at least one film in the last 30 days. 
#Include the customer's full name, email, and the date of their last rental.**
create or replace view active_customers as
(
select concat (c.first_name,' ',c.last_name) as 'full name' ,c.email, max(r.rental_date) as 'last rental date'
from customer c
join rental r
on c.customer_id = r.customer_id
order by c.first_name
)
drop view active_customers
select * from active_customers

### Problem Statement 4
#**Create a view named `inventory_by_store` that displays the 
#number of films available in each store. 
#Include the store ID and the count of films available in that store.**

create view inventory_by_store as
(
select st.store_id,count(f.film_id) as 'no of films available'
from store st
join inventory i
on st.store_id = i.store_id
join film f
on f.film_id = i.film_id
group by st.store_id
)
select * from inventory_by_store
drop view inventory_by_store

### Problem Statement 5
#**Create a view named `staff_sales_performance` that 
#lists each staff member's full name, their store, and the total sales amount they have made.**
create view staff_sales_performance as
(
select s.store_id,concat(st.first_name,' ',st.last_name) as 'full name', sum(p.amount) as 'total sales amount'
from staff st
join store s 
on st.store_id=s.store_id
join payment p
on p.staff_id = st.staff_id
group by st.first_name
)
select * from staff_sales_performance
drop view staff_sales_performance
#example_1
create table newStud
(
rollno int(3),
name char(15)
)
insert into newStud values(1,'kaustubh')
drop table newstud
create view view1 as
select * from newStud

select * from view1

#age query
select curdate()