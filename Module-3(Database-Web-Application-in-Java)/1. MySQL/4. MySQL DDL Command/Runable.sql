create database student_details;

use student_details;
create table student(student_id int ,student_name varchar(50),department varchar(20));

describe student;

INSERT INTO STUDENT (STUDENT_ID,STUDENT_NAME,DEPARTMENT) 
	VALUES ('1001','ANANDH','COMPUTER SCIENCE'),
    ('1002','SARATH','COMPUTER SCIENCE');
    
show tables;
ALTER TABLE STUDENT ADD COLUMN AGE VARCHAR(20),ADD COLUMN GENDER VARCHAR(10);
describe STUDENT;
SELECT * FROM STUDENT order by STUDENT_ID ASC;
INSERT INTO STUDENT VALUES(1001,'SUMATHI','MATHS','25','FEMALE');
set sql_safe_updates=0;
UPDATE STUDENT SET department='SCIENCE' WHERE student_id=1001;

select * from student where student_name like 'S_R_TH';

select * from student where student_name like '[s]%';

DELETE FROM STUDENT WHERE STUDENT_ID=1001;

select * from student;

select student_name,department from student ;

insert into student values(1001,'sumathi','science',25,'female');
insert into student values(1003,'ravi','history',23,'male'),
(1004,'keerthi','history',21,'female');
select student_name from student where department='history' and gender='male';

select * from student limit 2,3;
 select distinct student_id,student_name,department from student;
  select all student_id,student_name,department from student;
