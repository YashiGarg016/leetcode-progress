-- Last updated: 23/04/2026, 00:04:55
# Write your MySQL query statement below
select m.name
from employee e
join employee m 
where e.managerId = m.id
group by e.managerId
having count(*) >= 5;