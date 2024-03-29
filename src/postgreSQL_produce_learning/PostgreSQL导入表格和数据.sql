create table if not exists test_tb_A(
  ID VARCHAR not null,
  name VARCHAR not null,
  age integer,
  job varchar
);
create table if not exists test_tb_B(
  ID VARCHAR  not null,
  sex VARCHAR  not null,
  salary integer,
  company varchar
);
create table if not exists test_tb_C(
  ID VARCHAR  not null,
  description varchar
);
create table if not exists test_tb_D(
  ID VARCHAR not null,
  name2 VARCHAR not null,
  task VARCHAR,
  amout integer
);
insert into test_tb_A
(id,name,age,job)
values
    ('A001','Sean',27,'dancer'),
    ('A002','janet',20,'doctor'),
    ('A003','peter',69,'teacher'),
    ('A004','linda',34,'singer')
;
insert into test_tb_B
(id,sex,salary,company)
values
    ('A001','male',100,'jsudb'),
    ('A002','female',200,'sdfdv'),
    ('A005','male',300,'rrrrr'),
    ('A006','female',404,'iiiiii')
;
insert into test_tb_C
(id,description)
values
    ('A001','66g65y'),
    ('A002','5df]g'),
    ('A007','r465i(fgryr'),
    ('A006','0[kg')
;

insert into test_tb_D
(id,name2,task,amout)
values
    ('A001','Sean','dancer',27),
    ('A002','janet','doctor',20),
    ('A003','Zoe','teacher',69),
    ('A004','Cindy','singer',34)
;

create table if not exists test_pj(
        ID VARCHAR not null,
        name VARCHAR not null,
         age integer,
         job varchar
);

insert into test_pj
(id,name,age,job)
values
    ('A001','T64_週次',27,'dancer'),
    ('A001','T64_月次',27,'dancer'),
    ('A001','T64_月次',27,'dancer')
;
/*
name asc:
T64_月次
T64_週次

nmae desc:
T64_週次
T64_月次

*/
SELECT
    id,
    age,
    job,
    array_to_string(ARRAY_AGG(DISTINCT name ORDER by name desc),chr(10)) as name
FROM
    test_pj
GROUP BY id,age,job
;


/*
name asc:
T64_月次
T64_月次
T64_週次

nmae desc:
T64_週次
T64_月次
T64_月次
*/
SELECT name FROM test_pj ORDER by name desc;