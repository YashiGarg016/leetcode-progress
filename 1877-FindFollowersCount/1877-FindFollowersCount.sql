-- Last updated: 23/04/2026, 00:03:03
# Write your MySQL query statement below
select user_id, count(1) as followers_count from Followers
group by user_id
order by user_id