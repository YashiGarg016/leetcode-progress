-- Last updated: 23/04/2026, 00:03:48
# Write your MySQL query statement below
select distinct author_id as id from Views where author_id = viewer_id order by author_id ASC;