-- How many suppliers are there
Select Count(CompanyName) as suppliers
from suppliers;

-- Sum of all employee salaries
select Sum(salary) as salary
from employees;

-- List the cheapesst item 
select min(UnitPrice), ProductName
from products;

-- List the Avg price of items
select avg(UnitPrice)
from products;

-- List Most expensive item
select max(UnitPrice), ProductName
from products;

-- List productId,name, and inventory value
select ProductID,ProductName, (UnitPrice * UnitsInStock) as InventoryValue
from products
order by InventoryValue Desc, ProductName;


