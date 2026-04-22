-- Last updated: 23/04/2026, 00:03:57
# Write your MySQL query statement below
select P.product_name, S.year, S.price
from Sales S
Left join Product P
on S.product_id = P.product_id