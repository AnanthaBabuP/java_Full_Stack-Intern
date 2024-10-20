----------------------------
------- INNER JOIN ----------
------------------------------ 

SELECT 
	ORDER_ID,CUSTOMER.CUSTOMER_ID,CUSTOM_NAME,ITEM,ORDERDATE
FROM ORDERS 
INNER JOIN CUSTOMER 
	ON ORDERS.CUSTOMER_ID = CUSTOMER.CUSTOMER_ID;
    
------------------------------------
------- LEFT OUTER JOIN ------------
------------------------------------

SELECT 
	ORDER_ID,T2.CUSTOMER_ID,CUSTOM_NAME,ITEM,ORDERDATE
FROM ORDERS T1
LEFT JOIN CUSTOMER T2
	ON T1.CUSTOMER_ID = T2.CUSTOMER_ID;
    
------------------------------------
------- RIGHT OUTER JOIN -----------
------------------------------------
SELECT 
	ORDER_ID,T2.CUSTOMER_ID,CUSTOM_NAME,ITEM,ORDERDATE,postcode,city,state,country
FROM ORDERS T1
RIGHT JOIN CUSTOMER T2
	ON T1.CUSTOMER_ID = T2.CUSTOMER_ID;
    
------------------------------------
------- FULL OUTER JOIN -----------
------------------------------------
--  You don't have full join in my MySQL, but you can sure emulate them using UNION | UNION ALL Keyword.
-- SELECT 
-- 	ORDERS.ORDER_ID,
--     T2.CUSTOMER_ID,
--     CUSTOMER.CUSTOM_NAME,
--     ITEM,
--     ORDERDATE,
--     postcode,
--     city,
--     state,
--     country
-- FROM ORDERS
-- FULL JOIN CUSTOMER
-- 	ON ORDERS.CUSTOMER_ID = CUSTOMER.CUSTOMER_ID;   

SELECT 
	ORDER_ID,T2.CUSTOMER_ID,CUSTOM_NAME,ITEM,ORDERDATE,postcode,city,state,country
FROM ORDERS T1
LEFT JOIN CUSTOMER T2
	ON T1.CUSTOMER_ID = T2.CUSTOMER_ID
UNION
SELECT 
	ORDER_ID,T2.CUSTOMER_ID,CUSTOM_NAME,ITEM,ORDERDATE,postcode,city,state,country
FROM ORDERS T1
RIGHT JOIN CUSTOMER T2
	ON T1.CUSTOMER_ID = T2.CUSTOMER_ID;
    

------------------------------------
------- SELF JOIN ------------------
------------------------------------

SELECT A.CUSTOMER_ID,A.CUSTOM_NAME,B.CITY FROM CUSTOMER A,CUSTOMER B WHERE A.CITY = B.CITY;


------------------------------------
------- CROSS JOIN -----------
------------------------------------
SELECT 
	ORDER_ID,T2.CUSTOMER_ID,CUSTOM_NAME,ITEM,ORDERDATE,postcode,city,state,country
FROM ORDERS T1
CROSS JOIN CUSTOMER T2;
    
------------------------------------
------- SELECT JOIN ----------------
------------------------------------ 
select * from ORDERS;
select * from CUSTOMER;