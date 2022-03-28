USE demo;

create table products (
   id int(3) NOT NULL AUTO_INCREMENT,
   name varchar(120) NOT NULL,
   description varchar(220) NOT NULL,
   quantity int(5) NOT NULL,
   price decimal(120) NOT NULL,
   PRIMARY KEY (id)
);
