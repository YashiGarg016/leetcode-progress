-- Last updated: 23/04/2026, 00:03:59
# Write your MySQL query statement below
select customer_id from Customer group by customer_id 
having count(distinct product_key) = (select count(product_key) from Product)