use cdac_db;

create table expense(
id int primary key auto_increment,
item varchar(25),
price float(10,2),
quantity int,
edate date,
uid int default 0);

desc expense;
drop table expense;
select * from expense;

truncate table expense;