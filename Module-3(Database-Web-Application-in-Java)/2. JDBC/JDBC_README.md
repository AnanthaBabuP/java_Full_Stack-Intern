# Database-Web-Application-in-Java
Internship-Course

ADVANCED JAVA:
JDBC: -> JAVA DATABSE CONNECTIVITY
JDBC INDEX CONTENT:
1. JDBC - JAVA DATABSE CONNECTIVITY (PART-1):

    1. JDBC INTRODUCTION :
        JDBC is a Application Programming Interface(API) Use to connect java application with database.
        JDBC interact with various type of databases such as, Oracle, MS Access, MySQL and SQL server.
        It can also be defined as the platform-Independent interface between relational database and java program.
        It allows java program to execute SQL statement to store and retrieve result from database.
        JDBC API constrain of classes and methods that are used to perform various operations, Like:
            connect,
            read,
            write,
            store data in the database.  

    2. How connect JDBC on java application:
        Refer to image.

    3. WHAT'S NEW IN JDBC:
        1. version 4.0 Advance specifications,
            1. connection Management
            2. Auto loading if Driver Interface
            3. better experience handling.
            4. support for large object
        2. version 4.1 Advance specifications,
            Introduced with java SE7.
            1. Allow to use a try-with-resources statement to automatically close resource of the type of connection, Resultset etc..
            2. introduce the RowSetFactory interface and the RowSetProvider class to create all type of row set suport by your JDBC driver.
        3. version 4.2 Advance specifications,
            Introduced with java SE8.
            1. The REF_CURSOR Support.
            2. Added in interface java.sql.DriverAction;
            3. Added in interface java.sql.SQLType;
            4. Added an Enum java.sql.JDBCType;
            5. Add support for large update count
            6. Improve the existing interfaces: Driver, DriverManage, DatabaseMeteData.
            7. Interface and classes enhance for RowSet1.2.
        4. version 4.3:
            Added support to Statement for enquoting literals and simple identifiers.
            Added sharding support.
            Enhanced connection to be able to provide hints to the driver that a request, An Indipendent unit of work, is beginning or ending.
            Enhance DtaBaseMetaData to determine if sharding is supported.
            Add the method drive to DriverManger to return a Stram of the currnt loaded and available JDBC drivers.
    4. JDBC Driver;
            It is establish connection between java application with database.
            It is also help to process SQL request and generating result.
            TYPE OF JDBC CONNECTION - 4 TYPES:
                1. TYPE-1 Driver or JDBC-ODBC bridge Driver
                2. TYPE-2 Driver or Native API Partly Java Driver
                3. TYPE-3 Driver or Network Protocol Driver
                4. TYPE-4 Driver or Thin Driver

2. JDBC - JAVA DATABSE CONNECTIVITY (PART-2):   
    1. TYPE-1 Driver or JDBC-ODBC bridge Driver:
        1. TYPE-1 Driver act as a bridge between JDBC and Other database connectivity(ODBC) machanism.
        2. This driver convert JDBC calls into ODBC calls and redirect the request to the ODBC driver.
        3. Advantages:
            1. Easy to use 
            2. Allows easy connectivity to all database supported by the ODBC Driver.
        4. Disadvantages:
            1. slow execution time 
            2. dependent on ODBC driver.
            3. Use Java Native Interface(JNI) to make ODBC calls.
        5. NOTES:
            In java8, the JDBC-ODBC Bridge has been removed. 
    
    2. TYPE-2 Driver or Native API Partly Java Driver:
        1. This type of driver make use of java Native interface(JNI) call on database specific native client API.
        2. This Native API usually written in C and C++.
        3. Advantages:
            faster as compare to Type-1 Driver.
            Contains Adding feature.
        4. Disadvantages:
            Requires Native library
            Increase Cost Of Application.

    3. TYPE-3 Driver or Network Protocol Driver:
        1. This driver translate JDBC calls into a database independent and middleware server-specific calls.
        2. middleware server further translate JDBC calls into database specific calls.
        3. Advantages:
            Does not require any native library to be installed.
            database Independent
            provide facility to switch over from one database to another database.
        4. Disadvantages:
            slow due to Increase the number of network call.
    
    4. TYPE-4 Driver or Thin Driver: - 100% pure Java Driver   
        1. This is driver called PURE JAVA DRIVER.
        2. This Driver DIRECTLY INTRACT WITH DATABASE.
        3. It DOESN'T REQUIRE ANY NATIVE DATABASE LIBRARY, that is why it's also know as Thin driver.
        4. Advantages:
            1. Doesn't require any native library.
            2. Doesn't require any middleware server.
            3. Better performance than other drivers.
        5. Disadvantages:
            slow due to increase number of network calls.
        

    5. JDBC Data Types;
        1. The JDBC convert the java data type to the appropriate JDBC type, before send it to the database.
        2. It use a default mapping for most datatype.
        For Example, a java int is convert into SQL INTEGER .
        3. default mapping create to provide consistency between drivers.
        4. The following table Summarized the default JDBC data type that the java data type is converted to,
            WHEN YOU CALL THE SETXXX() METHOD FOR PreparesStatment 
            (or)
            CallableStatment object 
            (or)
            Resultset.updateXXX() methods.
        5. Data Types:
            --------------------------------------------------------------------------------------------------------------------------------------------------------------------
            SQL Data Type	                                  | JDBC/Java Data Type	               |setXXX	                               |getXXX
            --------------------------------------------------------------------------------------------------------------------------------------------------------------------
            CHAR, VARCHAR, LONGVARCHAR	                        Java.lang.String	                setString	                            getString
            BIT, BOOLEAN, TINYINT, SMALLINT, INTEGER, BIGINT    long	                            setBoolean, setByte, setInt, setLong	getBoolean, getByte, getInt, getLong
            REAL, FLOAT, DOUBLE	                                double	                            setFloat, setDouble	                    getFloat, getDouble
            DATE, TIME, TIMESTAMP	                            java.sql.Date, java.sql.Time, 
                                                                    java.sql.Timestamp	            setDate, setTime, setTimestamp	        getDate, getTime, getTimestamp
            BINARY, VARBINARY, LONGVARBINARY	                byte[]	                            setBytes	                            getBytes
            CLOB, BLOB	                                        java.sql.Clob, java.sql.Blob	    setClob, setBlob	                    getClob, getBlob
            ARRAY	                                            java.sql.Array	                    setArray	                            getArray
            REF	                                                java.sql.Ref	                    setRef	                                getRef
            STRUCT	                                            java.sql.Struct	                    setStruct	                            getStruct

    6. DRIVER MANAGEMENT CLASS:
        1. Driver Management class it an interface between User and Driver.
        2. This class is used to have a watch on the driver which is being used for establishing the connection between a database and a driver. 
        3. The DriverManager class has a list of Driver classes that are registered and are called using DriverManager.registerDriver().
        4. Methods:
            1. public static void registerDriver(Driver driver);
            2. public static void deregisterDriver(Driver driver);
            3. public static connection getConnection(String url);
            4. public static Connection getConnection(String URL, String username, String password);
        
        5. CONNECTION INTERFACE:
            1. In java, The Connection interface is used for creating session between the applkication and the database.
            2. This interface contains statement ,PrepareStatement and  and DatabaseMetaData. 
            3. The connection objects are used in Statement and the DatabaseMetaData. 
            4. commit(), rollback(), etc. are some of the methods of Connection.            

            5. METHODS:
                1. public Statement createStatment();
                2. public Statement createStatment(intresultset type,intresultset Concurrency);
                3. public void setAutoCommit(boolean bollean_status); // default autocommit is true
                4. public void commit(); 
                5. public void rollback();
                6. public void close();
                    It is used to delete the changes which have been commit or rollback permanent.
        
        6. RESULTSET INTERFACE:
            1. In Java, the ResultSet Interface is used for maintaining the pointer to a row of a table. In starting the pointer is before the first row. The object can be moved forward as well as backward direction using TYPE_SCROLL_INSENSITIVE or TYPE_SCROLL_SENSITIVE in createStatement(int,int). Methods of this interface is given below.

            2. METHODS:
                1. public boolean next();
                    It is used for moving the cursor to the next position from the current position.

                2. public boolean previous();
                    It is used for moving the cursor to the previous position from the current position.

                3. public boolean first();
                    It is used for moving the cursor to the first position from the current position.

                4. public boolean last();
                    It is used for moving the cursor to the Last position from the current position.
                    
                5. public boolean absolute(int row);
                    It is used for moving the cursor to the specified position from the current position.

                6. public boolean relative(int row);
                    It is used for moving the cursor to the relative row number from the current position.

                7. public int getInt(intcolumn index);
                    It is used to get the data from the specified position.

                8. public int getint(String column_name);
                    It is used to get the data from the specified column name of the current row.

                9. public String getString(int columnIndex);
                    It is used to get the data from the specified column name of the current row in form of an integer.

                10. public String getString(String column_name);
                    It is used to get the data from the specified column name of the current row in form of string.


3. JDBC - JAVA DATABSE CONNECTIVITY (PART-3): 
    1. JDBC API:    
        1. It is mainly divided in two package.Each when we are using JDBC, we have to import this packages to use classes and interfaces in our application.
            1. java.sql
            2. javax.sql
   
    2. java.sql Package:
        1. This pagage include classes and interfaces to perform all JDBC Operation Such as creating and executing SQL Queries.
        2. classes/Interface    
            1. java.sql.BLOP ; 
                Providing Support for BLOP(Binary Large Object) SQLtype.
                EX; images.

            2. java.sql.Connection; 
                create a connection with specific datatype.

            3. java.sql.CallableStatment; 
                Execute StoreProcedure.

            4. java.sql.CLOB;
                Providing Support for CLOP(Character Large Object) SQLtype.
                 EX; e-books, large size pdf.

            5. java.sql.Date;
                providing suport for Date SQL type.

            6. java.sql.Driver;
                Create a instance of Driver Management.

            7. java.sql.DriverManager;
                This class manage Dtaabase Driver.

            8. java.sql.PreparedStatment;
                Create and execute parameterized Query. 

            9. java.sql.ResultSet;
                It is an interface that provide methods to access the result row-by-row.

            10. java.sql.Savepoint;
                specify the savepoint in transaction.

            11. java.sql.SQLExecution;
                Encapsulate all JDBC related exceptions.

            12. java.sql.Statement;
                This interface is used to execute SQL Statement.
    3. javax.sql Package:
        1. This package also know as JDBC extension API.
        2. It provides classes and interface to access server-side-data. 
        3. classes/Interface:
            1. javax.sql.ConnectionEvent;
                Provide information about occurence of event.

            2. javax.sql.ConnectionEventListener;
                Used to register event generated by pooledConnection Object.

            3. javax.sql.DataSource;
                Represent the DataSource interface using in an application.

            4. javax.sql.PooledConnection;
                provide object to manage connection pool.

    4. JDBC conection Steps:
        1. Register driver
        2. Get Connection
        3. create Statement
        4. execute Query
        5. Close Connection

    5. Register Driver 
        JDBC API provide Class.forname() method ,which is used to load the driver class explicity.
        For Example:
            Class.forname("sun.jdbc.odbc.JdbcodbcDriver");
    
    6. Get Connection:
        Then will be create a connection using getConnection() Method of DriverManager class.
        Basically its Require database_name, user_name and password to establish connection.
        syntax:
            getConnection(String url);
            getConnection(String url, String user_name, String password);
            getConnection(Strig url,Property info);
        sample:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

    7. create SQL Statement:
        It will be create Statment for SQL Using createStatment() METHOD,
        It is used to execute the sql queries and defines to the connection class.
        syntax:
            public Statment createStatement() throws SQLException;
        example:
            Statement s = con.createStatement();
    
    7. Execute SQL Statement:
        create a stamen after we can execute using executeStatemt() of Statement interface.
        syntax:
            piublic ResultSet executeQuery(String query) throws SQLException;
        example:
            ResultSet rs = s.executeQuery("Select * from user");
            while(rs.next()){
                System.out.println("rs.getString(1)+" : "+rs.getString(2));
            }

    8. Closing Connection:
        The close() methos close the connection.
        syntax:
            public static void close() throws SQLException;
        example:
            con.close(); // It is close the connection after exection complete. 

4. JDBC - CRUD Operation: 
    1. CRUD Operations:  
        C -> Create (insert Operation)
        R -> Read (select Operation)
        U -> Update (Update Operation)
        D -> Delete (Delete Operation)
    2. Differance between statement, preparedStatment, CallableStatment: Refer to image
    3. Differance between executeQuery(),executeUpdate() and execute(): Refer to image

NOTES:
    if java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
    OPEN browser => mysql connector jar <version> downlaod -> MySQL :: Download Connector/J -> MySQL Product Archives -> product version and Operating System(Platform Independent) -> Platform Independent (Architecture Independent), ZIP Archive -> Download
    After -> unzip file ->
        Go to Eclipse -> Right Click on src head file -> property -> Java Build Path -> Library tab -> Add External Jar -> <extrat apath> -> mysql-connector-j<version> -> Add


