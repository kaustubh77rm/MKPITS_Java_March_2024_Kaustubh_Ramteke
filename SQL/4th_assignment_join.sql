use sakila;
#1. Retrieve the names of all customers and the titles of the films they have rented.
select c.first_name,c.last_name, f.title 
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on r.inventory_id = i.inventory_id
join film f 
on i.film_id = f.film_id

#2. Display the rental date and return date for each rental along with the customers first name and last name.
select c.first_name, c.last_name,r.rental_date,r.return_date 
from rental r
join customer c
on c.customer_id=r.customer_id

#3. List the names of actors who have appeared in the film titled Chamber Italian.
select a.actor_id, a.first_name, a.last_name, f.title
from actor a
join film_actor fa 
on a.actor_id = fa.actor_id
join film f
on fa.film_id = f.film_id
where f.title='chamber italian'

#4. Get the titles of all films rented by the customer named &quot;William Brown&quot;.
select c.first_name,c.last_name
from customer c
join rental r
on c.customer_id=r.customer_id
where c.first_name='william' and c.last_name='brown'

#5. Retrieve the film titles rented by the customer with customer_id 100.
select f.title, c.customer_id
from film f
join inventory i 
on f.film_id = i.film_id
join rental r 
on i.inventory_id = r.inventory_id 
join customer c 
on r.customer_id = c.customer_id
where r.customer_id=100

#6. List the film titles and rental dates for all rentals made by the customer with customer_id 200.
select f.title, c.customer_id, c.first_name,c.last_name
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id = i.film_id
where c.customer_id=200

#7. Display the film titles and rental durations for all rentals made on May 15, 2005.
select f.title, f.rental_duration, r.rental_date
from film f
join inventory i
on f.film_id=i.film_id
join rental r
on i.inventory_id=r.inventory_id
where r.rental_date like '2005-05%'

#8. List the names of customers who have rented the film titled Alien Center.
select c.customer_id,c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id
where f.title='alien center'

#9. Display the first name, last name, and email of customers who have rented the film titled Flight Lies
select c.first_name,c.last_name,c.email,f.title
from customer c
join rental r
on r.customer_id=c.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='flight lies'

#10. Retrieve the rental date and rental duration for each rental made by customer Linda Williams;.
select c.first_name,c.last_name,f.rental_rate,f.rental_duration
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='linda' and c.last_name='williams'

#11. List the film titles and rental dates for all rentals made by customer Mary Johnson (replaced mary with patricia);.
select c.first_name,c.last_name,f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='patricia' and c.last_name='johnson'

#12. Display the film titles rented by the customer with customer_id 300.
select c.customer_id,f.title as films 
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=300

#13. Get the names of all customers who have rented more than 5 films.
select c.first_name,c.last_name, count(f.film_id) as count
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
group by c.customer_id,c.first_name,c.last_name
having count(f.film_id)>5

#14. List the film titles and rental dates for all rentals made by the customer with customer_id 400.
select c.customer_id,f.title as film_titles,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=400

#15. Retrieve the rental date and return date for each rental made by customer Richard Davis(replaced with jennifer davis);.
select c.first_name,c.last_name,r.rental_date,r.return_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='jennifer' and c.last_name='davis'

#16. Display the first name, last name, and email of customers who have rented the film titled Dinosaur Secretary
select c.first_name,c.last_name,c.email,f.title as film_titled
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='Dinosaur Secretary'

#17. List the names of customers who have rented the film titled silence kane.
select c.first_name,c.last_name,f.title as film
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='silence kane'

#18. Get the film titles and rental dates for all rentals made on August 10,2005.
select f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.rental_date='2005-08-10'

#19. Retrieve the film titles rented by the customer with customer_id 500.
select c.customer_id,f.title as film_titles
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=500

#20. Display the rental date and rental duration for each rental made by customer &quot;Karen Smith&quot;.
select c.first_name,c.last_name, datediff(r.return_date,r.rental_date) as rental_duration
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id

#21. List the film titles and rental dates for all rentals made by customer
#Steven Taylor (dorothy taylor name changed)
select c.first_name,c.last_name, f.title as film_titles, r.rental_date as rental_dates
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='dorothy' and c.last_name='taylor'

#22. Display the names of customers who have rented the film titled Ocean Luke.
select c.first_name,c.last_name, f.title as film_ocean_luke
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='ocean luke'

#23. Get the first name, last name, and email of customers who have rented
#more than 10 films.
select c.first_name,c.last_name,c.email
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
group by c.customer_id, c.first_name, c.last_name, c.email
having count(r.rental_id) > 10

#24. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 600 (600 dont exist so take 599)

select c.customer_id,f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=599

#25. List the rental date and return date for all rentals made by customer
#Susan Johnson (patricia)
select r.rental_date,r.return_date,c.first_name,c.last_name
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='patricia' and c.last_name='johnson'

#26. Display the film titles rented by the customer with customer_id 700.
select r.rental_date,r.return_date,c.first_name,c.last_name
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id

#27. Get the names of customers who have rented the film titled murder antitrust
select c.first_name,c.last_name, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='murder antitrust'

#28. Retrieve the rental date and rental duration for each rental made by
#Joseph Brown
select c.first_name,c.last_name,r.rental_date,f.rental_duration
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='joseph' and c.last_name='brown'

#29. List the film titles and rental dates for all rentals made by customer
#Michael Davis
select c.first_name,c.last_name,f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='michael' and c.last_name='davis'

#30. Display the first name, last name, and email of customers who have
#rented the film titled squad Fisherman
select c.first_name,c.last_name,c.email,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='squad fish'

#31. Get the film titles and rental dates for all rentals made on July 25, 2005.
select f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.rental_date='2005-07-25'

#32. Retrieve the film titles rented by the customer with customer_id 800.
select c.customer_id, c.first_name, c.last_name, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.customer_id=800

#33. List the rental date and return date for all rentals made by customer
#Barbara Taylor
select c.first_name,c.last_name,r.rental_date,r.return_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='barbara' and c.last_name='taylor'

#34. Display the names of customers who have rented the film titled &quot;Riders
#Zorro&quot;.
select c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='riders zoro'

#35. Get the first name, last name, and email of customers who have rented
#more than 8 films.
select c.first_name,c.last_name,c.email,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
having count(f.film_id)>8

#36. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 900.
select c.customer_id,c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=900

#37. List the rental date and rental duration for each rental made by
#customer &quot;Charles Harris&quot;.
select c.first_name,c.last_name,r.rental_date,f.rental_duration
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='charles' and c.last_name='harris'

#38. Display the film titles rented by the customer with customer_id 1000.
select c.customer_id, c.first_name, c.last_name, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1000

#39. Get the names of customers who have rented the film titled &quot;Casino
#Royale&quot;.
select c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='casino royale'
select title from film

#40. Retrieve the rental date and return date for each rental made by
#customer &quot;Lisa Anderson&quot;.
select c.first_name,c.last_name,r.rental_date,r.return_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='lisa' and c.last_name='anderson'

#41. List the film titles and rental dates for all rentals made by customer
#&quot;Matthew Smith&quot;.
select c.first_name,c.last_name,f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='matthew' and c.last_name='smith'

#42. Display the first name, last name, and email of customers who have
#rented the film titled &quot;Innocent Usual&quot;.
select c.first_name,c.last_name,c.email,f.title as 'film rented'
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='innocent usual'

#43. Get the film titles and rental dates for all rentals made on June 18, 2005.
select f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.rental_date='2005-06-18'

#44. Retrieve the film titles rented by the customer with customer_id 1100.
select c.customer_id,c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1100

#45. List the rental date and return date for all rentals made by customer
#&quot;Jennifer Lee&quot;

select c.first_name,c.last_name,r.rental_date,r.return_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='jennifer' and c.last_name='lee'

#46. Display the names of customers who have rented the film titled &quot;Inferno
#Kilometer&quot;.
select c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='inferno kilometer'

#47. Get the first name, last name, and email of customers who have rented
#more than 12 films.
select c.first_name,c.last_name,c.email,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
having count(f.title)>12

#48. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 1200.
select c.customer_id,c.first_name,c.last_name,c.email,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1200

#49. List the rental date and rental duration for each rental made by
#customer &quot;David Clark&quot;.
select c.first_name,c.last_name,r.rental_date,f.rental_duration
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='david' and c.last_name='clark'

#50. Display the film titles rented by the customer with customer_id 1300.
select c.customer_id,c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1300

#51. Get the names of customers who have rented the film titled Golden Groove
select c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='golden groove'

#52. Retrieve the rental date and return date for each rental made by
#customer &quot;Laura Martinez&quot;.
select c.first_name,c.last_name,r.rental_date,r.return_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='laura'

#53. List the film titles and rental dates for all rentals made by customer
#&quot;John Johnson&quot;.
select c.first_name,c.last_name,f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='john' and c.last_name='johnson'

#54. Display the first name, last name, and email of customers who have
#rented the film titled &quot;Spice Sorcerer&quot;.
select c.first_name,c.last_name,c.email
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='spice sorcerer'

#55. Get the film titles and rental dates for all rentals made on September 5,
#2005.
select f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.rental_date='2005-09-05'

#56. Retrieve the film titles rented by the customer with customer_id 1400.
select c.customer_id,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1400

#57. List the rental date and return date for all rentals made by customer
#Sarah Thomas.
select c.first_name,c.last_name,f.title,r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='sarah' and c.last_name='thomas'

#58. Display the names of customers who have rented the film titled &quot;Scream
#Human&quot;.
select c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='scream human'

#59. Get the first name, last name, and email of customers who have rented
#more than 15 films.
select c.first_name,c.last_name,c.email
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
having count(f.title>15)

#60. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 1500.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1500

#61. List the rental date and rental duration for each rental made by
#customer &quot;Paul Jackson&quot;.
select c.first_name,c.last_name,r.rental_date, f.rental_duration
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='paul' and c.last_name='jackson'

#62. Display the film titles rented by the customer with customer_id 1600.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1600

#63. Get the names of customers who have rented the film titled &quot;Princess
#Giant&quot;.
select c.first_name,c.last_name,f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='princess giant'

#64. Retrieve the rental date and return date for each rental made by
#customer &quot;Mary Harris&quot;.
select c.first_name,c.last_name,r.rental_date, r.return_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='mary' and c.last_name='harris'

#65. List the film titles and rental dates for all rentals made by customer
#&quot;Robert Smith&quot;.
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='robert' and c.last_name='smith'

#66. Display the first name, last name, and email of customers who have
#rented the film titled &quot;Matrix Family&quot;.
select c.first_name,c.last_name,c.email, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='matrix family'

#67. Get the film titles and rental dates for all rentals made on October 20,
#2005.
select r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.rental_date='2005-10-20'

#68. Retrieve the film titles rented by the customer with customer_id 1700.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1700

#69. List the rental date and return date for all rentals made by customer
#&quot;Donald Davis&quot;.
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='donald' and c.last_name='davis'

#70. Display the names of customers who have rented the film titled &quot;Chase
#Therapy&quot;.

select c.first_name,c.last_name,c.email, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='Chase Therapy'

#71. Get the first name, last name, and email of customers who have rented
#more than 18 films.
select c.first_name,c.last_name,c.email
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
having count(f.title>18)

#72. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 1800.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1800

#73. List the rental date and rental duration for each rental made by
#customer Amy Johnson

select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='amy' and c.last_name='johnson'

#74. Display the film titles rented by the customer with customer_id 1900.

select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=1900

#75. Get the names of customers who have rented the film titled Swordfish
#Tomatoes;.

select c.first_name,c.last_name,c.email, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='swordfish tomatoes'

#76. Retrieve the rental date and return date for each rental made by
#customer George Davis;.
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='George' and c.last_name='Davis'

#77. List the film titles and rental dates for all rentals made by customer
#Laura Anderson.
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='laura' and c.last_name='anderson'

#78. Display the first name, last name, and email of customers who have
#rented the film titled &quot;Doom Dancing&quot;.
select c.first_name,c.last_name,c.email, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='doom dancing'

#79. Get the film titles and rental dates for all rentals made on December 12,
#2005.
select r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where r.rental_date='2005-12-12'

#80. Retrieve the film titles rented by the customer with customer_id 2000.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=2000

#81. List the rental date and return date for all rentals made by customer
#Kevin Johnson.
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='kevin' and c.last_name='johnson'

#82. Display the names of customers who have rented the film titled
#Firehouse Vietnam.
select c.first_name,c.last_name,c.email, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='firehouse vietnam'

#83. Get the first name, last name, and email of customers who have rented
#more than 20 films.
select c.first_name,c.last_name,c.email
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
having count(f.title>20)

#84. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 2100.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=2100

#85. List the rental date and rental duration for each rental made by
#customer Nancy Davis
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='jennifer' and c.last_name='davis'

#86. Display the film titles rented by the customer with customer_id 2200.
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=2200

#87. Get the names of customers who have rented the film titled gangs pride
select c.customer_id,f.title, r.rental_date
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.customer_id=2200

#88. Retrieve the rental date and return date for each rental made by
#customer Thomas Johnson
select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='thomas' and c.last_name='johnson'

#89. List the film titles and rental dates for all rentals made by customer
#&quot;Sarah Harris&quot;.

select c.first_name,c.last_name,r.rental_date, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where c.first_name='Sarah' and c.last_name='harris'

#90. Display the first name, last name, and email of customers who have
#rented the film titled Frankenstein Stranger
select c.first_name,c.last_name,c.email, f.title
from customer c
join rental r
on c.customer_id=r.customer_id
join inventory i
on i.inventory_id=r.inventory_id
join film f
on f.film_id=i.film_id
where f.title='Frankenstein Stranger'

#91. Get the film titles and rental dates for all rentals made on November 8,
#2005.

#92. Retrieve the film titles rented by the customer with customer_id 2300.

#93. List the rental date and return date for all rentals made by customer
#Laura Taylor;

#94. Display the names of customers who have rented the film titled Intrigue
#Worst;

#95. Get the first name, last name, and email of customers who have rented
#more than 22 films.

#96. Retrieve the film titles and rental dates for all rentals made by the
#customer with customer_id 2400

#97. List the rental date and rental duration for each rental made by
#customer &quot;James Clark&quot;

#98. Display the film titles rented by the customer with customer_id 2500

#99. Get the names of customers who have rented the film titled &quot;Gang
#Terms&quot;

#100. Retrieve the rental date and return date for each rental made by
#customer &quot;Michelle Johnson&quot;