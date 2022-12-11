use mahindra;
create table menu
(
	item_no int,
	cuisine varchar(15),
    dish varchar (20),
    cost float
);

create table orders
(
	order_no int,
    table_no int,
	customer_name varchar(20),
    waiter varchar(20),
    item_no int,
    order_desc varchar(30)
);

create table customers
(
	customer_name varchar(20),
    order_no int
);

alter table menu add primary key(item_no);
alter table orders add primary key(order_no);
alter table customers add primary key(customer_name);


insert into menu values
(1, 'Maharashtrian', 'Misal Pav', 100),
(2, 'Maharashtrian', 'Pav Bhaji', 120),
(3, 'Maharashtrian', 'Puran Poli', 250),
(4, 'Chinese', 'Fried Rice', 120),
(5, 'Chinese', 'Schezwan Rice', 140),
(6, 'Chinese', 'Hakka Noodles', 140),
(7, 'Maharashtrian', 'Fish Thali', 500),
(8, 'Maharashtrian', 'Chicken Thali', 500);

insert into orders values
(001 , 5, 'Pooja', 'Ramu', 8 ,'2 X Chicken Thali'),
(002 , 1, 'Pragati', 'Chotu',1,  '2 X Misal Pav'),
(003 , 3, 'Nachiket', 'Bunty', 2, '2 X Pav Bhaji'),
(004 , 4, 'Prachi', 'Chotu', 7,  '2 X Fish Thali'),
(005 , 6, 'Nikita', 'Chintu', 6, '2 X Hakka Noodles');

insert into customers values
('Pooja', 001),
('Pragati', 002),
('Nachiket', 003),
('Prachi', 004),
('Nikita', 005);

alter table orders add foreign key (customer_name) references customers(customer_name);
alter table customers add foreign key (order_no) references orders(order_no);
alter table orders add foreign key (item_no) references menu(item_no);


select* from orders where waiter = 'Chotu' or 'Ramu';

select *  from menu limit 5;

select * from orders
group by item_no;

select dish , cost from menu
where cost=
(select max(cost) from menu);

select * from orders left join customers on orders.order_no = customers.order_no;

create table tempp as select * from menu where cuisine = 'Chinese';
select * from tempp;
drop table tempp;
