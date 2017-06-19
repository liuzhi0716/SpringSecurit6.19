
insert into people (id,username,password) values(1,"liuzhi","pswd");
insert into people (id,username,password) values(2,"lipeng","pswd2");

insert into role (id,name) values(1,"admin");
insert into role (id,name) values(2,"user");

insert into people_roles (people_id,roles_id) values(1,1);
insert into people_roles (people_id,roles_id) values(2,2);
