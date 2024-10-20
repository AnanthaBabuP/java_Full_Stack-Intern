DROP TABLE STUDENTS;
CREATE TABLE STUDENTS_1(
	ID INT AUTO_INCREMENT UNIQUE,
	STUDENT_ID INT ,
	STUDENT_NAME VARCHAR(50),
    EMAIL_ID VARCHAR(50),
    PLACE VARCHAR(50),
	AGE INT,
	PRIMARY KEY(STUDENT_ID)
);
CREATE TABLE STUDENTS_2(
	ID INT AUTO_INCREMENT UNIQUE,
	STUDENT_ID INT ,
	STUDENT_NAME VARCHAR(50),
    EMAIL_ID VARCHAR(50),
    PLACE VARCHAR(50),
	AGE INT,
	PRIMARY KEY(STUDENT_ID,ID)
);

DESCRIBE STUDENTS_1;
	-- ( OR ) --
    
CREATE TABLE STUDENTS(
	ID INT AUTO_INCREMENT UNIQUE,
	STUDENT_ID INT PRIMARY KEY,
	STUDENT_NAME VARCHAR(50),
    EMAIL_ID VARCHAR(50),
    PLACE VARCHAR(50),
	AGE INT
);

DESCRIBE STUDENTS;

INSERT INTO STUDENTS(STUDENT_ID,STUDENT_NAME,EMAIL_ID,AGE) VALUES 
(1001,'Anantha Babu','ananthababu@gmail.com',23),
(1002,'Ajith','ajith@gmail.com',22),
(1003,'Ashif','ashif@gmail.com',23),
(1004,'Anitha','anith@gmail.com',20),
(1005,'Bala','bala@gmail.com',21),
(1006,'Mugeswari','mugeswari@gmail.com',23);


UPDATE STUDENTS SET PLACE='CHENNAI' WHERE STUDENT_ID=1001;
UPDATE STUDENTS SET PLACE='MADURAI' WHERE STUDENT_ID=1002;
UPDATE STUDENTS SET PLACE='MADURAI' WHERE STUDENT_ID=1003;
UPDATE STUDENTS SET PLACE='TENKASI' WHERE STUDENT_ID=1004;
UPDATE STUDENTS SET PLACE='KERALA' WHERE STUDENT_ID=1005;
UPDATE STUDENTS SET PLACE='KERALA' WHERE STUDENT_ID=1006;


SELECT * FROM STUDENTS LIMIT 2,3;