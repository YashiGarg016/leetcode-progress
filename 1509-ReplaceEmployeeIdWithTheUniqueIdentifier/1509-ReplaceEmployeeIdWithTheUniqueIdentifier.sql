-- Last updated: 23/04/2026, 00:03:28
# Write your MySQL query statement below
SELECT name, unique_id FROM Employees LEFT JOIN EmployeeUNI USING (id);