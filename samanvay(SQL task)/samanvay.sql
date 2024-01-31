-- Problem 1
-- Most Regular Employee

SELECT name 
FROM employee 
LEFT JOIN attendance_register ON (employee.id = attendance_register.employee_id) 
GROUP BY name
ORDER BY count(attendance_register.id) DESC
LIMIT 1;

-- Most Irregular Employee
SELECT name
FROM employee
LEFT JOIN attendance_register ON employee.id = attendance_register.employee_id
GROUP BY name
ORDER BY count(attendance_register.id) ASC
LIMIT 1;