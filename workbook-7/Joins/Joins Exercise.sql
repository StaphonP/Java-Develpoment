-- List product id, product name, price and category name of all products by product name
select ProductID, ProductName, UnitPrice, CategoryName
from products
 Join categories
 on categories.CategoryName = CategoryName
 order by ProductName DESC;
 
 -- List the product id, name, unit price, and supplier name of every product that cost more than $75 order
 select ProductID, ProductName, UnitPrice, CompanyName
 from products
 Join suppliers
 on suppliers.CompanyName = CompanyName
 where UnitPrice > 75
 order by ProductName;
 
 -- List the product Id, product name, unit price category name ans supplier name of each product
 select ProductID, ProductName, UnitPrice, CategoryName, CompanyName
 from products
 Join suppliers on suppliers.CompanyName = CompanyName
 Join categories on categories.CategoryName = CategoryName;
 
 -- List product names and categories of the most expensive products
 select ProductName, CategoryName, UnitPrice
 from products
 left join categories on categories.CategoryName
 where UnitPrice = (select max(UnitPrice) from products);
 
 -- List order ID, ship name, ship address, of all Sasquatch ale orders
 select OrderID, ShipName, ShipAddress, ProductName
 from orders
 join products on products.ProductName = ProductName
 where ProductName = "Sasquatch Ale";


 
 
