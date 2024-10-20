CREATE TABLE DEPARTMENT(
	DEPT_ID VARCHAR(20) PRIMARY KEY,
	DEPT_NAME VARCHAR(30),
	DEPT_HEAD VARCHAR(50)
);

INSERT INTO DEPARTMENT (DEPT_ID, DEPT_NAME, DEPT_HEAD) VALUES
('CIV','Civil Engineering','Meganathan'),
('MECH','Mechanical Engineering','Meganathan'),
('CSE','Computer Science Engineering','Swarnalath'),
('IT','Information Technology','Kalai veni'),
('ECE','Electrical&Comm. Engineering','Dhanasekeran'),
('EEE','Electrical & Electronic Engn','Mugilan');
DROP TABLE FORGINTABLE;
CREATE TABLE FORGINTABLE(
	REG_NO INT PRIMARY KEY,
	STUDENT_NAME VARCHAR(50),
	DEPT_ID VARCHAR(50),
	AGE INT,
    FOREIGN KEY (DEPT_ID)REFERENCES DEPARTMENT(DEPT_ID)
);

INSERT INTO FORGINTABLE (REG_NO, STUDENT_NAME, DEPT_ID,AGE) VALUES
(1001,'Anantha Babu','IT',23),
(1002,'Ajith','ECE',22),
(1003,'Ashif','CSE',23),
(1004,'Anitha','IT',20),
(1005,'Bala','EEE',21),
(1006,'Mugeswari','EEE',23);

DELETE FROM DEPARTMENT WHERE DEPT_ID='IT';
SELECT * FROM FORGINTABLE;

