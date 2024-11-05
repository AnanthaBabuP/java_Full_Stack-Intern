create database springbootdb;
use springbootdb;

show tables;

Select * FROM PRODUCT;
----------------------------------------------------
-------------- LapTop Table Creation and Process ----
-----------------------------------------------------
Create table Laptop
(
	id int,
    name varchar(20),
    price double
);


Insert into laptop Values(1,'dell',55000.25);
Insert into laptop Values(2,'Apple',67000.52);
Insert into laptop Values(3,'Toshiba',47000.25);
Insert into laptop Values(4,'Acer',32500.45);

SELECT * FROM springbootdb.laptop;

SELECT * FROM hibernate_sequence;

drop table laptop;
---------------------------------------------------------------
---------------------------------------------------------------

set sql_safe_updates=0;
DELETE FROM PRODUCT WHERE pname is null; 