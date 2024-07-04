--use sakila
--to view list of tables in current db
show tables
select * from actor_info
desc actor_info

select first_name,film_info from actor_info

select title as "Movie Title",replacement_cost+10 as "Incremented"
select distinct film_id from film_actor
select * from film where rental_duration>=7
select * from actor_info where first_name='NIck' AND last_name='stallone'
select * from actor_info where first_name='NIck' or last_name='stallone'

select * from film
where rental_duration between 4 and 7

select * from actor_info
where first_name='nick' or last_name='stallone'

select * from actor_info 
where first_name in('nick','penelope','bette')

select * from actor_info 
where first_name like 'A%'

select * from actor_info 
where first_name like '____' #four char name return

select * from film where rating is not null

select * from actor
order by actor_id