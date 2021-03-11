drop table if exists scaling.customers;
drop table if exists scaling.new_customers;

create schema scaling;

create table scaling.customers(
    id serial not null,
    name varchar,
    date timestamp,
    card_bsk_num integer,
    constraint customers_pk primary key (id)
);

create table scaling.new_customers(
    id serial not null,
    name varchar,
    date timestamp,
    card_bsk_num integer,
    constraint new_customers_pk primary key (id)
);