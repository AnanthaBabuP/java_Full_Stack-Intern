select adddate('1999-06-28',10); -- // Add 10 dates // 1999-07-08
select addtime('15:06:30','45'); -- // Add 45 secods // 15:07:15
select curdate();
select current_date();
select current_time();
select current_timestamp();
select curtime();
select date_add('2023-12-06',interval 10 day); 
select date_add('2023-12-06',interval 10 month);
select date_add('2023-12-06',interval 10 year);

select date_sub('2023-12-06',interval 10 day); 
select date_sub('2023-12-06',interval 10 month);
select date_sub('2023-12-06',interval 10 year);

select datediff('2015-05-20','2015-04-18');
select date_format('2015-05-20','%Y-%M-%D');
select date_format('2015-05-20','%y-%m-%d');
select date('20150625');

select day('20150625');
select month('20150625');
select year('20150625');

select dayname('2025-06-25');
select dayofmonth('2025-06-25');
select dayofweek('2025-06-25'); 
select dayofyear('2025-06-25'); -- 365-reming date for givenn

select last_day('2015-02-12');
select localtime();
select localtimestamp();
select makedate(2024,2);
select maketime(10,30,15);
select microsecond('10:30:15.56446');

select now();
select hour(now());
select minute(now());
select second(now());
select monthname(now());

select period_add('201406',06);
select period_add('201406',02);
select period_diff('201406',02);

select quarter("2015-02-05");
select quarter("2015-05-06");
select quarter("2015-07-07");
select quarter("2015-11-08");

select sec_to_time(2250);
select str_to_date('december 06 2013','%M %D %Y');
select subdate('1999-06-28',10);
select subtime('15:06:30','45'); 
select sysdate();
select time_format('15:12:12','%H:%i:%S');
select time_to_sec('15:12:12');
select time(now());
select timediff(time(now()),'02:30:12');
select timestamp(now());
select timestampadd(day,10,now());
select timestampadd(month,10,now());
select timestampadd(year,10,now());

select timestampdiff(day,'2024-09-10 15:31:14',now());
select timestampdiff(month,'2024-05-10 15:31:14',now());
select timestampdiff(year,'2022-09-10 15:31:14',now());

select utc_date();
select utc_time();
select utc_timestamp();

select week('2021-05-01'); -- calculate to year of week
select weekofyear('2021-05-01');
select yearweek('2021-05-01');
select weekday('2021-05-01'); -- 