Select pe.name as Employee 
from Employee pe
join Employee ce on pe.managerId=ce.id
where pe.salary>ce.salary;