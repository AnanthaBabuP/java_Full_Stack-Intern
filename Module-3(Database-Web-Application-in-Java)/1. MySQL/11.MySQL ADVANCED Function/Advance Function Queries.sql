select bin(15);
select binary('MySQL');
select cast('20220518' AS date);
select convert('20220518',date);

select conv(15,10,2); -- // 2 ref BIN
select conv(25,10,8); -- // 8 ref OCTAL
select conv(25,10,16);-- // 16 ref DEC

select coalesce(null,null,'b','c','d',null);

select if(10>5, '10 is big','5 is big');

select ifnull(null,'**********');
use student_details;
select * from student;
insert into student (student_id,department,age) values (1006,'maths',26);

select student_id,ifNull(student_name,'###') from student;