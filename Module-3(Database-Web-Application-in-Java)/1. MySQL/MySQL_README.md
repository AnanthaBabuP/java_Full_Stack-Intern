# Database-Web-Application-in-Java
Internship-Course

MySQL INDEX CONTENT:
1. MySQL INTRODUCTION
    1. Data:
        1. data is a raw fact.
        2. data is a single item stored in database, stored as either individually or as a set.
    2. Database:
        Collection of structured information or data or tables.
        Collection of inter related data which help in efficient retrieval, inserting, deletion and updating of data of database.
    3. Database Management System(DBMS):
        It is system software, use to create and manage the database.
    4. Type of DBMS:
        1. Hierarchical DBMS
        2. Network DBMS
        3. Relational Database Management System(RDBMS)
    
    5. Hierarchal DBMS AND Advantages and Disadvantages
    6. Network DBMS AND Advantages and Disadvantages
    7. Relational DBMS AND Advantages and Disadvantages
    8. Schema:
        1. Database schema define ,how data is organized with in a relational database.
        2. This is inclusive of logical contains such as ,tablename, fields, data-type and relationship between these entities.
        3. "schema" refer to the organization of data as a blue print of how the database is constructor.
        4. The database schema it is structure descripted in formal language support by the database.
    9. Key
        1. Primary key 
        2. secondary key
        3. forgin key
        4. candidate key
        5. super key
        6. composite key
    
    10. MySQL
        Opensource Relational Database Management System based on structure query language.
        MySQL run on virtually all platforms, including Linux, UNIX and windows.
        Although it is used in a wild range of applications, MySQL is most often associated with web applications and online publishing. 


        Originally conceived by swedish company MySQL AB, MySQL was acquired by sun microsystem in 2008 and then by oracle when it bought sun in 2010. Delvelopers can use MySQL under the GNU General public licence(GNU),but enterprises must obtain a commercial licence from oracle.
        Today MySQL is the RDBMS behind many of websites in the world and countless corporate and consumer-facing web-based applications, including Facebook, twitter and YouTube.


2. MySQL Core Feature:
    1. Working of MYSQL:
        MySQL Based On client-server model.
        The core of MySQL is MySQL server, It handle all of the database instructions.
        MySQL is available as a separate program for use in client-server environment and as a library that can be embedded in to separate application.


        MySQL operates along with several utility programs which support the administer of MySQL database. Commands are send to the MySQL server via MySQL Client.

        MySQL  was originally to handle large database quickly. Although MySQL is typically installed on only one machine, it's able to send the database to multiple location, as users are able to access it via difference MySQL client Interface. These interface sent SQL statement to the server and then display the result.
    2. Core MySQL Features:
        MySQL enables data to be stored and accessed across multiple storage engines, including innoDB, CSV and NDB. MySQL Also capped or replicating data and partitioning tables for better performance and durability. MySQL Users are not require to learn new commends; They can access their data using Standard SQL commands.

        MySQL accessible and available across over 20 platforms, including Mac, Window, Linux and Unix.  

        For Security,
        MySQL uses an access privileges and encrypted password system that enabled host-based verification.
        MySQL clients can connect to MySQL server using several protocol, Including TCP/IP on any platform.
        MySQL also support number of clients and utility programs, command-line programs and administrator tools such as MySQL - workbench    
    
    3. Notes:
        innoDB is general purpose storage engine that balances high reliability and high performance. In MySQL 5.6 ,InnoDB is the default MySQL storage engine.

        The CSV storage engine stores data in text files using comma-separated value format. The csv storage engine always compiled into the MySQL server.

        "NDB" stands Network database. From the MySQL server perspective the NDB Cluster in a storage engine for storing tables or rows. From the NDB clustor perspective , a MySQL Server instance in an API process connected to the clustor.

    4. What is SQL?
        SQL stands Structure Query Language 
        SQL lets you access and manipulate database.
        SQL become a standard of American National Standards Institute(ANSI) in 1986, and of the international organization for Standardization(ISO) in 1987.
    
    5. What Can SQL do?
        1.It can execute Query against a database.
        2.It retrieve ,insert, delete record/data from a database
        3. Create a new database and new table in a database
        It Can Create a view in a database.
        It can set Permission on table, procedures and views
    
    7. RDBMS:
        Stands Relational Database management System.
        RDBMS in the basic for SQL, and for all modern database systems such as MS SQL server, IBM DB2, oracle, MySQL and Microsoft Access.
        The data in RDBMS is stored in database object is called tables. A table is a collection of related data Entities and it consists of columns and rows.

3. My SQL Installation:
    this pc -> right click -> Check System type(32 or 64 bit)
        Then Check window
        browser-> MySQL Download -> MySQL Download(First Link) ->Download(tab) -> MySQL Community(GPL Downloads) -> MySQL Installer for windows ->  window bit, MSI Installer -> No thanks, just start my download. -> downloaded start

        After Download complete:
        double click on download file -> Custom ->Next  -> Add My SQL SERVER, Workbench, shell(Optional), router, Documentation(Optional) ->Installation Path (Default)  -> Next -> Execute  -> continue ->next ->Finish ->Next -> Finish

    If Server Doesn't Install in installation :
        MySQL community server  -> Download MySQL Server->8.2.0(Version) ->same process in pre Download process

4. MySQL DDL Commends:
    1. Difference between SQL VS MySQL
        SQL:
            1.Databace Language for sorting, Manipulating and retrieving data in relational database.
            2. A database Language
            3. Help to manage data in a relational data base
            4. Doesn't Change as it is a language.
        MySQL:
            1. Opensource relational database management system.
            2. A Software
            3. Help to manage relational database using SQL
            4. Update frequently as it is a software.
    2. MySQL Datatype:
        1. Numerical
        2. String Type.
        3. date and times   

        1. Numeric Type: (Refer to Image Reference)
            1.TinyInt - Very Small Integer
            2.SmallInt - Small Integer
            3.MediumInt - Medium-size Integer
            4.Int - Integer
            5.BigInt - Large Integer
                m:length(No of Digits)
                d:Deciaml Point 
            6.Decimal(m,d)-A fixed point number
            7.FLOAT(m,d) - A Single-floating point number
            8.Double(m,d) - A double-floating point number
            9.BIT - A BIT Field - A BIT Value type, The Number of bit s per value is specified in sizes(1 to 64)
         
        2. String Datatype:
            char(n)       -fixed width character string
            varchar(max)  - variable width character string
            text          - variable width character string
            nchar         - Fixed width Unicode String
            nvarchar(max) - Variable width Unicode String
            ntext         - Fixed width Unicode String
            binary(n)     - Fixed width Binary String
            varvinary     - Variable width Binary String
            image         - Fixed width Binary String
        
        3. Date and time
            1. date          - A date in YYYY-MM-DD Format
            2. datetime      - A date and time combination in YYYY-MM-DD HH:MM:SS
            3. datetime2     - From January1,2022
            4. smalldatetime -From January1,2022
            5. time          - HH:MM:SS
            6. datetimeoffset- same as datetime2 adding of a offset value
            7. timestap - Automatically update when the row is update.
    
    3. MYSQL COMMANDS:
        Commend used in SQL to perform various function.
        This Functions including  
            Building Database Object,
            manipulating Object,
            Populating database tables with data,
            Updating existing data in table,
            deletint data,
            performing database queries,
            controlling database access,
            Overall database administration.

        Main Categories are:
            1. Data Definition Language(DDL)
            2. Data Manipulation Language(DML)
            3. Data Control Language(DCL)
            4. Transaction Control Language(TCL)
    
    4. Data Definition Language(DDL)
        DDL is a part of SQL that allow a database user to create and restructure database objects, such as creation or the delectation of a database, table, index, view

        Some DDL Commends are:
            1. CREATE DATABASE
            2. CREATE TABLE
            3. CREATE INDEX
            4. CREATE VIEW
            
            5. ALTER TABLE
            6. ALTER INDEX
            7. ALTER VIEW
            
            8. DROP TABLE
            9. DROP INDEX
            10.DROP VIEW
            11.DELETE DATABASE

        CREATE DATABASE
            syntax:
                CREATE DATABASE <Databasename>;
            Ex:
                CREATE DATABASE STUDENT_DETAILS
        
        CREATE TABLE:
            SYNTAX:
                CREATE TABLE <TABLENAME>(COLUMN_NAME1 DATATYPE(SIZE),....N);
            EX:
                CREATE TABLE STUDENT(REGNO INT,STUDENTNAME VARCHAR(50),DEPARTMENT VARCHAR(20));
        VIEWING TABLE STRUCTURE:
            DESCRIBE <TABLENAME>
            EX:
                DESCRIBE STUDENT;  
        
        ALTER THE TABLE:
            ALTER THE TABLE IN 3 WAYS:
                1. ADD NEW COLUMN (ADD COLULMN)
                2. MODIFY THE EXISTING COLUMN(MODIFY)
                3. DROP THE EXISTING COLUMN

            1. ADD NEW COLUMN:
                ALTER TABLE <TBALENAME> ADD COLUMN COLUMNNAME-1 DATATYPE(SIZE),ADD COLUMN COLUMNNAME-2 DATATYPR(SIZE)...; 

                EX:
                    ALTER TABLE STUDENT ADD COLUMN AGE INT,ADD COLUMN GENDER VARCHAR(2);   
            2. MODIFY THE EXISTING COLUMN:
                ALTER TABLE <TBALENAME> MODIFY COLUMNNAME-1 DATATYPE(SIZE),MODIFY COLUMNNAME-2 DATATYPR(SIZE)...[FIRST| AFTER COLUMNNAME]; 

                EX:
                    ALTER TABLE STUDENT MODIFY DEPARTMENT VARCHAR(30) AFTER GENDER,MODIFY GENDER VARCHAR(10); 
            3. DROP THE EXISTING COLUMN:
                ALTER TABLE <TABLENAME> DROP COLUMN COLUMNNAME;
                EX:
                    ALTER TABLE STUDENT DROP COLUMN DEPARTMENT,DROP COLUMN GENDER;
        RENAME TABLE:
            ALTER TABLE <TABLENAME> RENAME TO  <NEW TABLENAME>;
            EX:
                ALTER TABLE STUDENT RENAME TO STUDENT_OLD;

        DROP TABLE:
            DROP TABLE <TABLENAME> ;
            EX:
                DROP TABLE STUDENT; 

        RENAME DATABASE:
            RENAME DATABASE <OLD DATABASE ANME> TO <NEW DATABASE NAME>
            EX:
                RENAME DATABASE SAMPLE TO SAMPLE2;

        DROP DATABASE:
            DROP DATABASE <DATABASE NAME>;
            EX:
                DROP DATABASE SAMPLE2;               

5. MySQL DML COMMAND:
    1. DML:
        1. DML Stands data manipulation Language .
        2. Which basically deals with the modification OF DATA in the database.
        3. DML Statement including structure query statement like,
            select,
            insert,
            update,
            delete, etc..

        4. The Manipulation of data including following Operations like,
            sorting, 
            modifying,
            retrieving,
            deleting,
            updating 
                a data in a database.

        5. It is basically manage and modifies the data in database:
            insert = insert or add data
            update = Update the existing data in a table
            delete = Delete all records from a database table.
            select = select keyword is used to retrieving a data from table.
    
    2. Insert Operation:
        It is used to insert or add rows or records in the existing table.
        ew can do insert operation in 2 ways:
            1. INSERT INTO SPECIFIC COLUMNS
            2. INSERT INTO ALL COLUMNS
        
        1. INSERT INTO SPECIFIC COLUMN:
            INSERT INTO <TABLE NAME> (COLUMN-1,COLUM-2,...)VALUES(COLUMN-1 VALUE,COLUM-2 VALUE,...);
            EX:
                INSERT INTO STUDENT (STUDENT_ID,STUDENT_NAME,DEPARTMENT) VALUES ('1001','ANANDH','COMPUTER SCIENCE');
                                                (OR)
                INSERT INTO STUDENT (STUDENT_ID,STUDENT_NAME,DEPARTMENT,GENDER) VALUES ('1001','ANANDH','COMPUTER SCIENCE',MALE),('1002','SARATH','COMPUTER SCIENCE',MALE);
        2. INSERT INTO ALL COLUMNS:
            INSERT INTO <TABLENAME> VALUES(VAL1,VAL2,...);
            NOTE: insert OPERATION REQUIRE THE ODER OF COLOUMNS IN THE TABLE.

            EX:
                INSERT INTO STUDENT VALUES(1001,'SUMATHI','MATHS','25','FEMALE');

    3. UPDATE OPERATION:
        UPDATE <TABLENAME> SET COLUMNNAME=VALUE [WHERE<CONDITION>]
        EX:
            UPDATE STUDENT SET DEPARTMENT='SCIENCE' WHERE STUDENT_ID='1002';
        NOTES:
        ERROR:
        	Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column. 
            To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.	0.000 sec
        SOLUTION:
            set sql_safe_updates=0; 
    4. DELETE OPERATION:
        DELETE FROM <TABLENAME>[WHERE<CONDITION>]
        EX:
            DELETE FROM STUDENT WHERE STUDENT_ID=1001;
    
    5. SELECT OPERATION: REFER IMAGE.

6. Advanced Select Query:
    1. download raw data and paste excel and Change csv file and Import csv file in MySQL:
    
    2. NOT OPERATOR:
        SELECT * FROM <TABLENAME> WHERE <COLUMNNAME> NOT IN <VALUE>;
        EX:
            SELECT * FROM STUDENT WHERE STUDENT_ID NOT IN(1001,1003); // Avoid to this id data
    3. IN OPERATOR:
        SELECT * FROM <TABLENAME> WHERE <COLUMNNAME> IN <VALUE>;
        EX:
            SELECT * FROM STUDENT WHERE STUDENT_ID IN(1001,1003); // show only this id data
    4. Using RELATIONAL OPERATORS(<,>,<=,>=,==,<> OR !-):
        EX: 
            SELECT * FROM SUDENT WHERE STUDENT_ID < 1002;
    5. BETWEEN CLAUSE:
        EX:
            SELECT * FROM SUDENT WHERE STUDENT_ID BETWEEN 1001 AND 1002;

    6. IN,NOT IN CLAUSE:
        REFER PREVIOUS SECTION ON IN,NOT OPERATOR

    7. ORDER BY CLAUSE:
        DESC -> DESCENDING ORDER
        ASC  -> ASSIGNING ORDER

        EX:
            SELECT * FROM STUDENT order by STUDENT_ID ASC;
                            (OR)
            SELECT * FROM STUDENT order by STUDENT_ID,STUDENT_NAME;

    8. PATTERN MACHING USING LIKE CLAUSE:
        SQL LIKE Clause is used to compare a value to similar values using wildcard operators.
        There are two whiled card used in connection with the LIKE operator.

        PARTTERN:
           1.  % = 'A%' starting a letter all show 
                    example:
                    Example: select * from student where student_name like 'S%';
           2.  _ = 'A_ex' show if the data is available for(Al)
                    Example: select * from student where student_name like 'S_R_TH';
            3. [] = Any single character specify the range
                    Example: 'A[a,l,p] will match 'Apple','Aelp','Aple',etc.. 
            4. [^] = Any single character accept the specify range in  the [^].
                    Example: 'A[^a,l,p] will match start with 'A',but not 'Apple','Aelp','Aple',etc..

    9. LIMIT CLAUSE:
            MySQL Support the LIMIT clause to select a limited number of records
                EX:
                    Select * from student limit 2;
                            (or)
                    select * from student limit 2,3; record start index 2 ,end index - 2+3 = 5; show on 3,4,5
    
    10. DISTINCT|ALL CLAUSE
        1. DISTINCT CLAUSE:
            Avoiding duplicate record.
            EX:
                 select DISTINCT student_id, student_name, epartment from student;
        2. ALL CLAUSE:
            The All Clause are used when we want to calculate all values, including duplicates
                SELECT ALL DISIGNATION FROM STUDENT;

7. MySQL Number function:
    1. what is function?
        Function is used to create the data like table values. A function always return a value using return statement.

        There are 2 types of functions:
            1. Scalar Function
            2. Aggregate Function.
        
    2. Scalar Function:
        The Scalar Function in SQL are used to return a single value from the given input.
        
        Types:
            1. Number Function
            2. String Function
            3. Date and Time Function
            4. Database Function
            5. Advanced Function

    3. Number Function:
        1. ABS():
            Return the absolute value,
            i.e. a number return without it sign(-122 it is return to positive value)
        2. CEIL():
            Return the largest integer value that is not greater then passed numeric expression.
        3. FLOOR():
            Return the smallest integer value that is not less then passed numeric expression.
        4. EXP():
            EX: select exp(3); // 20.085536923187668
        5. FORMAT():
            select format(56.4548,2); // 56.45
            select format(56.4568,2); // 56.46
            select format(12345,"$##,###"); //12,345
        6. GREATEST():
            select greatest(5,8,4,6,3,9); // 9
        7. LEAST():
            select least(5,8,4,6,3,9); // 3
        8. ROUND():
            select round(45.4); // 45
            select round(45.6); // 46
            select round(45.456789,3); // 45.457
        9. LOG(BASE,NUMBER):
            select log(2,8); -- 2*2*2 = 8 2^3=8 //3
        10. LOG10():
            select log10(1000);//3
        11. MOD(): return reminder VALUE
            select mod(10,3); -- 10%3 = 1 // 1
        12. PI():
            select pi(); //3.141593
        13. POW():
            select pow(2,5); -- 2*2*2*2*2 = 32 // 32
        14. POWER():
            select power(2,5); -- 2*2*2*2*2 = 32 // 32
        15. SQRT():
            select sqrt(25); -- //5
        16. TRUNCATE:
            select truncate(45.7891245,2); //45.78
            select round(45.7891245,2); //45.79

8. MySQL String Function:
    This is called String (or) Text,CHAR,VARCHAR datatype function
    1. CONCAT:
        select concat("hello"," ","World"); -- // hello World
    2. INSTR:
        select instr("hellow world",'e'); //2
        select instr("hellow world",'w'); //6
    3. LENGTH:
        select length("hellow world"); //12
    4. FORMAT   :
        select format('20151625','##,###,###'); // 20,151,625
    5. LOWER:
        select lower("Hellow World"); //hellow world
    6. UPPER:
        select upper("Hellow World"); //HELLO WORLD
    7. REPLACE:
        select replace("Hellow World",'o','!'); //Hell!w W!rld
    8. LTRIM:
        select ltrim("               Hellow World"); //Hellow World
    9. RTRIM:
        select rtrim("Hellow World               "); //Hellow World
    10. TRIM:
        select trim("       Hellow World        "); // Hellow World
    11. LEFT:
        select left("Hellow World",5); //Hello
    12. RIGHT:
        select right("Hellow World",5); //World
    13. MID:
        select mid("Hellow World",5); //ow World
        select mid("Hellow World",3,5);//llow_
    14. SUBSTRING:
        select substring('Hellow World!',1,6); // Hellow
        select substring('Hellow World!',5); // ow World!
    15. SUBSTRING_INDEX:
        select substring_index('Hellow World!','l',1); //He
        select substring_index('Hellow World!','l',2); // Hel
        select substring_index('Hellow World!','l',3); // Hellow Wor
        select substring_index('Hellow World!','l',4); // Hellow World!
    16. ASCII: Refer to ascii Table
        select ascii('A'); // 65
    17. CHAR:
        not work in my SQL ASCII to char
        select char(65);

9. Date and TIME Function: Refer to source Code And .sql file
    1. ADDDATE
    2. ADDTIME
    3. CURDATE
    4. CURRENT_DATE
    5. CURRENT_TIME
    6. CURRENT_TIMESTAMP
    7. CURTIME
    8. DATE_ADD
    9. DATE_SUB
    10. DATEDIFF
    11. DATE_FORMAT
    12. DATE
    13. DAY
    14. MONTH
    15. YEAR
    16. DATNAME
    17. DAYOFMONTH
    18. DAYOFWEEK
    19. DAYOFYEAR
    20. LAST_DAY
    21. LOCALTIME
    22. LOCALTIMESTAM
    23. MAKEDATE
    24. MAKETIME
    25. MICROSECOND
    26. NOW
    27. HOUR
    28. MINUTE
    29. MONTHNAME
    30. PERIOD_ADD
    31. PERIOD_DIFF
    32. QUATER
    33. SCE_TO_TIME 
    33. STR_TO_DATE 
    34. SUBDATE
    35. SUBTIME
    36. SYSDATE
    37. TIME_FORMATE
    38. TIME_TO_SEC
    39. TIME
    40. TIMEDIFF
    41. TIMESTAMP
    42. TIMESTAMPADD
    43. TIMESTAMPDIFF
    44. UTC_DATE
    45. UTC_TIME
    46. UTC_TIMESTAMP
    47. WEEK
    48. WEEKDAY
    49. WEEKOFYEAR

    NOTES:
        Refer image in doc describe all methods are important .and green fonts are mostly used for real time projects.

10. MySQL DATABASE FUNCTION:
    1. VERSION():
        return the MySQL Version
    2. DATABASE():
        Return the current database.
    3. CONNECTION_ID():
        Return The connection Id for the current connection.
    4. CURRENT_USER():
        Return the user name or host name for the MySQL account
    5. SESSION_USER():
        Return the current user name and host name for the MySQL.
    6. SYSTEM_USER():
        Return the current user name and host name for the MySQL.
    7. USER():
        Return the current user name and host name for the MySQL.

11. MySQL ADVANCED FUNCTIONS:
    1. BIN():
        Return BINARY REPRESENTATION OF A NUMBER.
        select bin(15); // 1111
    2. BINARY():
        Return BINARY REPRESENTATION OF A NUMBER.
        select binary('mySQL');
    3. CAST(VALUE AS DATABASE):
        CONVERT A VALUE IN A SPECIFICED DATATYPE.
        select cast('20220518' AS date); // 2022-05-18
    4. CONVERT(DATA,VALUE):
        Covert ONE TYPE TO ANOTHER TYPE.
        select convert('20220518',date); // 2022-05-18
    5. CONV(NUMBER, FROM_BASE, TO_BASE):
        select conv(15,10,2); -- // 2 ref BIN
        select conv(25,10,8); -- // 8 ref OCTAL
        select conv(25,10,16);-- // 16 ref DEC
    6. COALESCE(VALUE1,VALUE2,VALUE3, ...):
        Return the first non-null value in a list:
        select coalesce(null,null,'b','c','d',null); // b   
    7. IF(CONSTION,TRUE,FALSE):
        select if(10>5, '10 is big','5 is big'); // 10 is big
    8. IFNULL: IFNULL(Field,Alternative Value)
        select ifnull(null,'**********');
        select student_id,ifNull(student_name,'###') from student;
    9. NULL(EXPR1, EXPR2):
        select nullif('ravi',student_name) from student;
        Explaination: if student_name is ravi print null other wise print ravi in all fields.
    10. ISNULL():
        select student_id,isnull(student_name) from student;
        if student_name is NULL return 1 Otherwise return 0
    11. ROW_COUNT():
        Return the number of rows fetched by the PL/SQL CURSOR.

12. MySQL AGGRECATION FUNCTION:
    MySQL's aggregate function is used to CALCULATON ON MULTIPLE VALUES AND RETURN IN A SINGLE VALUE.LIKE the average of all values, the sum of all values and minimum & maximum value among contain group if values. We mostly use the aggregation function with SELECT statement in the data query languages.
    
    1. Aggregation Functions:
        1. AVG():
            Calculate average for column value
        2. COUNT():
            Count of columns
        3. MAX():
            Get Maximum value of given column.
        4. MIN():
            Get Minimum value of given column.
        5. SUM():
            Get SUM value of given column.
    
    2. CLAUSE:
        1. WHERE CLAUSE:
            SELECT AVG(SALARY) FROM EMPLOYEE_DETAILS WHERE TEAM='MANAGER' AND SALARY < 5000;
        2. GROUP BY CLAUSE:
            SELECT AVG(SALARY) FROM EMPLOYEE_DETAILS WHERE TEAM='MANAGER' AND SALARY < 5000 ORDER BY EMP_ID;
        3. HAVING CLAUSE:

13. MySQL KEYS:
    1. What is MySQL Keys?
        A DBMS is an attribute or a set of attributes which help you uniquely identify a record of row of data in a relation(table).
    
    2. Why need Keys?
        1. for identifying any row of data in a table uniquely.
        2. we can force identify of data ensure integrity of data is maintained.
        3. We can established relation ship between tables and identifying relationship between tables.
    3. Types of Keys: - 
        1. SUPER KEY:
            It is nothing but a key which we just understood in the beginning.
            It is a commination of Table single attribute(column) or set of attributes(collection of columns) id.
            For Example:
                All Keys in our table student_id,email_id,id and compination of student_id + email_id, student_id+id,id+student_id+email_id
        2. CANDIDATE KEY:
            It is a minimal subset of super key
            If any proper subset of super key is a super key then that cannot be a candidate key.
        3. PRIMARY KEY:(Unique And Not-null)
            1. It is a candidate key choose to uniquely identify each row of data in a table.
            2. A Table have only one primary key.
        4. ALTERNATE KEY:
            It is a candidate key choose to uniquely identify each row of data in a table.
        5. FOREIGN KEY:
            It is an attribute(column) in a table which is used to define its RELATIONSHIP WITH ANOTHER TABLE.
            Using Foreign key helps in maintaining data integrity for table in relationship.
        6. COMPOSITE Key
            More then one super keys are called composite key.
        7. COMPOUND KEY
             FOREIGN KEY Attribute + PRIMARY KEY Attribute is called as compound key.
        8. SURROGATE KEY:
            It adds no meaning to the data but serves the sole purpose of identifying rows uniquely in a table.
            No Primary key and alternate key.

        9. NOTES:
            1. candidate key:
            ------------------
            id  => Alternate key
            student_id => Primary Key
            email_id => Alternate key

            2. super key
            -------------
            id+student_id
            student_id+email_id
            id+email_id
            id+student_id+email_id

            3. composite key:
            -----------------
            More then one superkey
            (id,student_id,email_id)

            4. compound key:
            -----------------
            superkey+foregin key
            (id,branch_code)
            (student_id,branch_code)
            (email_id,branch_code)

14. MySQL CONSTRAINTS PART-1
    1. Introduction to MySQL Constraints:
        MySQL constraints are statements that can be applied at the column level or table level to specify rules for the data that can be entered into a column or data table,
        i.e Constraints are basically limitation or restriction on the type of data and hence they ensure reliability, consistency, and accuracy of the data.  

    2. Type of SQL Constraint:
        1. PRIMARY KEY:
            It is unique identifies a row in the table, It is combination of Unique and Not null constraints.
        2. FOREIGN KEY:
            It is like a primary Key constraints only.
            But it is primary key of another table.
        3. CHECK:
            It ensure that a column accept values within the SPECIFIES RANG OF VALUE.
        4. NOT NULL:
            It ensure that a COLUMN CANN'T ACCEPT NULL VALUES.
        5. UNIQUE:
            It ensure that a COLUMN CANN'T ACCEPT DUBLICATE VALUES.
        6. DEFAULT:
            It ensure the column SET A DEFAULT VALUE FOR EMPTY RECORDS. 
    3. 1. PRIMARY KEY:
        syntax:
            CREATE TABLE <TABLENAME>(
                COLUMN-1 DATATYPE,
                COLUMN-2 DATATYPE,
                .
                .
                COLUMN-n DATATYPE,
                PRIMARY KEY(COLUMN-1)
            );
        EXAMPLE:
            CREATE TABLE STUDENTS(
                REG_NO INT,
                STUDENT_NAME VARCHAR(50),
                AGE INT,
                PRIMARY KEY(REG_NO)
            );
    3. 2. FOREIGN KEY:
        syntax:
            CREATE TABLE <TABLENAME>(
                COLUMN-1 DATATYPE,
                COLUMN-2 DATATYPE,
                .
                .
                COLUMN-n DATATYPE,
                FOREIGN KEY(COLUMN_NAME) REFERANCE (PARENT_TABLE_COLUMN)
            );
        EXAMPLE:
            1. CREATE PARENT TABLE:
            ---------------------
            CREATE TABLE DEPARTMENT(
                DEPT_ID VARCHAR(20) PRIMARY KEY,
                DEPT_NAME VARCHAR(30),
                DEPT_HEAD VARCHAR(50)
            );
            2. CHILD TABLE:
            ------------
            CREATE TABLE FORGINTABLE(
                REG_NO INT PRIMARY KEY,
                STUDENT_NAME VARCHAR(50),
                DEPT_ID VARCHAR(50),
                AGE INT,
                FOREIGN KEY (DEPT_ID)REFERENCES DEPARTMENT(DEPT_ID)
            );
    4. MAPPING ONE TO MANY:
        STUDENT                                                                                                MARK_TABLE
        PRIMARY KEY=>  REGNO | STUDENT NAME | AGE              FORRGIN KEY IN  sTUDENT PRIMARY KEY->  REGNO | MARK1| MARK2 | MARK3
                       1000  | Ganesh       | 23                                                      1000  | 80   | 90    | 34         
                                                                                                      1000  | 96   | 52    | 64         

15. MySQL CONSTRAINTS PART-2:
    1. 3. CHECK CONSTRAINTS:
        syntax:
            CREATE TABLE <TABLENAME>(
                COLUMN-1 DATATYPE,
                COLUMN-2 DATATYPE,
                .
                .
                COLUMN-n DATATYPE,
                CHECK (CONDITION)
            );
                    (OR)
            CREATE TABLE <TABLENAME>(
                COLUMN-1 DATATYPE,
                COLUMN-2 DATATYPE,
                .
                .
                COLUMN-n DATATYPE,
                CONSTRAINT CONSTRAINT_NAME CHECK(CONDITION)
            );   
        EXAMPLE:
            CREATE TABLE VOTE(
                VOTER_ID INT PRIMARY KEY,
                VOTER_NAME VARCHAR(50),
                VOTER_AGE INT,
                CONSTRAINT AGE_CHECK CHECK (VOTER_AGE >= 18) 
            );

    2. DROP CHECK CONSTRAINTS:
        ALTER TABLE <TABLENAME> DROP CHECK CONSTRAIN_NAME;
        (OR)
        ALTER TABLE TABLE_NAME DROP CONSTRAINT CONSTRAINT_NAME

        EXAMPLE:
            ALTER TABLE MYDB.VOTE DROP CONSTRAINT AGE_CHECK;
    3. 4. NOT NULL CONTRAINT:
        CREATE TABLE <TABLENAME>(
                COLUMN-1 DATATYPE,
                COLUMN-2 DATATYPE NOT NULL,
                .
                .
                COLUMN-n DATATYPE
            );
        EXAMPLE:
            CREATE TABLE NOTNULL(
                VOTER_ID INT PRIMARY KEY,
                VOTER_NAME VARCHAR(50) NOT NULL,
                VOTER_AGE INT
            );

            Error Code: 1364. Field 'VOTER_NAME' doesn't have a default value
    4. ALTER NOT NULL:
        EXAMPLE:
            ALTER TABLE NOTNULL MODIFY VOTER_AGE INT NOT NULL;
    5. UNIQUE COTRAINTS:
        1. The UNIQUE constrain ensure that all values in a column are different.
        2. Both UNIQUE and PRIMARY key contains provide a guarantee for uniqueness for a column or set of columns.
        3. A PRIMARY KEY Automatically contain a unique constraint.
        4. many - unique constraints per table ,only one - primary key contains a table.
        5. UNIQUE constraints ALLOW NULL AT ONE TIME.
    
    6. MySQL DEFAULT Contains:
        CREATE TABLE EMPLOYEE(
            EMP_ID INT NOT NULL,
            EMP_NAME VARCHAR(50) DEFAULT '***',
            DOJ DATETIME DEFAULT(NOW())
        );

16. MySQL UNION OPERATOR:
    The UNION Operator is used to compline two are more SELECT Statement.
    1. RULES:
        1. Every select statement within UNION must have the SAME NUMBER OF COLUMNS.
        2. The columns must also have SIMILAR DATATYPE.
        3. The columns in every select STATMENT MUST ALSO BE IN THE SAME ORDER.
    2. UNION : (Avoiding Duplicate record)
        Syntax :
            SELECT column_name(s) FROM table1
            UNION
            SELECT column_name(s) FROM table2;
    3. UNION ALL Syntax: (Show all Data Including duplicate)
        Syntax
            SELECT column_name(s) FROM table1
            UNION ALL
            SELECT column_name(s) FROM table2;

17. MySQL JOIN: REFER TO SQL FILE
    A JOIN is used to combine rows from teo or more tables, Based on a related columns between them.
    1. TYPES OF JOIN:
        1. (INNER) JOIN:
            Return The records that have matching values in both table.
        2. LEFT (OUTER) JOIN:
            Return all Records FROM THE LEFT TABLE, And MATCH RECORDS FROM THE RIGHT TABLE.
        3. RIGTH (OUTER) JOIN:
            Return all Records FROM THE RIGHT TABLE, And MATCH RECORDS FROM THE LEFT TABLE.
        4. FULL (OUTER) JOIN:
            Return all records when their is a match in either left or right table.
            NOTE:
                You don't have full join in my MySQL, but you can sure emulate them using UNION | UNION ALL Keyword.
        5. SELF JOIN:
            A Self join is a regular join, But the table is joined with itself.
        6. CROSS JOIN :
            The CROSS JOIN Keyword returns all records from both tables(table1 and table2).
    2. MySQL ALISH:
        1. It a temporary Name to a table or a column in a table for the PERFOSE of particular query.
        2. It work a nick name for expressing the table or column names.
        3. It make a query sort and neat.
        4. It make the name of a column more readability.
        5. MySQL ALIAS can exist only for the duration of a query.
    3. Advantage of MySQL ALIAS:
        1. It is performed in the case when more then one table is going to use query.
        2. It provides very useful and flexible feature that allows us to achieve complex tasks quickly.
        3. It make the column or table name more readable.
        4. It is useful when you use the function in the query.
        5. It can allow us to combines two or more columns
        6. It is also useful when the column names are big or not readable.  
    4. SYNTAX:
        FOR COLUMN:
            SELECT col_name AS alias name FROM table_name;
        FOR TABLE:
            SELECT col_name1,col_name2,... FROM table_name AS alias_name;  

18. MySQL SUBQUERY:
    1. SUBQUERY NOTES:
        A Subquery is a SQL Query nested inside a large query.
        1. A SUBQUERY may occur in:
            - SELECT
            - FROM 
            - WHERE
        2. A SUBQUERY is usually added within the WHERE clause of another SQL SELECT statement.
        3. You can use the comparison operators, such as >,<,or =.The Complication operator can also be a multiple-row operators, such as IN,ANY,SOME OR ALL
        4. tHE INNER QUERY EXECUTE FIRST BEFORE ITS PARENT QUERY.SO, The result is inner query can pass the out for outer query.
    2. VIEW in MySQL:
        1. view is a virtual table based on the result set of an SQL statement.
        2. A view contain rows and columns, Just like a real table.
        3. A Fields ina view are fields from another two are more tables in a database.
        4. you can add SQL statements and functions to a view.

        5. A View is create with the CREATE VIEW statement.

        6. CREATE VIEW syntax:
            CREATE VIEW view_name AS SELECT col-1,col-2,col-3,...
            FROM table_name
            WHERE condition;

        7. example:
            CREATE VIEW STUDENT_VIEW AS SELECT
                T1.REG_NO AS 'STUDENT_ID',
                T1.STUDENT_NAME AS 'STUDENT_NAME',
                T1.DEPT_ID AS 'DEPARTMENT_ID',
                T2.DEPT_NAME AS 'DEPARTMENT_NAME',
                T2.DEPT_HEAD AS 'DEPARTMENT_INCHARCH',
                T1.AGE 
                FROM FORGINTABLE  T1
                LEFT JOIN DEPARTMENT T2 ON
                    T2.DEPT_ID = T1.DEPT_ID;
        8. ALTER VIEW SYNTAX:
            ALTER VIEW view_name AS SELECT col-1,col-2,col-3,...
            FROM table_name
            WHERE condition;
                    (OR)
            CREATE OR REPLACE VIEW view_namE AS SELECT col-1,col-2,col-3,...
            FROM table_name
            WHERE condition;
        9. DROP VIEW SYNTAX:
            DROP VIEW view_name;
    3. INDEX:
        1. INDEX are used to retrieve data from the database more quickly than otherwise.
        2. TYPES:
            1. CREATE INDEX
            2. CREATE UNIQUE INDEX
        3. CREATE INDEX SYNTAX:
            Create a INDEX on a table.
            Duplicate values are allowed.

            CREATE INDEX index_name ON table_name(col1, col2,...);
        --------------------------------------------------------------
        4. CREATE UNIQUE INDEX SYNTAX:
            Create Unique index on a table.
            It is not allowed duplicate values.

            CREATE INDEX index_name ON table_name(col1, col2,...);
        ---------------------------------------------------------------
    4. SUMMARY:
        1. Indexes are more powerful when it comes to greatly improving the performance of MySQL search queries.
        2. Indexes can be defined when creating a table or added later on after the table has already been created.
        3. You CAN DEFINE INDEXES MORE THEN ONE COLUMNS.
            ex:  CREATE UNIQUE INDEX STUDENT_INDEX ON STUDENTS(ID, student_id); 
        4. The SHOW INDEXES FROM table_name is used to display the defined indexes on a table.
            ex:  SHOW INDEXES FROM STUDENTS;
        5. The DROP command is used to remove a defined index on a given table.
            ex:  DROP INDEX STUDENT_INDEX ON STUDENTS;

19. MySQL - Stored Procedure And Function:
    1. STORED PROCEDURE:
        1. IT IS A COLLECTION OF PRE-COMPILED SQL STATMENTS STORED INSIDE THE DATABASE.
        2. IT IS A SUBROUNTINE OR SUPPROGRAM IN THE REGULAR COMPUTING LANGUAGE.
        3. A PROCEDURE ALWAYS CONTAINS A NAME,PARAMETER LISTS, and SQL STATEMENT.

    2. STORE PRODUTURE FEAUTURES:
        1. It is INCREASE THE FERFORMENCE OF THE APPLICATION. Once, store procedure are created ,they are compiled and stored in the database.
        2. IT IS REDUCE THE TRAFFIC BETWEEN APPLICATION AND DATA SERVER. Because the application has send only the store procedure's name and parameter instead of sending multiple SQL Statement.
        3. It is reusable and transparent to any applications.
        4. A Procedure is always secure. The database administrator can grand permission to application the access store procedure in the database without giving any permission on the database table.

    3. How to create a PROCEDURE?
        1. SYNTAX:
            DELIMITER && 
            CREATE PROCEDURE procedure_name[[IN | OUT | INOUT] parameter_name datatype,[parameter_datatype]]
            BEGIN
                Declaration_section
                Executable_statement
            END &&
            DELIMITER;
            sample:
                USE `student_details`;
                DROP procedure IF EXISTS `first_procedure`;

                DELIMITER $$
                USE `student_details`$$
                CREATE PROCEDURE `first_procedure` (inout x int)
                BEGIN
                    select pow(x,3);
                END$$

                DELIMITER ;
            calling:
                SET @A=2;
                CALL first_procedure(@A);

        2. PARAMETER:
            IN parameter:
                It is default mode. It takes a parameter as input, such as an attribute. when we define it, the calling program as to pass an argument to the stored procedure. This parameter's value is always PRODUCTED.
            OUT parameter:
                It is used to pass a parameter as output.
                Its value can be changed inside the stored procedure, and the changed(new) value is passed back to the calling program.
                It is noted that a procedure cannot access the OUT parameter's initial value when it starts.
            INOUT Parameter:
                It is a combination of IN and OUT parameter.
                It means the calling program can pass the argument,and the procedure can modify the INOUT parameter ,and then passes the new value back to the calling program.

        3. How to CALL STORED PROCEDURE:
            1. When can use call statement to call a stored procedure.
            2. This statement return the value to its caller through its parameters(IN,OUT or INOUT).
            3. SYNTAX:
                CALL producture_name(parameter(s));

        4. How to DROP STORED PROCEDURE:  
            SYNTAX:
                DROP PROCEDURE[IF EXISTS] procedure_name;
        
    4. MySQL FUNCTION:
        1. create function:
            In mysql, function can be created.
            A Function always returns a value using the return statement.
            The function can be used in sql queries.

        2. syntax:
            CREATE FUNCTION function_name[(parameter datatype[,perameter datatype])]
            RETURNS return_datatype
            BEGIN
                declaration_section
                executable_section
            END;

            sample:
                CREATE FUNCTION `multiplication` (x int, y int)
                RETURNS INTEGER deterministic
                BEGIN
                    set @z=x*y;
                RETURN @z;
                END

        3. PARAMETER:
            function_name : name of the function.
            parameter : number of parameter. It can be one or more then one.
            return_datatype : return value datatype of the function
            declaration_section : all variables are declared.
            executable_section : code of the function is written here.

20. 21. TRIGGERS:
    1. MYSQL TRIGGER:
        IT IS A SPECIAL TYPE OF STORE PROCEDURE THAT invoke automatically in response to an event.
        It is active automatically when the DML Statement execution.
        such as, INSERT, UPDATE AND DELETE.

    2. WHY WE NEED/USE TRIGGER FUNCTION:
        TRIGGER HELP US TO
            ENSURE BUSINESS RUELS,
            VALIDATE DATA BEFOR INSERT OR DELETE,
            MAINTAIN TO LONG RECORD.
        IT is alternative way to check the integrity of data.
        Increase the performance of SQL Query.
        Reduce the client-side code that saves time and effect.
        Trigger are easy to maintain.

    3. Types of TRIGGERS:
        1. BEFORE INSERT
        2. AFTER INSERT
        3. BEFORE UPDATE
        4. AFTER UPDATE
        5. BEFORE DELETE
        6. AFTER DELETE
    
    4. CREATE TRIGGER SYNTAX:
        CREATE TRIGGER trigger_name(AFTER | BEFORE)(INSERT | UPDATE | DELETE) 
        ON table_name FOR EACH ROW
        BEGIN
            -- variable declaration
            -- trigger code
        END;

        SAMPLE:
            DELIMITER //
            CREATE TRIGGER EMPLOYEE_B_INSERT_TRIGGER
            BEFORE INSERT ON EMPLOYEE_1 FOR EACH ROW
            BEGIN
                IF NEW.DOJ IS NULL THEN
                    SET NEW.DOJ = NOW();
                END IF;
            END //
    5. DROP TRIGGER SYNTAX:
        DROP TRIGGER [IF EXISTS][schema_name.] triger_name;

22. MySQL DCL COMMENDS :
    1. User Creation and Modification:
        create user 'inmakes' identified by 'Inmakes@123';
        NEW VERSION ABOVE 5.76 :
            alter user 'inmakes' identified by 'Inmakes@456';
        OLD VERSION:
            SET PASSWORD FOR 'ROOT' =PASSWORD('new Password');

    2. show all users:
        select user from mysql.user;

    3. show current user:
        select current_user();

    4. LOGIN to the specifc user:
        system mysql -u '<username>' -p;
        password:<password>
        EX:
            mysql> system mysql -u 'inmakes' -p;
            Enter password: ***********

    5. DROP USER:
        DROP USER '<username>'
        EX:
            DROP USER 'INMAKES';
    
    6. Types of privillages:
        1. ALL PRIVILEGES - ALL GRAND PERMISION FOR ANOTHER USER
        2. CREATE - PERMISION ONLY FOR CREATION 
        3. DROP - PERMISSION ONLY FOR DROP
        4. SELECT - PERMISSION ONLY FOR SELECT
        5. INSERT - PERMISSION ONLY FOR INSERT
        6. UPDATE - PERMISSION ONLY FOR UPDATE
        7. DELETE - PERMISSION ONLY FOR DELETE

    7. SYNTAX FOR PRIVILAGES:
        GRANT ALL PERMISSION ON *.* TO INMAKES@LOCALHOST;      
        (OR)
        GRANT INSERT,SELECT ON *.* TO INMAKES@LOCALHOST; 
        ex:
            grant insert,select on student_details.students to 'inmakes';

    8. SHOW PRIVILAGES FOR CURRENT USER SYNTAX:
        show grants;
        (OR)
        show grants for 'inmakes';
    
    9. REVOKE PERMISSION:
        REVOKE PERMISSION:
            REVOKE SELECT,UPDATE ON <database_name> FROM '<user_name>';
            EX:
                revoke select on student_details from 'inmakes';
                mysql> show grants;
            RESULT:
                +-------------------------------------------------------------------------------+
                | Grants for inmakes@%                                                          |
                +-------------------------------------------------------------------------------+
                | GRANT USAGE ON *.* TO `inmakes`@`%`                                           |
                | GRANT INSERT, UPDATE, DELETE ON `student_details`.`students` TO `inmakes`@`%` |
                +-------------------------------------------------------------------------------+
                2 rows in set (0.00 sec)
        REVOKE ALL PERMISSION:
            REVOKE ALL ON <database_name> FROM '<user_name>';
            EX:
                revoke all on student_details.students from 'inmakes';
            RESULT:
                mysql> show grants;
                +-------------------------------------+
                | Grants for inmakes@%                |
                +-------------------------------------+
                | GRANT USAGE ON *.* TO `inmakes`@`%` |
                +-------------------------------------+
                1 row in set (0.00 sec)

    10. Basic Commands for MySQL.
        select current_user();
        show databases;
        use <database_name>;
        show tables;
 
23. MySQL TCL COMMENDS:
    MySQL IS AUTO COMMIT SOFTWARE.
    SET AUTOCOMMIT=0; -- // SET AUTOCOMMIT IS FALSE 
    1. COMMIT:
        SAVE THE CHANGES PERMANENTLY[SUCCESSFULLY TRANSACTION].
        QUERY:
            COMMIT;

    2. ROLL BACK:
        UNDOING THE CHANGES DONE[UNSUCESSFUL  TRANSACTION]
        QUERY:
            ROLLBACK;

    3. SAVEPOINT:
        1. The SAVEPOINT in MySQL is used for dividing (or) breaking a transaction into multiple units,so that the user has a change of roll backing the TRANSACTION UPTO A SPECIFIED POINT.
        2. THAT MEANS USING SAVEPOINT WE CAN ROLLBACK A PART OF A TRANSACTION INSTREAD OF THE ENTIRE TRANSACTION.

    4. EXAMPLE FOR SET SAVEPOINT IN QUERY:
        mysql> INSERT INTO DEPT_DETAILS VALUES (1,'CHENNAI','TN01','HR');
        Query OK, 1 row affected (0.00 sec)

        mysql> SAVEPOINT A;
        Query OK, 0 rows affected (0.00 sec)

        mysql>  INSERT INTO DEPT_DETAILS VALUES (2,'COIBATURE','TN02','TECHNICAL');
        Query OK, 1 row affected (0.00 sec)

        mysql> SAVEPOINT B;
        Query OK, 0 rows affected (0.00 sec)

        mysql>  INSERT INTO DEPT_DETAILS VALUES (3,'SELAM','TN03','SELAM');
        Query OK, 1 row affected (0.00 sec)

        mysql> SAVEPOINT C;
        Query OK, 0 rows affected (0.00 sec)

        mysql> INSERT INTO DEPT_DETAILS VALUES(4,'MADURAI','TN04','MADURAI');
        Query OK, 1 row affected (0.00 sec)

        mysql> SAVEPOINT D;
        Query OK, 0 rows affected (0.00 sec)

    5. ROLLBACK BASED ON SAVEPOINT:
        mysql> SELECT * FROM DEPT_DETAILS;
        +---------+--------------+-----------+-----------+
        | DEPT_ID | DEPT_ADDRESS | SEPT_CODE | DEPT_NAME |
        +---------+--------------+-----------+-----------+
        |       1 | CHENNAI      | TN01      | HR        |
        |       2 | COIBATURE    | TN02      | TECHNICAL |
        |       3 | SELAM        | TN03      | SELAM     |
        |       4 | MADURAI      | TN04      | MADURAI   |
        +---------+--------------+-----------+-----------+
        4 rows in set (0.00 sec)

        mysql> ROLLBACK TO SAVEPOINT C;
        Query OK, 0 rows affected (0.00 sec)

        mysql>  SELECT * FROM DEPT_DETAILS;
        +---------+--------------+-----------+-----------+
        | DEPT_ID | DEPT_ADDRESS | SEPT_CODE | DEPT_NAME |
        +---------+--------------+-----------+-----------+
        |       1 | CHENNAI      | TN01      | HR        |
        |       2 | COIBATURE    | TN02      | TECHNICAL |
        |       3 | SELAM        | TN03      | SELAM     |
        +---------+--------------+-----------+-----------+
        3 rows in set (0.00 sec)

        mysql> ROLLBACK TO SAVEPOINT B;
        Query OK, 0 rows affected (0.00 sec)

        mysql> SELECT * FROM DEPT_DETAILS;
        +---------+--------------+-----------+-----------+
        | DEPT_ID | DEPT_ADDRESS | SEPT_CODE | DEPT_NAME |
        +---------+--------------+-----------+-----------+
        |       1 | CHENNAI      | TN01      | HR        |
        |       2 | COIBATURE    | TN02      | TECHNICAL |
        +---------+--------------+-----------+-----------+
        2 rows in set (0.00 sec)

        mysql> COMMIT;
        Query OK, 0 rows affected (0.01 sec)

        mysql> ROLLBACK TO SAVEPOINT A;
        ERROR 1305 (42000): SAVEPOINT A does not exist
        mysql> ROLLBACK;
        Query OK, 0 rows affected (0.00 sec)

        mysql> SELECT * FROM DEPT_DETAILS;
        +---------+--------------+-----------+-----------+
        | DEPT_ID | DEPT_ADDRESS | SEPT_CODE | DEPT_NAME |
        +---------+--------------+-----------+-----------+
        |       1 | CHENNAI      | TN01      | HR        |
        |       2 | COIBATURE    | TN02      | TECHNICAL |
        +---------+--------------+-----------+-----------+
        2 rows in set (0.00 sec)

--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------
99. NOTES:
    1. row (or) record (or) tuple are same meaning
    2. column (or) field (or) attribute are same meaning