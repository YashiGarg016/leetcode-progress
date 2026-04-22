-- Last updated: 23/04/2026, 00:04:49
# Write your MySQL query statement below
select class from courses group by class having count(*)>=5;