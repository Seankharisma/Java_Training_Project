DROP FUNCTION IF EXISTS gettesttablea(TEXT,TEXT,TEXT[],TEXT[]);
CREATE OR REPLACE FUNCTION getTestTableA(tableName1 TEXT,tableName2 TEXT,tb1_join_item TEXT[],tb2_join_item TEXT[])
RETURNS SETOF test_tb_a AS
$BODY$
DECLARE
r test_tb_a%rowtype;
counter int;
join_sentens TEXT:='';
BEGIN

for counter in 1..array_length(tb1_join_item,1) LOOP
   if counter=1 THEN
      join_sentens:=join_sentens||tableName1||'.'||tb1_join_item[counter]||'='||tableName2||'.'||tb2_join_item[counter];
   ELSE
      join_sentens:=join_sentens||' AND '||tableName1||'.'||tb1_join_item[counter]||'='||tableName2||'.'||tb2_join_item[counter];
   end IF;
END LOOP;

FOR r IN EXECUTE 'SELECT '||tableName1||'.* FROM '||tableName1||' left join '||tableName2||' on '
||join_sentens||' where '||tableName2||'.'||tb2_join_item[1]||' is  null'
    LOOP
        RAISE NOTICE '%s',r;
        RETURN NEXT r;
END LOOP;
END;
$BODY$
LANGUAGE 'plpgsql' ;

SELECT * from getTestTableA('test_tb_a','test_tb_D','{"id","name"}'::TEXT[],'{"id","name2"}'::TEXT[]);
DROP FUNCTION IF EXISTS getarray(TEXT[]);
CREATE OR REPLACE FUNCTION getArray(listValue TEXT[])
RETURNs TABLE(
itme_name TEXT
)
AS $$
DECLARE
counter int;
var_r record;
BEGIN
for counter in 1..array_length(listValue,1) LOOP
itme_name:=listValue[counter];
return NEXT;
END LOOP;
END;
$$
LANGUAGE 'plpgsql' ;

SELECT  * from getArray('{"A","B"}'::TEXT[]);