create table completa(id integer primary key, nombre varchar2(40));
create table a(id integer primary key, nombre varchar2(40));


create or replace trigger malo before insert on completa for each row
declare
valor integer;
cursor cur1 is select * from completa;
begin
select count(*) into valor from completa;
if valor >= 3 then
for rec in cur1 loop
insert into  a values(rec.id, rec.nombre);
end loop;
delete from completa;
end if;
end;
/

insert into completa values(4,'pedro');
select * from completa;
select * from a;