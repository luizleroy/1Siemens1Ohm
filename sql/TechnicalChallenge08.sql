select name from dogs
union
select name from cats

-- to test
create table dogs (
  id integer not null primary key,
  name varchar(50) not NULL);

create table cats (
  id integer not null primary key,
  name varchar(50) not NULL);

  insert into dogs (id,name) values (1,'dog1'),(2,'dog2'),(3,'catdog');
  insert into cats (id,name) values (11,'cat1'),(12,'cat2'),(13,'catdog');