SELECT * FROM student_details.students;
CREATE INDEX STUDENT_INDEX ON STUDENTS(ID); 
SHOW INDEXES FROM STUDENTS;
DROP INDEX STUDENT_INDEX ON STUDENTS;

CREATE UNIQUE INDEX STUDENT_INDEX ON STUDENTS(ID,student_id); 
SHOW INDEXES FROM STUDENTS;
DROP INDEX STUDENT_INDEX ON STUDENTS;