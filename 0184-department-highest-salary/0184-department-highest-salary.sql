# Write your MySQL query statement below
Select d.name as Department,e.name as Employee, e.salary as Salary 
from Employee e 
join Department d on d.id=e.departmentId
WHERE (e.salary, e.departmentId) IN (
    SELECT MAX(salary), departmentId
    FROM Employee
    GROUP BY departmentId
);