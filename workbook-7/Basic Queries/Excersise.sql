-- Display product Id, Product Name, and unit price
select ProductID, ProductName, UnitPrice
from products;
-- display by price
select ProductID, ProductName, UnitPrice
from products
Order By UnitPrice ASC;

-- List products that we carry that are $7.50 or less
select  ProductId, ProductName, UnitPrice
from products
where UnitPrice <= 7.50;

-- List products that we have at least 100 stock in, by descending order in price
select  ProductId, ProductName, UnitPrice, QuantityPerUnit
from products
where QuantityPerUnit >= 100
order by unitprice DESC;

-- List products that we have at least 100 units, order in descending by price, If two have the same price then list them in ascending order by product name
select  ProductId, ProductName, UnitPrice, UnitsInStock
from products
where UnitsInStock >= 100
order by unitprice DESC, ProductName ASC;

-- List products that we have no units on hand but have 1 or more on back order, order by product name
select  ProductId, ProductName, UnitPrice, QuantityPerUnit
from products
where QuantityPerUnit = 0 and UnitsInStock >= 1
order by ProductName;

-- List all columns and all rows of the categories table
select *
from categories;

-- List all of the seafood items 
select CategoryId,ProductId,ProductName
from products
where CategoryID = 8;

-- List the first and last name of all Northwind employees
select FirstName, LastName
from employees;

-- List managers
select Title, FirstName, LastName
from employees
where Title like '%manager%';

-- List Distinct Job titles
select distinct Title
from employees;

-- List employees that have a salary between 2000 and 2500

select EmployeeID as ID, FirstName, LastName, salary
from employees
where salary between 2000 and 2500
order by salary ASC;

-- List all information on Northwinds suppliers
select *
from suppliers;

-- List all items that Tokyo Traders supply
select ProductID, ProductName
from products
where SupplierID = 4;
