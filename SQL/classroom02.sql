create table ourDB (
    Name char(10),
    Address varchar(25),
    City char(20)
);
insert into ourdb values('Kaustubh','Prabhu Colony','Amravati');
insert into ourdb values('Amit','Ramdaspeth','Nagpur');
insert into ourdb values('Kharanshu','Bengali Camp','Chandrapur'); 
insert into ourdb values('Shubham','Gondwana','Gadchiroli') ;
insert into ourdb values('Vaishali','Ambedkar Nagar','Wardha');
insert into ourdb values('Sanved','Budhwar Peth','Pune');
select * from ourDB

desc ourdb

create table ourDB2 (
    MarkDetails int(10),
    RollNo int(4),
    Physics int(4),
    Chemistry int(4),
    Maths int(4)
);
insert into ourdb2 values(92,3,88,67,86);
insert into ourdb2 values(82,4,85,64,76);
insert into ourdb2 values(92,5,88,77,86);
insert into ourdb2 values(96,6,95,94,76);
select * from ourdb2

