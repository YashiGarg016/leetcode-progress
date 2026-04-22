-- Last updated: 23/04/2026, 00:06:00
# Write your MySQL query statement below
select today.id 
from Weather yesterday 
cross join Weather today
where DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature