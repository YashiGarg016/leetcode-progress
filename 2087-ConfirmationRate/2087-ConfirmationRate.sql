-- Last updated: 23/04/2026, 00:02:53
# Write your MySQL query statement below
select s.user_id, round(avg(if(c.action = 'confirmed', 1.00, 0)),2) confirmation_rate
from Signups s left join confirmations c on s.user_id = c.user_id group by s.user_id
