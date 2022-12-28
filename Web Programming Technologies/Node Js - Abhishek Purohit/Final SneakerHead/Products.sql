create database productrequest;

use productrequest;

create table product(
id char(2),
brand varchar(10),
info varchar(100),
price int,
url varchar(100)
);

drop table product;

select * from product;

insert into product values
("J1","Jordan", "Air Jordan 1 Mid SEs" , 11865,'/J11.jpg'),
("J2","Jordan", "Air Jordan 1 Mid SE Craft" , 11867,'/J21.jpg'),
("J3","Jordan", "Air Jordan 1 Zoom CMFT" , 11297,'/J31.jpg'),
("J4","Jordan", "Air Jordan 1 Retro OG" , 15995,'/J41.jpg'),
("A1","Adidas", "SUPERNOVA 2 RUNNING SHOES" , 6995,'/A11.jpg'),
("A2","Adidas", "NMD_R1 SHOES" , 12499,'/A21.jpg'),
("A3","Adidas", "ZX 8000 PARLEY SHOES" , 13999,'/A31.jpg'),
("A4","Adidas", "SUPERSTAR SHOES" , 11499,'/A41.jpg'),
("P1","Puma", "Mirage Neon Sneakers" , 9499,'/P11.jpg'),
("P2","Puma", "Mirage Neon Sneakers" , 9999,'/P12.jpg'),
("P3","Puma", "Blaze of Glory Sneakers" , 7899,'/P13.jpg'),
("P4","Puma", "Air Rider FV Ultra Sneakers" , 8999,'/P14.jpg'),
("R1","Rebook", "Reebok Rbk Classics Court Peak" , 6999,'/R1.jpg'),
("R2","Rebook", "Reebok RBK Classics Leather" , 6999,'/R2.jpg'),
("R3","Rebook", "Reebok Rbk Classics Turbo Restyle" , 5999,'/R3.jpg'),
("R4","Rebook", "Reebok Rbk Classics Furylite 95" , 6999,'/R4.jpg');

