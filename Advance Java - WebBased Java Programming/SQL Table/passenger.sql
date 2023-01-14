use cdac_db;

create table passenger
(
id int primary key auto_increment,
uid int default 0,
name varchar(20),
gender varchar(10),
country varchar(10),
about varchar(100),
maillist varchar(10) default "false"
);

drop table passenger;
select * from passenger;