#bank dbcreate database BankDB;
use BankDB;

#Create following tables and insert data
#Account - Account_No pk, Name u, Address, City default, Balance check
#Transactions - Account_No fk, Amount check , Transaction_Type enum, Date
#name,adress,city,balance drop table Transaction; 
Create Table Account(
Branch_Name varchar(25) ,
Account_No varchar(20) primary key,
Name varchar(25) unique,
Address varchar(25),
City char(20) default 'Nagpur',
Balance int check(Balance>=0),
Phone numeric
); 
select * from Account;

desc Account;
INSERT INTO Account values ('State Bank Of India',' 12234334', 'KP Deshmukh' , 'Shankar Nagar', 'Nagpur',50000 , 9561481249);
INSERT INTO Account values ('HDFC Bank', '12554656', 'Jhon Bell' ,'Ram Nagar', 'Wardha', 30000 , 7350631655);
INSERT INTO Account values ('Axix Bank', '56789', 'Aniket Bhise' ,'Khole Layout', 'Yavatmal',100000 , 9860446600);
INSERT INTO Account values ('Union Bank Of India', '12456477', 'Alfa Romeo' ,'Mc Lyon', 'London',40000 , 9309179062);
INSERT INTO Account values('Bank of Maharashtra', '12345', 'Shyam Banot', 'Sai Nagar', 'Pune', 35000, 8800534571);

Create Table Transaction(
Account_No varchar(20),
Amount int check(Amount>=0),
TransactionDate date default (CURRENT_DATE()) ,
TransactionType enum('Credited','Debited'),
constraint fk_acooun_no foreign key(Account_No) references Account(Account_No)
); 
select * from Transaction;
desc Transaction;
insert into Transaction(account_no,amount,transactiontype) 
values('12345', 2000 ,  'Credited');
delete from transaction
where accountno='12345'

### Problem 1
**Problem Statement**: Retrieve the names and addresses of all account holders in 'New York' (pune).
select a.name,a.address,a.city
from account a
where a.city='pune'

### Problem 2
**Problem Statement**: Find the total balance of all accounts.
select sum(a.balance) 
from account a

### Problem 3
**Problem Statement**: List all transactions of account number '12345' 
sorted by date in descending order.
select *
from transaction t
where t.account_no='12345'

### Problem 4
#**Problem Statement**: Find the names of account holders who have made a 
#transaction greater than $500.
select a.name, a.account_no, t.amount
from account a
join transaction t
on t.account_no = a.account_no
where t.amount>500
group by a.name

### Problem 5
#**Problem Statement**: Retrieve the account number and balance of the account with 
#the highest balance.
select a.account_no, max(a.balance)
from account a

### Problem 6
#**Problem Statement**: Find the average transaction amount for 'Debit' transactions.
#**Expected Result**:
select avg(t.amount) as 'avg debit amount'
from transaction t

| Avg_Debit_Amount |
|------------------|
| 150.75           |

### Problem 7
#**Problem Statement**: List the account numbers that have not made any transactions.
#**Expected Result**:
select  t.account_no
from transaction t
where t.amount = null
#| Account_No |
#|------------|
#| 11223      |
#| 33445      |

### Problem 8
#**Problem Statement**: Retrieve the total number of transactions made in the month of May 2024.
select count(t.transactiondate) as 'total transactions'
from transaction t
where t.transactiondate>='2024-05-01' and t.transactiondate<'2024-06-01'
#**Expected Result**:
#| Total_Transactions |
#|--------------------|
#| 75                 |

### Problem 9
#**Problem Statement**: Find the balance of the account with account number '56789'.
select a.balance
from account a
where a.account_no=56789

#**Expected Result**:
#| Balance |
#|---------|
#| 3500    |

### Problem 10
#**Problem Statement**: List the names and total transaction amounts of 
#account holders who have made transactions totalling more than $1000.
select a.name, sum(t.amount) as 'total transaction amount'
from account a
left outer join transaction t
on a.account_no = t.account_no
where t.amount>'1000'
group by a.name

#**Expected Result**:
#| Name          | Total_Amount |
#|---------------|--------------|
#| John Doe      | 1500         |
#| Emily Davis   | 1200         |