# Employee
Simple Remote Procedure Call Project for Employees with URL calls and H2 in memory database<br />
<br />
you can use postman or curl for call the urls<br />
url examples:<br />
Get All Employees --> GET http://localhost:8080/employees<br />
Get One Employee --> GET http://localhost:8080/employees/1 <br />
Add Employee --> POST http://localhost:8080/employees with header Content-type application/json and body {"name": "Samwise Gamgee", "role": "gardener"}<br />
Delete Employee --> DELETE http://localhost:8080/employees/3
