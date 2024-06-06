-- List product names of the most expensive products
select ProductName, UnitPrice
from products
where UnitPrice = (select max(UnitPrice) from products);

-- List orderId, Shippingname, and address of all orders shipped via Fedral SHipping
 select OrderID, ShipName, ShipAddress
 from orders
 where ShipVia = (select ShipperId from shippers where CompanyName = "Federal Shipping");
 
 -- List orderIDs of "Sasquatch ALe" 
 select OrderID
 from orderdetails
 where ProductID IN (select ProductID from products where ProductName = 'Sasquatch Ale');
 
 -- Name of employee that sold order 10266
 select EmployeeId, LastName, FirstName
 from employees
 where  EmployeeID IN (select EmployeeId from orders where OrderId = 10266);
 
 -- Name of customer that bought order 10266
  select CustomerID, CompanyName
 from customers
 where  CustomerID IN (select CustomerID from orders where OrderId = 10266);
