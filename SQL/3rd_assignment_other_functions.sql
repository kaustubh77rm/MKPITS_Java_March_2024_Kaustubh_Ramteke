1. **Retrieve the first 10 characters of the title of each film.**
select substring(title, 1, 10) 
as short_title
from film

2. **Convert the titles of all films to uppercase.**
select upper(title) 
as uppercase_title
from film

3. **Find the length of each film title.**
select length(title) 
as length_film 
from film

4. **Concatenate the first name and last name of each actor, separated by a space.**
select concat(first_name,' ', last_name) 
as first_last_name
from actor;

5. **Replace the word "Action" with "Thriller" in the film description.**
update film
set description = replace('Action', 'Thriller')

6. **Extract the domain name from the email addresses of all customers.**
select substring(email, locate('@', email) + 1) 
as domain_name
from customer

7. **Find all films whose title starts with the letter 'A'.**
select title
from film
where title like 'a%';

8. **Trim leading and trailing spaces from the first names of customers.**
select trime(first_name) 
as trimmed_first_name
from customer

9. **Find the position of the first occurrence of the word "GREAT" in the film description.**
select film_id, locate('great', description) 
as position
from film

10. **Reverse the first name of each customer.**
select customer_id, reverse(first_name) 
as reversed_first_name
from customer

11. **Round the rental rate of each film to 2 decimal places.**
select film_id, round(rental_rate, 2) 
as rounded_rental_rate
from film

12. **Calculate the square root of the replacement cost of each film.**
select film_id, sqrt(replacement_cost) 
as square_root_replacement_cost
from film

13. **Find the absolute value of the difference between rental duration and length for each film.**
select abs(length - rental_duration) 
as absolute_difference
from film;

14. **Raise the rental rate of each film to the power of 3.**

15. **Get the ceiling value of the replacement cost of each film.**

16. **Get the floor value of the replacement cost of each film.**

17. **Calculate the modulus (remainder) of the rental duration divided by 3 for each film.**

18. **Get the highest rental rate of all films.**
select max(rental_rate)
from film

19. **Get the lowest replacement cost of all films.**
select min(replacement_cost)
from film

20. **Calculate the average length of all films.**
select avg(length)
from film

21. **Extract the year from the rental date for each rental.**
select rental_id,year(rental_date)
from rental

22. **Find the day of the week for each rental date.**
select rental_id,day(rental_date)
from rental

23. **Calculate the age of each customer based on their create_date.**
select customer_id, datediff(curdate(),create_date) as 'age'
from customer

24. **Add 7 days to the rental date to get the return due date for each rental.**
select rental_id, date_add(rental_date, interval 7 day) as return_due_date
from rental

25. **Get the month name from the rental date for each rental.**
select rental_id, monthname(rental_date)
from rental

26. **Extract the hour from the last update timestamp of each film.**
select hour(last_update)
from film

27. **Calculate the difference in days between the return date and rental date for each rental.**
select rental_id,datediff(return_date,rental_date) as date_difference
from rental

28. **Find the first day of the month for each rental date.**
select rental_id, rental_date, date_format(rental_date, '%y-%m-01') as first_day_of_month
from rental;

29. **Format the rental date as 'DD-MM-YYYY' for each rental.**
select rental_id, date_format(rental_date, '%d-%m-%Y') as formatted_rental_date
from rental

30. **Extract the quarter from the rental date for each rental.**
select rental_id, rental_date, quarter(rental_date) as rental_quarter
from rental

31. **Find the ASCII value of the first character of each film title.**
select film_id, ascii(title)
from film

32. **Return the binary representation of the film_id for each film.**
select bin(film_id)
from film

33. **Convert the rental duration of each film to a hexadecimal value.**
select hex(rental_duration)
from film

34. **Find all films with a replacement cost that is a power of 2.**

35. **Check if the length of the film title is even or odd.**
select title, 
case 
when length(title) % 2 = 0 then 'even'
else 'odd'
end as title_length_parity
from film;

36. **Find all films with a rental rate greater than 3 and categorize them as 'High' or 'Low'.**
select film_id, rental_rate,
case 
when rental_rate > 3 
then 'High'
else 'Low'
end as rental_rate_category
from film;

37. **Return the IP address equivalent of the film_id for the first 10 films.**
select film_id, inet_ntoa(film_id) as ip_address
from film
limit 10;

38. **Select the 3rd character of each film title.**
select title, substring(title,3,1) as third_character
from film; #3=starting point , 1=length from starting point

#39. **Return the Unicode code point of the first character of each actor's first name.**
select actor_id, ascii(left(first_name, 1)) as unicode_code_point
from actor

40. **Convert the rental rate of each film to a binary string.**
select film_id, bin(rental_rate)
from film
