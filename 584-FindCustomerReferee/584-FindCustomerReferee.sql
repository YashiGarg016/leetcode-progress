-- Last updated: 23/04/2026, 00:04:51
# Write your MySQL query statement below
SELECT name 
FROM customer 
WHERE referee_id != 2 OR referee_id IS NULL;