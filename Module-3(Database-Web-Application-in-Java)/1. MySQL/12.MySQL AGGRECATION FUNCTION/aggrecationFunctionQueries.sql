SELECT * FROM student_details.employee_details where team is null;

set sql_safe_updates = 0;
update employee_details set team=null where team='';