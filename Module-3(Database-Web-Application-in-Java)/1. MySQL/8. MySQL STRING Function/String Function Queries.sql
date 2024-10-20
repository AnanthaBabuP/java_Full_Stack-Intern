select concat("hello"," ","World"); -- // hello World

select instr("hellow world",'e'); -- //2
select instr("hellow world",'w'); -- //6

select length("hellow world"); -- //12

select format('20151625','##,###,###');

select upper("Hellow World");
select lower("Hellow World");

select replace("Hellow World",'o','!');

select ltrim("               Hellow World");
select rtrim("Hellow World               ");
select trim("       Hellow World         ");
select concat("hello",ltrim("       World    "));
select concat("hello",rtrim("       World    "));


select left("Hellow World",5);
select right("Hellow World",5);
select mid("Hellow World",5);
select mid("Hellow World",3,5);

select substring('Hellow World!',5);

select substring_index('Hellow World!','l',1);
select substring_index('Hellow World!','l',2);
select substring_index('Hellow World!','l',3);
select substring_index('Hellow World!','l',4);

select ascii('A');
select char(65);