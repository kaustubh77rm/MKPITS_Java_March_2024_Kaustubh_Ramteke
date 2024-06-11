#database of shop
create table ProductMaster (
    Product_ID int (4),
    Product_Name char(15),
    Category char(15),
    Price int(20),
    Quantity int(5) 
);
insert into ProductMaster values(1,'fevicol','glue',50,90);
insert into ProductMaster values(2,'super glue','glue',10,150);
insert into ProductMaster values(3,'quick glue','glue',20,40);

select * from ProductMaster

create table SupplierMaster (
    Supplier_ID int (4),
    Supplier_Name char(15),
    Contact bigint(150),
    Address char(22) 
);
insert into SupplierMaster values(1,'jagdish',934355,'Mumbai');
insert into SupplierMaster values(2,'ashoka',834532,'Bangalore');
insert into SupplierMaster values(3,'chandu',708366,'Pune');

select * from SupplierMaster

create table CustomerMaster (
    Customer_ID int (4),
    Customer_Name char(15),
    Contact bigint(150),
    Address char(22) 
);
insert into CustomerMaster values(1,'rahul',353355,'akola');
insert into CustomerMaster values(2,'ashay',233532,'pune');
insert into CustomerMaster values(3,'tanay',408966,'kalyan');

select * from CustomerMaster

#SalesProduct (SalesID, CustomerID, ProductID, SalesDate)
create table SalesProduct (
    Sales_ID int (4),
    Customer_ID int(15),
    Product_ID int(150),
    SalesDate char(22) 
);
insert into SalesProduct values(1,12,355,'1 Jan 21');
insert into SalesProduct values(2,13,355,'12 Mar 23');
insert into SalesProduct values(3,14,355,'21 Feb 22');

select * from SalesProduct

#OrderProduct (OrderID, SupplierID, ProductID, OrderDate)
create table OrderProduct (
    Order_ID int (4),
    Supplier_ID int(15),
    Product_ID int(150),
    OrderDate char(22) 
);
insert into OrderProduct values(1,12,667,'5 Jan 21');
insert into OrderProduct values(2,13,876,'30 Mar 23');
insert into OrderProduct values(3,14,983,'28 Feb 22');

select * from OrderProduct