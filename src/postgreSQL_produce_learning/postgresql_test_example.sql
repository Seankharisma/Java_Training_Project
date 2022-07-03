

/*这个语句在返回 n 行数据前，会先跳过 m 行。
  如果 m 是 0，那它的结果和省略 OFFSET 是一样的。*/
SELECT
*
FROM
table
LIMIT n OFFSET m;

/*
PostgreSQL 提供了两个通配符：
百分号(%)用于匹配任何字符序列。
下划线(_)用于匹配任意单个字符。
*/
SELECT
        'foo' LIKE 'foo', -- true
        'foo' LIKE 'f%', -- true
        'foo' LIKE '_o_', -- true
        'bar' LIKE 'b_'; -- false

/*
PostgreSQL 提供了和 LIKE 行为相似的 ILIKE 运算符。
不同的是 ILIKE 在进行模式匹配时，会忽略大小写。
即是说，它是以不区分大小写的方式进行模式匹配的
*/
/*
UNION 会移除所有重复的行，要保留重复的行，需要使用 UNION ALL
*/

/*
子查询可以作为 EXISTS 的输入，如果子查询中有数据，EXISTS 返回 true；反之，如果子查询没有任何数据，EXISTS 返回 false。

EXISTS 只关心子查询中的行数，并不关心子查询中的内容。因此，EXISTS 运算符的通用编码约定如下：
*/
SELECT
    first_name,
    last_name
FROM
    customer
WHERE
    EXISTS (
            SELECT
                1
            FROM
                payment
            WHERE
                    payment.customer_id = customer.customer_id
        );

/*
关于自增

yiibai_db=# CREATE TABLE COMPANY(
   ID  SERIAL PRIMARY KEY,
   NAME           TEXT      NOT NULL,
   AGE            INT       NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL
);


*/
