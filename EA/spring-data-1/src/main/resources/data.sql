insert into product (id,name,price,category,color) VALUES (1,'iphone',1000,'mobile','black');
insert into product (id,name,price,category,color) VALUES (2,'ipad',2000,'tablet','red');

insert into review (id,comment,rating,product_id) VALUES (1,'good 1',5,1);
insert into review (id,comment,rating,product_id) VALUES (2,'good 2',5,1);
insert into review (id,comment,rating,product_id) VALUES (3,'good 3',5,1);


insert into review (id,comment,rating,product_id) VALUES (4,'good 4',5,2);
insert into review (id,comment,rating,product_id) VALUES (5,'good 5',5,2);
insert into review (id,comment,rating,product_id) VALUES (6,'good 6',5,2);


CREATE TABLE ActivityLog (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             date TIMESTAMP,
                             operation VARCHAR(255),
                             duration INT
);