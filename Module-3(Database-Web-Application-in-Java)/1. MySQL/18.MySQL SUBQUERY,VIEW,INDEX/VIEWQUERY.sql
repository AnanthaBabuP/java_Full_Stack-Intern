------------------------------------------------- 
------------- VIEW CRATION ---------------------- 
------------------------------------------------- 

CREATE VIEW STUDENT_VIEW AS SELECT
	T1.REG_NO AS 'STUDENT_ID',
    T1.STUDENT_NAME AS 'STUDENT_NAME',
    T1.DEPT_ID AS 'DEPARTMENT_ID',
    T2.DEPT_NAME AS 'DEPARTMENT_NAME',
    T2.DEPT_HEAD AS 'DEPARTMENT_INCHARCH',
    T1.AGE 
    FROM FORGINTABLE  T1
    LEFT JOIN DEPARTMENT T2 ON
		T2.DEPT_ID = T1.DEPT_ID;
------------------------------------------------- 
------------- ALTER VIEW  ---------------------- 
------------------------------------------------- 
ALTER VIEW STUDENT_VIEW AS SELECT * FROM DEPARTMENT;
			-- ( OR ) --
CREATE OR REPLACE VIEW STUDENT_VIEW AS SELECT * FROM FORGINTABLE;

------------------------------------------------- 
------------- DROP VIEW  ---------------------- 
------------------------------------------------- 

DROP VIEW STUDENT_VIEW;

------------------------------------------------- 
------------- SELECT VIEW  ---------------------- 
------------------------------------------------- 
SELECT * FROM STUDENT_VIEW;