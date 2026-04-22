-- Last updated: 23/04/2026, 00:03:01
# Write your MySQL query statement below
select mgr.employee_id, mgr.name, COUNT(emp.employee_id) as reports_count, round(avg(emp.age)) as average_age
from employees emp join employees mgr
on emp.reports_to = mgr.employee_id
group by employee_id
order by employee_id