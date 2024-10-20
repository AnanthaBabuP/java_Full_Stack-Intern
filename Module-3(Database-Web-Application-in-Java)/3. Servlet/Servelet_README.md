# Database-Web-Application-in-Java
Internship-Course

SERVLET INDEX CONTENT:

1. Computer Network:
    1. Computer network refers to interconnected computing devices that can exchange data/files and share resources with each other.
    2. Theses Devices use Network Protocols, to transmit/share information/recourses on the network.

2. Network Protocol:
    1. Network Protocol is a set of roles that determine how data/files transmitted or sharing  between different devices in the networked devices to communicate with each other.
    2. It allows connect to regardless of any difference in tier internal processes, structure or design.

3. Type of Protocols:
    1. Communication Protocols:
        Used to transfer/share the data/recourse, they are like TCP/IP and HTTP.
    2. Management Protocols:
        MAINTAIN AND GOVERN THE NETWORK THROUGH PROTOCOLS SUCH AS ICMP,SNMP.
    3. Security Protocols:
        Include HTTPS,SFTP, and SSL.

4. OSI MODEL:
    1. PYSICAL
    2. DATA LINK
    3. NETWORK
    4. TRANSPORT
    5. SESSIONS
    6. ARRAGEMENT
    7. APPLICATION

5. CLIENT-SERVER MODEL:
    1 . This is a network model,
        client, is a system request  a service, resource, file or application from another system.
        server is a system that repones/serving the client.

6. 2-TIER ARCHITECTURE  :  CLIENT <->SERVER
    1. THE Client - server arch9iteccute is defined as two-tier architecture, client layer and Database layer.
7. 3-TIER ARCHITECTURE  :  CLIENT <-> SERVER <-> DATABASE
    1. It is defined as client layer, business layer and data layer.

9. Website:
    It is a collection of static files/web pages such as HTML pages ,text, images and videos, etc..

10. web Application:
    It is a collection of dynamic files/web pages of the server. ex, Google, Facebook etc...

11. Web server:
    It is handle with request and responses through the HTTP;


12. Apache Tomcat Server:
    It is a popular opensource web server and servlet container.
    It used to run java servlet and java server pages(JSP) that are based on the web applications.

13. Apache Web Server:
    It is designed to create the web-servers.
    It can host one or more HTTP based web-servers.
    It used to various web-hosting company.
    It is a Oldest web-server.

14. Difference Between Apache Tomcat Server VS Apache Web Server.
    0.       Apache Tomcat Server                       ||        Apache Web Server
    1. This server is a JSP/Servlet container.          || It is HTTP Server
    2. It can handle static and Dynamic Web-pages       || It is handle Static pages which are generator using HTML.
    3. Only Hostin java based codes                     || Hosting Any kind if codes
    4. It is capable for requesting and responding      || It capable for requesting, responding and loading balancing.
    5. It coded in Pure Java                            || It is coded in C Programming Language
    6. Tomcat server is slower compare to web server    || Apache web server is faster compare to tomcat server


15. Web Server-Google Web Server(GWS):

16. MVC Pattern
    M - model - java programs
    V - View - JSP/HTML
    C - Controller - java Servlet


17. Servlet;
    1. Servlet technology is used to create a web application(resides as server side and generate a dynamic web page).
    2. Servlet Technology is robust and scalable because of java language.
    3. There are many interface and classes in the servlet API, Such as Servlet, GenericServlet, HTTPServlet, ServletRequest, ServletResponse,etc...

    4. Image Ref:
        Interface -> Servlet
        Classes   -> GenericServlet implements Servlet
        Class     -> HTTPServlet extends GenericServlet

18. Servlet Pageages:
    1. javax.servlet
    2. javax.servlet.http

19. Important Classes and interface of a Servlet API.
    Interface
        1. Servlet - Declares Lifecycle Method of the servlet
        2. ServletConfig - Initialization Methods
        3. ServletContext - Enables the servlet to log access and access information 
        4. ServletRequest - Used to read data to client response.
        5. ServletResponse - Used to write data to client Request
    Classes:
        6. GenericServlet - Implements Server and Servlet.Config Interface
        7. ServletInputStream - Provide input stream to read request from the client
        8. ServletOutputStream -Provide output stream to write response to the client
        9. ServletException - Indicates that the servlet is not available.
        10. HttpServlet - Provide Methods to handle HTTP Request and Response.


19. 1. Servlet Interface :
    1. Servlet interface provide common methods to all servlets.
    2. To create Servlet Object , we must implements Servlet Interface or by means of its chiled classes GenericServlet or HttpServlet, it always perform to implement HTTPServlet. 
    
    3. 3 ways to create a Servlet:
        1. By extending HttpServlet class
        2. By extending GenericServlet class
        3. By implements Servlet Interface.

    4. Methods of Servlet Interface:
        1. init(Config config);
        2. service(ServletRequest request,ServletResponse response); -
        3. destroy()
        4. getServletConfig()
        5. getServletInfo()

        1. inti(Config config):
            It is used to Initialize Servlet.
            This Method is called only once by the web container when it loads the servlet.
            syntax:
                public void init(ServletConfig config) throws ServletException;
            Notes:
                Normally,nonparameterized init() Preferred.
        2. service(ServletRequest request, ServletResponse response):
            It is used to respond to a request.
            It is called for every new request by web container.
            syntax:
                public void service(ServletRequest req,ServletResponse res) throw ServletException;

        3. destroy():
            It is used to destroyed to the servlet
            syntax:
                public void destroy();

        4. getServletConfig():
            It is return a ServletConfig Object.
            This Config object is passed in init method.
            syntax:
                public ServletConfig getServletConfig();
        
        5. getServletInfo():
            It return a String of information about servlet's author, version and copyrights, etc...
            syntax:
                public String getServletInfo();

19. 6. GenericServlet:
    1. It is Implements Servlet, ServletConfig ,serializable.
    2. It provide the implementation of all the methods of these interfaces except the service method.
    3. GenericServlet class can handle any type of request so, it is Protocol-independent. 

    4. Method of genericServlet:
        1. init(SrvletConfig config);
        2. service(ServletRequest req,ServletResponse res);
        3. destory();
        4. getServletConfig();
        5. getServletInfo();
        // It all are implentation methods from Servlet

        6. init(); - public void init() throws ServletException;
        
        7. getServletContext():
            It return ServletContext object.
            syntax :  public ServletContext getServletContext();
        
        8. getInitParameter(String name) :
            It reurn the value for given parameter name.
            It returns Null if the parameter not exist.
            syntax : public String getInitParameter(String name);
        
        9. getInitParameterName();
            It return a name of servlet initialization parameters defined in web.xml file.
            syntax: public Enumeration getzInitParameter();
        
        10. getServletName():
                It return the name of servlet object.
                syntax : public String getServletName();
        
        11. log(String msg):
            This method write an specified message to the servlet log file.
            syntax : public void log(String msg)
        
        12. log(String msg, Throwable t) :
            This method explanatory message and exception.
            syntax : public void log(String msg, throwable t)

19. 10. HTTPServlet:
    1. It extends the GenericServlet class.
    2. It is protocol-dependent. is in javax.servlet.http package.
    3. Methods of HttpServlet Class:  Refer to image  
        1. service(ServletRequest req, ServletResponse res );
        2. service(HttpServletRequest req, HttpServletResponse res);
        3. doGet(HttpServletRequest req, HttpServletResponse res);
        4. doPost(HttpServletRequest req, HttpServletResponse res);
        5. doHead(HttpServletRequest req, HttpServletResponse res);
        6. doOptions(HttpServletRequest req, HttpServletResponse res);
        7. doPut(HttpServletRequest req, HttpServletResponse res);
        8. doTrace(HttpServletRequest req, HttpServletResponse res);
        9. doDelete(HttpServletRequest req, HttpServletResponse res);
        10. getLastModified(HttpServletRequest req);



20. Tomcat Servlet Installation Process with eclipse:
    1. Open eclipse -> Select workspace -> windows -> show view -> Other -> Servers -> Open 

    2. New Server -> Apache -> select latest version -> next 
    3. -> Click on Download and Install -> Select Tomcat Installation Directory 
    (OR )
    Most prepare 
    -> Open browser -> tomcat server download -> open official link -> (Right side bar) Download -> Select related version -> Archive -> select latest version  -> /bin -> click to .exe or .zip file

    -> After download -> click to open .exe file -> Next -> next -> Choose Component: Tomcat (service startup dick) (Optional) -> Host manager (Dick) -> next -> username, password(sample ('admin','admin')) -> next -> (Note this Download Directory) next -> installation process start -> Finish 

    -> Back to eclipse -> Brows -> (Download Directory) -> tomcat-version select -> next -> Finish


    (OR)
    1. Open eclipse -> Select workspace -> windows -> show view -> Other -> Servers -> Open 
    2. New Server -> Apache -> select latest version -> next 
    3. Open browser -> tomcat server download -> open official link -> (Right side bar) Download -> Select related version -> Archive -> select latest version  -> /bin -> click to .zip file -> unzip to workspace folder -> back to eclipse
    4. Browse _tomcat workspace location -> (If any require more then your installation version please download latest version java) next -> finish

    5. Servers tab-> created server -> right click -> start

20. 2. CREATE WEB APPLICATION:
    1. open eclipse -> file -> new -> (if)dynamic web project select (OR) (other -> type dynamic web project) -> Select -> <project name> -> Target runtime (select tomcat server) -> Next -> Next -> Must Generate web.xml..[Dike] -> finish

    2. Open src-> main -> webapp -> WEB-INF -> web.xml(double click)
    3. In case web.xml file is error show solution is (window -> preference -> validation -> XML Schema Validator and disable it by unchecking the box.) -> only one file declaration in xml file
    eg.<welcome-file>index.html</welcome-file> another welcome-file files are delete.-> select webapp -> right click -> new -> html file -> index.html -> insert body tag <h1> Welcome back to Html</h1> -> save all


20. 3. Run web Server
        click on webserver head folder -> right click -> run on -> server -> select server -> finish 


21. Create First Servlet in our Web Project.
    1. Create a folder in src/main/java -> folder Name -> com.demo.ServletPrg -> Right click -> new -> others -> servlet -> pagage:com.demo.ServletPrg, Class name:<className> -> Next -> Next -> Select needed methods like doget(). -> Finish


22. Difference between GET VS POST :
    get                                         Post
    1. Data is send to header body              Data is sent to a request Body
    2. Restricted to Limited data transfer      Support a large Number of Data Transfer
    3. It in not Secured                        It is Completely Secured
    4. It Can be bookmark                       It can't be 5.bookmark
    5. This method call to doGet() in Servlet   This method call to doPost() in Servlet

23. RequestDispater :
    It is Used for rendering Forward, include , backword move on pages
    ex:
        if(username.equals("inmakes") && password.equals("1234")) {
			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.html");
			rd.forward(request, response);
		} else {
			out.println("<h1 style=color:red;>Sory!! Invalid Username or Password...</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("loginForm.html");
			rd.include(request, response);
		}

24. Difference between RequestDispater VS sendRedirect methods:

25. Installing JSTL
    1. Tomcat 10.0:
        1. jakarta.servlet.jsp.jstl-2.0.0.jar
        2. jakarta.servlet.jsp.jstl-api-2.0.0.jar
    2. Download this Jar file in One Step
        https://jar-download.com/artifacts/org.glassfish.web/jakarta.servlet.jsp.jstl/2.0.0/source-code -> Click to "Download jakarta.servlet.jsp.jstl (2.0.0)" -> Open and Extract with Download file -> Select Above two files are Copy -> Paste to (Eclipse <your web application> WEB-INF -> lib )-> PASTE  

26. ServletConfig VS ServletContext:
    1. Servlet Config:
        1. 1. basic Information:
            1. An Object of ServletConfig is created by web container for each servlet.
            2. The Object can be used to get Configuration information from web.xml.
            3. If the configuration iniformation from the web.xml file, we don't need to cahge the servlet.So,It is easiare to manage the web application if any specific content is modified fro time to time. 
        1. 2. Advantage of ServletConfig:
            The core advantage of servletconfig is that you DON't NEED TO EDIT SERVLET FILE, IF INFORMATION IS MODIFY FROM THE web.xml file.
        1. 3. ServletConfig Methods:
            1. public String getInitParameter(String name); // return single parameter
            2. public Enumeration getInitParameterName(); // Return all parameters. 
            3. public String getServletName();
            4. public ServletContext getServletContext();
        1. 4. How to Get Servlet Configuration:
            1. getCorveletConfig() Method of servlet interface return the object of ServletConfig.
        1. 5. Syntax :
            public ServletConfig getServletConfig();
        
        1. 6. Sample Program: Refer to code
            1. XML File:
                <servlet>
                    <description></description>
                    <display-name>LoginServlet</display-name>
                    <servlet-name>LoginServlet</servlet-name>
                    <servlet-class>com.demo.ServletPrg.LoginServlet</servlet-class>
                    <init-param> // It is init Parameter
                        <param-name>userName</param-name>
                        <param-value>Admin</param-value>
                    </init-param>
                    <init-param>
                        <param-name>password</param-name>
                        <param-value>Admin@123</param-value>
                    </init-param>
                </servlet>
            2. Java File:
                // Servlet Configuation Interface
                ServletConfig config = getServletConfig();
                String configName = config.getInitParameter("userName");
                String configPassword = config.getInitParameter("password");
                
                System.out.println("Config UserName: "+configName); // Admin
                System.out.println("Config Password: "+configPassword); // Admin@123
    
    
    2. ServletContext:
        1. basic Information: 
            1. An Object of ServletContext is created by web COntainer at time of deploying the project.
            2. This Object can be used to get Cponfiguration information from web.xml file.
            3. There is Only one Servlet Context object per web application.
            4. If any information is share to many servlet, it is better to provide it from the web.xml file Using the <CONTEXT-PARAM> element.
        2. Advantage Of ServletContext:
            1. Easy to maintain,  If any information is share to many servlet, it is better to make it is available for all the server.
            2. We provide the information from the web.xml file, So if the information is changed, we don't need to madify the servlet.
            3. Thus removes maintenance Problem.
        3. Usage of ServletContext Interface:
            1. The Object of ServletContext provide an interface between container and servlet.
            2. The Servlet Object can be Used to get Configuration Information From web.xml.
            3. The Servlet Object is Used to set, get or remove attribute from the web.xml .
            4. The Servlet Object can be used to provide inter-application communication.
        4. Methods:
            1. public String getInitParameter(String name);
            2. public String setInitParameterName();
            3. public void setAttribute(String name, Object object);
            4. public Object getAttribute(String name);
            5. public void removeAttribute(String name);
        5. How to get the object of servletContext interface:
            1. getServletContext() method of ServletCongic(Protocol Depended) interface return the object of ServletContext.
            2. getServletContext() method of GenericServlet class return the object of ServletContext.
        6. syntax:
            public ServletContext getServletContext();


27. Session Management/Session Tracking in servlet:
    1. Session Tracking:
        1. Basic Information:
            1. The HttpSesssion Object is used for session management.
            2. A Session Contains information specific to a particular User across the whole application.
            3. It is Used for Security function.
            4. Http Protocol is used for Servlet, But Http is a stateless protocol.so, we used to Session to make client-server relationship stateful.
            5. The record of the object is known as Tracking.
        2. Why is session Tracking ?:
            1. Because Http Protocol is stateless, we require Session Tracking to make the client-server relationship stateful.
            2. Session Tracking is important for tracking in online shopping, mailing application and E-Commerce application.
            3. The Http protocol is stateless, which implies that each request is traded as a new one.
        3. Delete Session Methods:
            1. Remove Specific Session 
                public void removeAttribute(String name);
            2. Remove whole session:
                public void Invalidate();
            3. Setting session timeout:
                public void setMaxInactiveInterval(int interval); // seconds
            4. Log the user out On servers that support sevlet 2.4, you may use the logout method;
                logout()
            5. Set intervlel on web.xml file:
                <Session-config>
                    <session-timeout>20</sessiontimeout> // 20 represent to minutes
                </Session-config>
            6. Defaulut aboue time for 30 minutes
        4. Session Tracking employee Four Different techniques:(Important)
            1. cookies
            2. Form Hidden field.
            3. URL Rewriting
            4. HttpSession
        5. Methods:
            1. public void getAttribute(String name);
            2. public Enumeration getAttributeNames();
            3. public long getCreationTime();
            4. public String getId();
            5. public long getAccessTime();
            6. public getMaxInactiveInterval();
            7. public void inactive();
            8. public boolean isNew();
            9. public void removeAttribute();
            10. public void setAttribute(String name, Object value);
            11. public void setMaxInactiveInterval(int intervelPerSeconds);

28. Cookies in Servlet:
    1. Basic Information:
        1. A Cookie is a small piece of information that is presented between the multiple client request.
        2. A Cookie has a name, a single value and optional attributes such as comment, Path and Domain Qualifier, a maximum age, and a version number.
    2. How Cookies Work?
        1. By Default, each request consider as a new request. 
        2. In Cookies technique, We add cookie with response from the servlet.
        3. So Cookies stored in the cache of the browser.
        4. After that if request is sent by the user , Cookies is added to request by Default.
        5. Thus recognize the user as the old user.
    3. How to create Cookie?
        1. Using Cookie Class in Servlet API.
        2. Cookies are added to response Object using addCookie() method.
        3. this method sends cookies information over the HTTPresponse stream.
        4. getCookie() method is used to access the cookies that are added to response object.
    4. Type of Cookies:
        1. session
        2. Persistent

        1. 1. Session:
            1. Session Cookie do not have expiration time.
            2. It lives in the browser memory.
            3. As Soon as the web browser is closed this cookie gets destroyed.
        2. 1. Persistent:
            1. Unlike Session Cookies they have expiration time, 
            2. They are stored in the user hard Drive and 
            3. gets destroyed based on the expire time.
    5. How to send cookies to the client:
        1. Create a Cookie Object:
            Cookie ck = new Cookie("userName","<userName>");
        2. set max Age:
            ck.setMaxAge(1800); // 30 min
            (OR)
            ck.setMaxAge(30*60);
        3. Place the Cookie in HTTP response header:
            response.addCookie(ck);
        4. get Cookie from request:
            Cookies[] cks = request.getCookies();
    6. Methods of Cookies:
        1. public void addCookie(Cookie ck);
        2. public Cookie[] getCookies();
        3. public void setComment(String purpose);
        4. public String getComment();
        5. public void setMaxAge(int expire);
        6. public int getMaxAge(); // default return -1
        7. public String getName();
        8. public void setValue(String newValue);
        9. public String getValue();


29. HttpSession in Servlet:
    1. Basic Information:
        1. A user session is Represented by the HttpSession object.
        2. A Session is established between Http client and Http server using the HttpSession interface.
        AUser session is a collection of data about a user that span s many Httprequests.
    2. Creation:
        HttpSession session = request.getSession();
        session.setAttribute("userName","password");
    3. Methods:
        1. public void getAttribute(String name);
        2. public Enumeration getAttributeNames();
        3. public long getCreationTime();
        4. public String getId();
        5. public long getAccessTime();
        6. public getMaxInactiveInterval();
        7. public void inactive();
        8. public boolean isNew();
        9. public void removeAttribute();
        10. public void setAttribute(String name, Object value);
        11. public void setMaxInactiveInterval(int intervelPerSeconds);











NOTES:
    TCP - TRANSMISION CONTROL PROTOCOL
    IP - INTERNET PROTOCOL
    ICMP - INTERNET CONTROL MESSAGE PROTOCOL
    SNMP - SIMPLE NETWOK MANAGEMENT PROTOCOL
    HTTPS - HIPER TEXT TRANSFER PROTOCOL SECURE
    SFTP - SECURE FILE TRANSFER PROTOCOL
    SSL - SECURE SOUCT LEYER.

    HttpServlet - protocol dependent
    GenericServlet - Protocol Independent 
