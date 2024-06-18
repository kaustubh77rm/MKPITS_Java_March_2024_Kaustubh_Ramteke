create database shop_kaustubh;
use shop_kaustubh;

#Customer - Customer_Id, Name, Address, City
Create table Customer(
Customer_id char(5) primary key, 
Customer_Name Varchar(25), 
City char(20),
Address varchar(25)
);
Insert Into Customer values('C01','Babulal', 'Mumbai', 'Virar Vasai');
Insert Into Customer values('C02','Komal', 'Chandrapur', 'Ram Nagar');
Insert Into Customer values('C03','Aditya', 'Pune', 'Ashish Nagar');
Insert Into Customer values('C04','Rohit', 'Thane', 'Shankar Nagar');
Insert Into Customer values('C05','Mahendra', 'Latur', 'Gokuldham');
select * from Customer;
drop table customer

#Supplier - Supplier_Id, Name, Address, City
Create table Supplier
(
Supplier_id char(5) primary key,
Supplier_Name varchar(25),
City varchar(20),
Address varchar(20)
);
Insert into Supplier Values('101', 'Ian Bell', 'Pune', 'Katraj');
Insert into Supplier Values('102', 'Nick Roll', 'Mumbai', 'Lokhandwala');
Insert into Supplier Values('103', 'Don Terry', 'Banglore', 'Swai City');
Insert Into Supplier Values('104', 'Jack Khan', 'Hyderabad', 'Fortune Society');
Insert into Supplier Values('105', 'Mark Boucher', 'Amravati', 'Dream Land');
select * from Supplier;

#ProductMaster - Product_Id, Name, Price, QOH/quantity on hand
create table ProductMaster(
Product_id char(5) primary key,   
Product_Name varchar(20),
price int(10),
Category varchar(25),
quantity_on_hand int,
Supplier_id char(5),
constraint fk_supplier_id foreign key(Supplier_id) references Supplier(Supplier_id)
);

Insert into ProductMaster values('1', 'TV',20000, 'Electronics', '15', '101'); 
Insert into ProductMaster values('2', 'Laptop',25000, 'Electronics', '5', '102');
Insert into ProductMaster values('3', 'Shirt',1500, 'Clothes', '50', '103');  
Insert into ProductMaster values('4', 'Car',450000, 'Vehicle', '10', '104');
Insert into ProductMaster values('5', 'Table',1200, 'Furniture', '20', '105');
select * from ProductMaster;
 
#Sale - Sale_Id, Product_id, Customer_id, Quantity, Date
create table sale
(
Sale_id  char(10), 
Product_id char(5),
Customer_id char(5), 
Quantity int,
date_sale date, 
constraint fk_p_id foreign key(Product_id) references ProductMaster(Product_id),
constraint fk_c_id foreign key(Customer_id) references Customer(Customer_id)
);

Insert Into Sale values('555','5','C01',20,'2021-04-15');
Insert Into Sale values('666','2','C02',120,'2022-04-15');
Insert Into Sale values('777','3','C03',50,'2023-05-10');
Insert Into Sale values('888','1','C04',70,'2023-04-09');
Insert Into Sale values('999','4','C05',990,'2021-04-01');
select * from Sale;

#Purchase - Purchase_Id, Product_id, Customer_id, Quantity, Date 
Create table Purchase(
Purchase_id char(5), 
Product_id char(5), 
Customer_id char(5), 
Quantity int,
Price int, 
Date date,
Status varchar(20),
constraint fk_customer_id foreign key(Customer_id) references Customer(Customer_id),
constraint fk_Product_id foreign key(Product_id) references ProductMaster(Product_id)
);
Insert Into Purchase values('2001', '1','C02',  15, 10000,'2024-05-23' , 'Pending');
Insert Into Purchase values('2002', '2','C03',  50, 50000, '2023-08-22' , 'Deliverd');
Insert Into Purchase values('2003', '3','C05',  20, 10000, '2022-01-25', 'Shipped');
Insert Into Purchase values('2004', '4','C04',  120, 10000, '2024-05-04', 'Canceled');
Insert Into Purchase values('2005', '5','C04',  150, 10000, '2021-09-11', 'Shipped');
select * from Purchase; 

#Try following queries
### Problem 1
#**Problem Statement**: Retrieve the names and addresses of all suppliers in 'Los Angeles'.
#(aapan gheu 'pune')
#**Expected Result**:
select s.city as 'city',s.supplier_id as 'id', s.supplier_name as 'supplier name'
from supplier s
where s.city='pune'

### Problem 2
#**Problem Statement**: Find the total quantity of products sold.
select sum(p.quantity_on_hand)  as 'total quantity of products sold'
from productmaster p

### Problem 3
#**Problem Statement**: List all purchases of product ID 'P001' sorted by date in ascending order.
#aapan gheu product id = 1 

select * 
from purchase p
where p.product_id='1'

### Problem 4
#**Problem Statement**: Find the names of products that have been sold more than 100 times.
#**Expected Result**:
select p.product_name 
from productmaster p
where p.quantity_on_hand>=100

### Problem 5
#**Problem Statement**: Retrieve the product ID and name of the product with the highest price.
#**SQL Query**:
select p.product_id,p.product_name, max(price) 
from productmaster p

#**Expected Result**:
#```
#| Product_Id | Name          |
#|------------|---------------|
#| P009       | Luxury Item   |


### Problem 6
#**Problem Statement**: Find the average price of products in the product master.
select avg(p.price) as 'average price'
from productmaster p

#**Expected Result**:
#| Avg_Product_Price |
#|-------------------|
#| 299.50            |
#```

### Problem 7
#**Problem Statement**: List the product IDs that have not been sold.
select p.product_id 
from productmaster p
where p.supplier_id=null

#**Expected Result**:

#| Product_Id |
#| P003       |
#| P007       |

### Problem 8
#**Problem Statement**: Retrieve the total number of sales made in the month of June 2024 ('may 2023').
select sum(s.quantity) as 'total sales'
from sale s
where s.date_sale >= '2023-05-01' and s.date_sale < '2023-06-01';

#**Expected Result**:
#| Total_Sales |
#|-------------|
#| 150         |

### Problem 9
#**Problem Statement**: Find the quantity on hand (QOH) of the product with product ID 'P005' ('1' gheu).
select p.quantity_on_hand
from productmaster p 
where p.product_id='1'

#**Expected Result**:
#| QOH  |
#| 120  |

### Problem 10
#**Problem Statement**: List names and total quantities purchased of products 
#that have been purchased more than 200 times.
select p.product_name as 'name', p.quantity_on_hand as 'total quantity purchased'
from productmaster p
where p.quantity_on_hand>200

#**Expected Result**:
#| Name          | Total_Quantity_Purchased |
#|---------------|--------------------------|
#| Widget A      | 350                      |
#| Gadget B      | 220                      |