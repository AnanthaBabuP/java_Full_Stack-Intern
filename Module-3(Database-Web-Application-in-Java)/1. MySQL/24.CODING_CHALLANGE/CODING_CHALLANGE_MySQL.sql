CREATE DATABASE CODING_CHALLENGE;
USE CODING_CHALLENGE;

-- =================================================================================================================================================================================
--------------------------------------------
----------- DROP CUSTOMERS TABLE ----------
--------------------------------------------

DROP TABLE CUSTOMERS;

--------------------------------------------
----------- CREATE CUSTOMERS TABLE ----------
--------------------------------------------
CREATE TABLE CUSTOMERS(
	ID INT UNIQUE auto_increment,
	CUSTOM_ID INT PRIMARY KEY,
    CUSTOM_NAME VARCHAR(50),
    CUSTOM_EMAIL VARCHAR(50),
    CUSTOM_ADDRESS VARCHAR(60),
    CUSTOM_COUNTRY VARCHAR(20)
);

-------------------------------------------------
----------- INSERT CUSTOMER TABLE DATA ----------
-------------------------------------------------
INSERT INTO CUSTOMERS (CUSTOM_ID, CUSTOM_NAME, CUSTOM_EMAIL, CUSTOM_ADDRESS,CUSTOM_COUNTRY) VALUES
(1001,'Arun','arun@gmail.com','Tenkasi','INDIA'),
(1002,'Suresh','suresh@gmail.com','America','USA'),
(1003,'Kamala','kamala@gmail.com','Chennai','INDIA'),
(1004,'Rama','rama@gmail.com','Salem','INDIA'),
(1005,'Lingam','lingam@gmail.com','Namakkal','INDIA');

-- =================================================================================================================================================================================
--------------------------------------------
----------- DROP PRODUCT TABLE ----------
--------------------------------------------

DROP TABLE PRODUCT;

--------------------------------------------
----------- CREATE PRODUCT TABLE -----------
--------------------------------------------

CREATE TABLE PRODUCT(
	PRODUCT_ID INT PRIMARY KEY,
    PRODUCT_NAME VARCHAR(60) NOT NULL,
    PRODUCT_DISCRIPTION VARCHAR(50),
    PRODUCT_PRICE DECIMAL(10, 2),
    CATEGORY_ID INT
);

-------------------------------------------------
----------- INSERT PRODUCT TABLE DATA ----------
-------------------------------------------------
INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_NAME, PRODUCT_DISCRIPTION, PRODUCT_PRICE,CATEGORY_ID) VALUES
(2001,'PRODUCT-A','DESCRIPTION FOR PRODUCT-A',4500.00,101),
(2002,'PRODUCT-B','DESCRIPTION FOR PRODUCT-B',300.00,102),
(2003,'PRODUCT-C','DESCRIPTION FOR PRODUCT-C',5000.00,101);

-- =================================================================================================================================================================================

--------------------------------------------
----------- CREATE CATEGORYS TABLE -----------
--------------------------------------------
CREATE TABLE CATEGORYS(
	CATEGORY_ID INT PRIMARY KEY,
    CATEGORY_NAME VARCHAR(20) NOT NULL
);

--------------------------------------------
----------- DROP CATEGORYS TABLE ----------
--------------------------------------------

DROP TABLE CATEGORYS;

-------------------------------------------------
----------- INSERT CATEGORYS TABLE DATA ----------
-------------------------------------------------
INSERT INTO CATEGORYS (CATEGORY_ID, CATEGORY_NAME) VALUES
(101,'CATEGORY-1'),
(102,'CATEGORY-2'),
(103,'CATEGORY-3');

-- =================================================================================================================================================================================

--------------------------------------------
----------- DROP ORDERS TABLE,TRIGGER --------------
--------------------------------------------

DROP TABLE ORDERS;
DROP TRIGGER set_total_price;

-----------------------------------------
----------- CREATE ORDER TABLE -------------
--------------------------------------------
CREATE TABLE ORDERS(
	ORDER_ID INT PRIMARY KEY,
    CUSTOM_ID INT NOT NULL,
    PRODUCT_ID INT NOT NULL,
    ORDER_QTY INT ,
    ORDER_DATE date default (DATE(NOW())),
    TOTAL_PRICE DECIMAL(10, 2)
);

-------------------------------------------------------------------
----------- TRIGGER ON BEFORE INSERT ON ORDERS TABLE DATA ----------
--------------------------------------------------------------------
DELIMITER //

CREATE TRIGGER set_total_price
BEFORE INSERT ON ORDERS
FOR EACH ROW
BEGIN
  DECLARE PRODUCT_AMOUNT DECIMAL(10, 2);
  SELECT PRODUCT_PRICE INTO PRODUCT_AMOUNT FROM product WHERE PRODUCT_ID = NEW.PRODUCT_ID;
  SET NEW.TOTAL_PRICE = PRODUCT_AMOUNT * NEW.ORDER_QTY;
  IF NEW.ORDER_DATE > CURRENT_DATE THEN
	SET NEW.ORDER_DATE = CURRENT_DATE;
  END IF;
END//

DELIMITER ;

-- ----------------------------------------------------------
-- --------- ADD CHECK FOR ORDER_DATE ----------------------
-- ----------------------------------------------------------

ALTER TABLE ORDERS
ADD CONSTRAINT chk_order_date CHECK (ORDER_DATE <= DATE(NOW()));

-------------------------------------------------
----------- INSERT ORDERS TABLE DATA ----------
-------------------------------------------------
INSERT INTO ORDERS (`ORDER_ID`, `CUSTOM_ID`, `PRODUCT_ID`, `ORDER_QTY`, `ORDER_DATE`) VALUES 
(3001,1002,2001,3,'2022-10-01'),
(3002,1002,2003,1,'2022-11-30'),
(3003,1001,2002,2,'2022-11-30');

INSERT INTO `coding_challenge`.`orders` (`ORDER_ID`, `CUSTOM_ID`, `PRODUCT_ID`, `ORDER_QTY`, `ORDER_DATE`) VALUES ('3004', '1008', '2001', '2', '2022-06-25');
INSERT INTO `coding_challenge`.`orders` (`ORDER_ID`, `CUSTOM_ID`, `PRODUCT_ID`, `ORDER_QTY`, `ORDER_DATE`) VALUES ('3005', '1004', '2003', '1', '2024-09-06');
INSERT INTO `coding_challenge`.`orders` (`ORDER_ID`, `CUSTOM_ID`, `PRODUCT_ID`, `ORDER_QTY`, `ORDER_DATE`) VALUES ('3006', '1002', '2002', '3', '2024-10-05');
INSERT INTO `coding_challenge`.`orders` (`ORDER_ID`, `CUSTOM_ID`, `PRODUCT_ID`, `ORDER_QTY`, `ORDER_DATE`) VALUES ('3007', '1009', '2006', '6', '2024-10-15');
INSERT INTO `coding_challenge`.`orders` (`ORDER_ID`, `CUSTOM_ID`, `PRODUCT_ID`, `ORDER_QTY`, `ORDER_DATE`) VALUES ('3008', '1003', '2001', '2', '2024-10-15');




-- =================================================================================================================================================================================


-- --------------------------------------------------------------------------------------------------------------
-- --------- 1. Write a query to join two tables, orders and customers, on the customer_id column. ---------------
-- ---------------------------------------------------------------------------------------------------------------

SELECT *
FROM orders
JOIN customers ON orders.custom_id = customers.custom_id;

-------------------------------------------------------------------------------------------------------------------------------
----------- 2. How would you modify the query to include only orders with a total value greater than 1000 Rs ?. ---------------
-------------------------------------------------------------------------------------------------------------------------------

SELECT ORDER_ID,CUSTOM_ID,T1.PRODUCT_ID, PRODUCT_NAME,PRODUCT_PRICE,ORDER_QTY,TOTAL_PRICE  AS TOTALVALUE
FROM ORDERS T1 JOIN PRODUCT T2 
ON T1.PRODUCT_ID = T2.PRODUCT_ID 
WHERE T1.TOTAL_PRICE > 10000;

-------------------------------------------------------------------------------------------------------------------------------
----------- 3. Join three tables: orders, customers, and products, on the customer_id and product_id columns. -----------------
-------------------------------------------------------------------------------------------------------------------------------

SELECT *
FROM ORDERS T1
JOIN CUSTOMERS T2 ON T1.CUSTOM_ID = T2.CUSTOM_ID
JOIN PRODUCT T3 ON T1.PRODUCT_ID = T3.PRODUCT_ID;

-------------------------------------------------------------------------------------------------------------------------------
----------- 4. Write a query to retrieve the customer name, order date, and product name for all orders. -----------------
-------------------------------------------------------------------------------------------------------------------------------

SELECT T2.CUSTOM_NAME, T1.ORDER_DATE, T3.PRODUCT_NAME
FROM ORDERS T1
JOIN CUSTOMERS T2 ON T1.CUSTOM_ID = T2.CUSTOM_ID
JOIN PRODUCT T3 ON T1.PRODUCT_ID = T3.PRODUCT_ID;

-------------------------------------------------------------------------------------------------------------------------------
----------- 5. How would you modify the query to exclude customers from a specific country (e.g., USA) ? ---------------------
-------------------------------------------------------------------------------------------------------------------------------

SELECT T2.CUSTOM_NAME, T1.ORDER_DATE, T3.PRODUCT_NAME,T2.CUSTOM_COUNTRY
FROM ORDERS T1
JOIN CUSTOMERS T2 ON T1.CUSTOM_ID = T2.CUSTOM_ID
JOIN PRODUCT T3 ON T1.PRODUCT_ID = T3.PRODUCT_ID
WHERE T2.CUSTOM_COUNTRY = 'INDIA';

------------------------------------------------------------------------------------------------------------------------------------------------------------
----------- 6. Join four tables: orders, customers, products, and categories, on the customer_id, product_id, and category_id columns. ---------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------

SELECT *
FROM ORDERS T1
JOIN CUSTOMERS T2 ON T1.CUSTOM_ID = T2.CUSTOM_ID
JOIN PRODUCT T3 ON T1.PRODUCT_ID = T3.PRODUCT_ID
JOIN CATEGORYS T4 ON T3.CATEGORY_ID = T4.CATEGORY_ID;

---------------------------------------------------------------------------------------------------------------------------------------------
----------- 7. Write a query to retrieve the category name, product name, order date, and customer name for all orders. ---------------------
---------------------------------------------------------------------------------------------------------------------------------------------
SELECT CATEGORY_NAME,PRODUCT_NAME,ORDER_DATE,CUSTOM_NAME
FROM ORDERS T1
JOIN CUSTOMERS T2 ON T1.CUSTOM_ID = T2.CUSTOM_ID
JOIN PRODUCT T3 ON T1.PRODUCT_ID = T3.PRODUCT_ID
JOIN CATEGORYS T4 ON T3.CATEGORY_ID = T4.CATEGORY_ID;
---------------------------------------------------------------------------------------------------------------------------------------------
----------- 8. How would you modify the query to include only orders from a specific date range  (e.g., last 30 days) ? ---------------------
---------------------------------------------------------------------------------------------------------------------------------------------

SELECT CATEGORY_NAME,PRODUCT_NAME,ORDER_DATE,CUSTOM_NAME
FROM ORDERS T1
JOIN CUSTOMERS T2 ON T1.CUSTOM_ID = T2.CUSTOM_ID
JOIN PRODUCT T3 ON T1.PRODUCT_ID = T3.PRODUCT_ID
JOIN CATEGORYS T4 ON T3.CATEGORY_ID = T4.CATEGORY_ID
WHERE T1.ORDER_DATE BETWEEN SUBDATE(NOW(),30) AND NOW();

-- =================================================================================================================================================================================
