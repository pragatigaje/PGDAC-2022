use cdac_db;

drop procedure addproc;
delimiter //
create  procedure addRow(x TEXT, y TEXT)
begin 
	 insert into info (sname,city) values(x,y);
end;//

alter table info add column marks int;

delimiter //
create function getAvg()
-- begin
-- 	declare avg int;
-- 	avg = select sum(marks)/count(*) as "avg" from info;
--     return avg;
-- end;//-- 