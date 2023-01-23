# Employee
Simple Remote Procedure Call Project for Employees with URL calls and H2 in memory database

you can use postman or curl for call the urls
url examples:
Get All Employees --> GET http:\\localhost:8080/employees
Add Employee --> POST http://localhost:8080/employees with header Content-type application/json and body {"name": "Samwise Gamgee", "role": "gardener"}
Delete Employee --> DELETE localhost:8080/employees/3
