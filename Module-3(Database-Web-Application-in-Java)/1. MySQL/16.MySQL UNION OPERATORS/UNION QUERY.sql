-----------------------------------
---------- TABLE CREATION ---------
----------------------------------- 
CREATE TABLE unionTable_1(
	id int unique auto_increment,
    student_id int primary key,
    student_name varchar(50),
    age int,
    gender varchar(10),
    department varchar(50)
);

CREATE TABLE unionTable_2(
	id int unique auto_increment,
    student_id int primary key,
    student_name varchar(50),
    age int,
    gender varchar(10),
    department varchar(50)
);
  -----------------------------------
---------- INSERT PROCESS -----------
-------------------------------------

insert into unionTable_1(student_id, student_name,age,gender,department) values
(1001,'Ananth',23,'male','maths'),
(1002,'Ajith',25,'male','cs'),
(1003,'Anitha',23,'female','cs'),
(1004,'Bala',24,'male','science'),
(1005,'Ashif',24,'male','tamil'),
(1006,'Amir',23,'male','science'),
(1007,'Kavia',22,'female','maths'),
(1008,'Murali',22,'male','cs'),
(1009,'Sartha',21,'female','science'),
(1010,'Kamal Nath',21,'male','maths');

insert into unionTable_2(student_id, student_name,age,gender,department) values
(1001,'Ananth',23,'male','maths'),
(1002,'Ajith',25,'male','cs'),
(1003,'Anitha',23,'female','cs'),
(1004,'Bala',24,'male','science'),
(1005,'Ashif',24,'male','tamil'),
(1006,'Amir',23,'male','science'),
(1007,'Kavia',22,'female','maths'),
(1008,'Murali',22,'male','cs'),
(1009,'Sartha',21,'female','science'),
(1010,'Kamal Nath',21,'male','maths');


------------------------------------
---------- UNION PROCESS -----------
-------------------------------------

select * from unionTable_1
union
select * from unionTable_2;

------------------------------------
-------- UNION ALL PROCESS ---------
-------------------------------------
select * from unionTable_1
union all
select * from unionTable_2;
