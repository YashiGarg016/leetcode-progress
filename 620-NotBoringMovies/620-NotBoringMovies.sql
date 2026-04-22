-- Last updated: 23/04/2026, 00:04:47
# Write your MySQL query statement below
#select * from cinema where id%2 !=0 and description not like '%boring%' order by rating desc
select id, movie, description, rating
from Cinema
where id % 2 = 1 and description != 'boring'
order by rating desc