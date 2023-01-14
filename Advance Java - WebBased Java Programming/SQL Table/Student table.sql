use cdac_db;

insert into student values(101, "Pragati", 95, '2001-11-19');
insert into student values(102, "Pooja", 94, '1999-06-14');
insert into student values(103, "Prachi", 91, '1995-07-04');
insert into student values(104, "Nikhil", 94, '1992-12-20');
insert into student values(105, "Shri", 91, '1999-09-03');

drop procedure insertRec;
delimiter //
create  procedure insertRec(x int, y varchar(20), z int, d date)
begin 
	 insert into student values(x,y,z,d);
end;//
