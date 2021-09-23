
create database if not exists pizzaorder;
use pizzaorder;

CREATE TABLE IF NOT EXISTS catalog (
    item_id INT(11)  NOT NULL AUTO_INCREMENT,
    item_name VARCHAR(40) DEFAULT NULL UNIQUE,
    price DECIMAL(5 , 2 ) DEFAULT NULL,
    PRIMARY KEY (item_id)
);

insert into catalog(item_name,price) values("Paneer Cheese Pizza
",300);

insert into catalog(item_name,price) values("Tandoori Paneer Pizza
",300);

insert into catalog(item_name,price) values("Deluxe Margherita Pizza
",450);

insert into catalog(item_name,price) values("Chilly Cheese Toast
",130);

insert into catalog(item_name,price) values("Paneer Tikka Sandwich
",130);

insert into catalog(item_name,price) values("Paneer Tikka Pizza
",400);

insert into catalog(item_name,price) values("Veg Paradise Pizza
",400);

insert into catalog(item_name,price) values("Garlic Bread Stick
",130);

insert into catalog(item_name,price) values("Mexican Pizza
",400);

insert into catalog(item_name,price) values("Italia Cheese Sandwich
",130);

SELECT 
    *
FROM
    catalog;


