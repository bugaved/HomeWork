create table sp_product
(
    product_id SERIAL,
    product_name varchar(30) not null,
    product_price int not null,
    product_description varchar(1000) not null,
    primary key (product_id)
);


create table sp_client
(
    client_id SERIAL,
    client_id integer not null,
    client_email varchar(100) not null,
    client_password varchar(100) not null,
    client_phoneNumber integer not null,
    primary key(client_id)
);

create table sp_cart
(
    cart_id SERIAL,
    cart_total integer not null,
    cart_id integer not null,
    client_id integer not null,
    product_id integer not null,
    comment varchar(1000) not null,
    primary key(cart_id)
);
create table sp_review
(
review_id SERIAL,
    review_rating integer not null,
    review_id integer not null,
    product_id integer not null,
    review_body varchar(1000) not null,
    primary key(comment_id)
);
create table st_cart_product
(
  cart_id int not null,
  product_id int not null,
  number_of_products int not null,
  product_price int not null
);

