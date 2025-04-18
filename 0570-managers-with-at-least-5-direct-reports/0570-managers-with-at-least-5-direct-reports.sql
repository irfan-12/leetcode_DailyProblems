# Write your MySQL query statement below
Select e.name from employee As e
Inner JOIN employee As m ON e.id = m.managerId
Group by m.managerId
Having count(m.managerId) >= 5