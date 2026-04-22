-- Last updated: 23/04/2026, 00:02:37
# Write your MySQL query statement below
select teacher_id, count(distinct(subject_id)) as cnt
from Teacher
group by teacher_id