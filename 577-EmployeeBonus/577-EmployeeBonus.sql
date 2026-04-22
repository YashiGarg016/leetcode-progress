-- Last updated: 23/04/2026, 00:04:52
# Write your MySQL query statement below
select Employee.name, Bonus.bonus
from Employee left join Bonus on Employee.empID = Bonus.empID
where bonus < 1000 or bonus is null;