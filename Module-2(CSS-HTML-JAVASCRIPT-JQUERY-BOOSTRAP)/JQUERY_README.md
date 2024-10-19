# CSS-HTML-JAVASCRIPT
Day to day Learning

JQUERY 

PART-1:
    1.JQuery Introduction
    2.JQuery Feature:
        1.simple and easy to learn
        2.Light Weight
        3.css Manipulation
        4.Html manipulation
        5.Dom Traversal and Manipulation
        6.Cross browser support
        7.Event Handling
        8.JavaScript Library
    3.Add JQUERY
        1.Download From www.jquery.com
        2.Includ jQuery from a CDN(Content Delivery Network)
    4. Add jQuery on web-page
        <head>
            <script src="jquery-1.11.3.js"></script>
        </head>
    
    5.JQuery CDN
        1. CDN-Content Delivery (or)  Distribution Network
        2. Here Lot of files are stored, using CDN you can directly use  these files on your website, no need to upload these files on your server. 
        3.TypeTo Implement CDN For:
            1. Google CDN: https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js
            2. Microsoft CDN: https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js
            3. CDNJS: https://cdnjs.cloudflare.com/ajax/libs/jQuery/3.6.0/jquery.min.js
            4. jsDeliver: https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js
    6. Advantages of using CDN?
        1.It reduce the load from your server.
        2.It saves bandwidth.
        When any User visit on other website it save in browser, as a result next time easy to load.
    7.Editiors for JQuery:
        (Notepad,++, VSCode, CKEditior,TinyMCE,etc..)

    8. JQuery Syntax
        $(selector).action();

        Example:
            $('.input1').hide(); 
    9. What is dollar Sign ($) in JQUERY?  
        synt:
            $(document).ready(function(){

            });
                    (or)
            JQuery(document).ready(function(){

            });
    10. Document Ready Event:
        You can notice in any Jquery example or code jQuery methods are inside document ready Event.

        syntax:
            $(document).ready(function(){
                // Jquery Methods
            });
    
    11. Downloading JQuery:
        Versions:
            1.Product Version - Complete Version
            2. Development Version  - developer Version
    12.GoogleCDN-Example

PART-2:
    1. Microsoft CDN-Example
    2. JQuery CDN-Example
    3. DeveloperCDN - Example

PART-3:
    1.Element Selector
    2. Event handling
        1.Mouse Event 
        2.Keyboard Event
        3.Form Event
        4.Windows Event
    3. DOM Manipulation Methods
        1.append()
        2.before()
        3.after()
        4.prepend()
        5.remove()
        6.replaceAll()
        7.wrap()

PART-4:
    1.Mainpulate the HTML Attributes
        1.attr()
        2.prop()
        3.html()
        4.text()
        5.val()
    2. syntax:
        $('selector').attr('name','value');
        $('selector').prop('name','value');  
        $('selector').html('content');  
        $('selector').text('content'); 
        $('selector').val('content');
    3. Calculator Program

PART-5:
    1.manipulate HTML Element's Dimensions
        1.height()
        2.innerHeight()
        3.outerHeight()
        4.offset()
        5.position()
        6.width()
        7.innerWidth()
        8.outerWidth()
    2.Syntex:
        1.$('selector').height('value');
        2.$('selector').innerHeight('value');
        3.$('selector').outerHeight('value');
        4.$('selector').offset('value');
        5.$('selector').position('value');
        6.$('selector').width('value');
        7.$('selector').innerWidth('value');
        8.$('selector').outerWidth('value');
    
    3.The Following table lists jQuery methods for traversal DOM Element
        1.children()
        2.each()
        3.find()
        4.first()
        5.next()
        6.parent()
        7.prev()
        8.siblings()
    4.Syntex:
        1.$('selector').each(CallBack Function);
        2.$('selector').children();
        3.$('selector').find('selector to find child');
        4.$('selector').next();
        5.$('selector').parent();
        6.$('selector').siblings();

PART-6:
    1.CSS Manipulation:
        1.css()
        2.addClass()
        3.hasClass()
        4.removeClass()
        5.toggleClass()
       Syntax:
        1.$('selector').css({
            'style Property Name':'value',
        });
        2.$('selector').addClass('css class Name');
        3.$('selector').toggleClass('css class Name');
    
    3.JQuerey Animation:
        1.animate()
        2.queue()
        3.stop()
        4.fedeln()
        5.fadeOut()
        6.fadeTo()
        7.fadeToggle()
        8.hide()
        9.show()
        10.toggle()
        11.slideUp()
        12.slideDown()
        13.slideToggle() 
       
       Animated syntax:
        1.$('selector').animate(
            {'style property name ':'value'},
            duration,
            easing,
            callback
            ); 
                (or)
        $('selector').animate({'propertyName':'value'},{Options})
    
    2.Set Animation Duration
        $('img').animate({
            height:'100px',
            width:'100px'
        },5000);

    3.Apply Easing Method
        1.linear
        2.swing

        $('img').animate({
            height:'100px',
            width:'100px'
        },5000,'swing')
    4.callback Function on Animation Complete
        $('img').animate({
            height:'100px',
            width:'100px'
        },5000,function(){
            $('msg').text('Animating Completed...)
        });

        <img src='sample.jpg'></img>
        <p id='msg'></p>
    5. Specify Animation Options
            You can specify various options as JSON Object.
            The option include duration,easing.queue,step,progress,complite,start,done and always.
    
    6.syntex:
        1. $('selector').queue(); -show or manipulate the queue
        2. $('selector').fadeIn(speed,easing,callback); -fading to clear
        3. $('selector').fadeIn(speed,easing,callback); -clear to fading
        $('selector').hide(speed,easing,callback);
        $('selector').show(speed,easing,callback);
        $('selector').toggle(speed,easing,callback);

PART-7:
    1.JQUery Animation1 - Example
    2.JQuery Event Methods
        1.form Event
        2.Keyboard Event
        3.Mouse Event
        4.Browser Event
        5.Document Loading
        
        1.Form Event Methods():

            JQuery Event - DOM Event
            1.blur       - onBlur
            2.change     - onchange
            3.focus      - onFocus
            4.focusin    - onFocusin
            5.select     - onSelect
            6.submit     - onSubmit    
        
        2.Keyboard Event
            1.keydown    - onKeydown
            2.keyUp      - onKeyUp
            3.keyPress   - onKeyPress
            3.focusOut   -

        3.Mouse Evnet
            1. click
            2. dblclick
            3. focusout
            4. hover
            5. mousedown
            6. mouseenter
            7. mouseleave
            8. mousemove
            9. mouseout
            10.mouseover
            11.mouseup
            12.toggle
        4.Browser Event Methods()
            1.Error
            2.Resize
            3.scroll
        5.Document loading Methods():
            1.load
            2.ready
            3.unload

PART-8:
    1.Event Object:
        1.JQuery Passes an event object to every event handler function.
            1.target
            2.pageX
            3.pageY
            4.related Target..etc..
    2.this Keyword in Event Handler
    3.Hover()
        1.mouseenter,mouseleave,etc...
    4.Event Binding Using on()
        synt:
            on(type,selector,data,fn);
    5.Event Binding Multiple Elements:
        example:
            $('#myDiv').on('mouseenter mouseleave)',function(){
                $('myDiv').text('The Mouse entered or left from the div');
            });

            <div id='myDiv' style='width:100px;height=100px;'></div>
    6.Specify Named function as Event Handler
        ex:$('#myDiv').on('mouseenter',namedFunction);
            var namedFunction = function(){
                alert('The Mouse Entered!');
            }
    7.Event Bubbling

PART-9:
    1.JQuery DOM Manipulation:
        1.jQuery Provide methods such as attr(),html(),text() and vla() which act as getter and setter.
        2.Standard library Methods:
            1.Extract the content of an element
            2.Change the content of an element
            3.Adding a child element under an existing element
            4.Adding a parent element above an existing element
            5.Adding an element before or after an existing element
            6.Replace an existing element with another element
            7.Wrapping content with-in an element
        3.Get Form Fields:
            $('selector').val() // get the value from any form field
        4. Select Content
            1.$('selector').html(val,[function]);
            2.$('selector').text(val,[function]);
        5. Set Form Fields:
            $('selector').val('value')
        6.Replacement Element
            $('selector').replaceWidth('value');
            // example H1 change to p tag

PART-10:
    1.jQuery - Add Elements: 
        1.Apend() Method: nxt
            $('Selector').append(content,[content]);
        2.After() Mehtod: end 
            $('Selector').after(content,[content]);
        2.Before() Mehtod:  First
            $('Selector').after(content,[content]);
        2.prepend() Mehtod: just before
            $('Selector').after(content,[content]);
    
    2.Traversing Ancestors:
        The method casn be used to find a Parent,grandparent,great-grandparent
        Three Methods: Refer To Code
            1.parent()
            2.parents()
            3.parentUntill() 

    3.Trversing Descendants:
        The method casn be used to find a Child,grandchild,great-grandchild
        Two Methods: Refer To Code
            1.children()
            2.find()

PART-11:
    1.jQuery Find()
         $('Selector').find(filter)
    2. Callback Function

    3.jQuery Utilities:
        1. $.trim
        2. $.each() 
        3. $.inArray()
        4. $.extend()
        5. $.proxy() - Return a function
        6. $.browser()
        7. $.contains()
        8. $.data()

        1.$.trim -Remove white Spaceses
            $.trim('  lots of whitespace  ');
        2. $.each() - Used to Iterate Arrays and Objects
            1.$.each(['a','b','c'],function(ind,val){
                console.log('Element '+ ind + ' Is '+val);
            });

            2.$.each({a:'a',b:'b',c:'c'},function(key,val){
                console.log(key + ' : '+val);
            });
        3.$.inArray() - Check Array Size. Is Null return -1
            1.var myArray = [1,2,3,4,5];
            if($.inArray(4,myArray) != -1){
                console.log('found it!'); 
            }
        4.$.extend() - Change the property of first Object
            1.var firstObject = {foo:'bar',a:'b'};
              var secondbject = {foo:'faz'};
              var newObject = $.extend(firstObject,secondbject);
              console.log(firstObject.foo); // bar
              console.log(newObject.foo);  //faz

PART-12:  
    1.$.now()
    2.$.isXMLDoc()
    3.$.globalEval()
    4.$.dequeue()

    5.jQuery Intraction
        1.Drag
        2.Drop
        3.Resize
        4.Select
        5.Sort

PART-13:
    1.Page piling
    2.jQuery Form-serialize()
    3.jQuery Form-serializeArray()

PART-14: Refer to images
    1.jQuery UI - It is categorized 4 groups.
        1.interacations 
        2.widgets
        3.Effects
        4.Utilities

        definition:
        
        3.Effect:
            add css
            remove Css
            COlor Animation
            Hide show 
            toggle
            toggle Class
            Effect
            switchclass
        4.Utilities:
            1.tooltip
            S.Accordion

    2.Benifits Of jQuery UI:
        1.Cohesive and Consistent APIs.
        2.Comprehensive Browser Support.
        3.Open Sourse and Free to Use.
        4.Good Documentation.
        5.Powerful Theming Mechanism.
        6.Stable and Maintenance Friendly.
    
    3.Explaination:
        1.interacations:
            Draggable
            Dropable
            Sortable
            Selectable
            Resizable

PART-15:
    1.JQuery widgets:
            It's a Specialized, platform-independent, cross browser compatible, stable plugins.
    2.Top jQuery Widgets:
            1. Accordion widgets 
                1.Accordion Widget in jQuery UI is a jQuery Based expandable and Collapsible content holds broken into sections and properly look like tabs.

                Syntax: - 2
                    1. $('Selector',content).accordion(options) Method
                    2. $('Selector',content).accordion('action',options) Method
                
                1.1. $('Selector',content).accordian(options) Method:
                    Options:
                        1. Action       - page is first Access.
                        2. Animate      - How to animate Changing panels(default value is {}
                        3. Callapsible  - Default value false (+ or - ) menu
                        4. Disable      - when that is true the accoridian will be disable
                        5. Event        - This option specify the event used to select on accordion.
                        6. Header       - Default apttern for identifying the header element.   
                        7. HeightStyle  - Control the height
                        8. Icons        - Open and close Icon
                        
PART-16:
    2.autocomplete:
        It is a machanism frequently used in modern websites to provide a lot of suggesstion for typing time.
        
        ex:
            you type in text box like 'ja' it refer to related this for 'javascript','java' Like this is called as autocomplete
        syntax:
                1. $('Selector',content).autocomplete`(options);
                            (or)
                   $('Selector',content).autocomplete({options1':'value1','obtion2','value2'...);  

                2. $('Selector',content).autocomplete('action',parameters);
        Options:
            1.appendTo
            2.autoFocus
            3.delay
            4.disabled
            5.minlength
            6.postion
            7.source

    3. Button /ButtonSet widgets:
        jQuery UI provide button() method to transform the html elements(like button, input or anchor )

        syntax:
            1.$(selector, context).button(options) Method
            2.$(selector, context).button("action", params) Method
        Options:
            1.disabled (default false)
            2.icons
            3.label
            4.text -confirm show text(default Value true)

PART-17:
    4. Datepicker widgets
        Datepickers in jQueryUI allow users to enter dates easily and visually. 
        You can customize the date format and language, restrict the selectable date ranges and add in buttons and other navigation options easily.
        jQueryUI provides datepicker() method that creates a datepicker and changes the appearance of HTML elements on a page by adding new CSS classes. 
        Transforms the <input>, <div>, and <span> elements in the wrapped set into a datepicker control.

        Syntax:
           1. $(selector, context).datepicker (options) Method
           2. $(selector, context).datepicker ("action", [params]) Method
    
        Options:
            more then 51
    5. Dialog widgets:
        Dialog boxes are one of the nice ways of presenting information on an HTML page. A dialog box is a floating window with a title and content area. 
        This window can be moved, resized, and of course, closed using "X" icon by default.
        
        Syntax:
            1. $(selector, context).datepicker (options) Method
            2. $(selector, context).datepicker ("action", [params]) Method
        Options: - 21
            1	appendTo
                If this option is set to false, it will prevent the ui-draggable class from being added in the list of selected DOM elements. By default its value is true.

            2	autoOpen
                This option unless set to false, the dialog box is opened upon creation. When false, the dialog box will be opened upon a call to dialog('open'). By default its value is true.

            3	buttons
                This option adds buttons in the dialog box. These are listed as objects, and each property is the text on the button. The value is a callback function called when the user clicks the button. By default its value is {}.

            4	closeOnEscape
                Unless this option set to false, the dialog box will be closed when the user presses the Escape key while the dialog box has focus. By default its value is true.

            5	closeText
                This option contains text to replace the default of Close for the close button. By default its value is "close".

            6	dialogClass
                If this option is set to false, it will prevent the ui-draggable class from being added in the list of selected DOM elements. By default its value is "".

            7	draggable
                Unless you this option to false, dialog box will be draggable by clicking and dragging the title bar. By default its value is true.

            8	height
                This option sets the height of the dialog box. By default its value is "auto".

            9	hide
                This option is used to set the effect to be used when the dialog box is closed. By default its value is null.

            11	maxHeight
                This option sets maximum height, in pixels, to which the dialog box can be resized. By default its value is false.

            12	maxWidth
                This option sets the maximum width to which the dialog can be resized, in pixels. By default its value is false.

            13	minHeight
                This option is the minimum height, in pixels, to which the dialog box can be resized. By default its value is 150.

            14	minWidth
                This option is the minimum width, in pixels, to which the dialog box can be resized. By default its value is 150.

            15	modal
                If this option is set to true, the dialog will have modal behavior; other items on the page will be disabled, i.e., cannot be interacted with. Modal dialogs create an overlay below the dialog but above other page elements. By default its value is false.

            16	position
                This option specifies the initial position of the dialog box. Can be one of the predefined positions: center (the default), left, right, top, or bottom. Can also be a 2-element array with the left and top values (in pixels) as [left,top], or text positions such as ['right','top']. By default its value is { my: "center", at: "center", of: window }.

            17	resizable
                This option unless set to false, the dialog box is resizable in all directions. By default its value is true.

            18	show
                This option is an effect to be used when the dialog box is being opened. By default its value is null.

            20	title
                This option specifies the text to appear in the title bar of the dialog box. By default its value is null.

            21	width
                This option specifies the width of the dialog box in pixels. By default its value is 300.
                
    6. Menu  widgets:
        A menu widget usually consists of a main menu bar with pop up menus.
        The menu() method can be used in two forms −
            1. $(selector, context).menu (options) Method
            2. $(selector, context).menu ("action", params) Method
        options:
            1	disabled
                This option if set to true disables the menu. By default its value is false.

            2	icons
                This option sets the icons for submenus. By default its value is { submenu: "ui-icon-carat-1-e" }.

            3	menus
                This option is a selector for the elements that serve as the menu container, including sub-menus. By default its value is ul.

            4	position
                This option sets the position of submenus in relation to the associated parent menu item. By default its value is { my: "left top", at: "right top" }.

            5	role
                This option is used to customize the ARIA roles used for the menu and menu items. By default its value is menu.
    
    7. Progressbar widget:
        Progress bars indicate the completion percentage of an operation or process.
            1.determinate progress bar
            2.indeterminate progress bar
    
        Syntax:
            1.$(selector, context).progressbar (options) Method
            2.$(selector, context).progressbar ("action", params) Method
        Options:
            1	disabled
                This option when set to true disables the progress bars. By default its value is false.

            2	max
                This option sets the maximum value for a progress bar. By default its value is 100.

            3	value
                This option specifies the initial value of the progress bar. By default its value is 0.
        
        Action
            1	destroy
                This action removes the progress bar functionality of an element completely. The elements return to their pre-init state. This method does not accept any arguments.

            2	destroy
                This action removes the progress bar functionality of an element completely. The elements return to their pre-init state. This method does not accept any arguments.

            3	disable
                This action disables the progress bar functionality of an element. This method does not accept any arguments.

            4	enable
                This action enables the progress bar functionality. This method does not accept any arguments.

            5	option( optionName )
                This action retrieves the value currently associated with specified optionName. Where optionName is a String.

            6	option
                This action gets an object containing key/value pairs representing the current progressbar options hash. This method does not accept any arguments.

            7	option( optionName, value )
                This action sets the value of the progressbar option associated with the specified optionName.

            8	option( options )
                This action sets one or more options for the progress bars. The argument options is a map of option-value pairs to be set.

            9	value
                This action retrieves the current value of options.value, that is, the percentage of fill in the progress bar.

            10	value( value )
                This action specifies a new value to the percentage filled in the progress bar. The argument value can be a Number or Boolean.

            11	widget
                This action returns a jQuery object containing the progressbar. This method does not accept any arguments.
        
        Event Method
            1	change(event, ui)
                This event is triggered whenever the value of progress bar changes. Where event is of type Event, and ui is of type Object.

            2	complete(event, ui)
                This event is triggered when the progressbar reaches the maximumm value. Where event is of type Event, and ui is of type Object.

            3	create(event, ui)
                This event is triggered whenever progressbar is created. Where event is of type Event, and ui is of type Object.
    8. SelectMenu widgets
    9. Slider widgets
    10.Spinner widgets
    11.Tab widgets
    12.Tooltip widgets
        -Refer to web site


PART-18:
    1.Ajax Introduction
        
        Loading data in background and display it on webpage,without reloading the whole page.

        Example Application Using AJAX
            (GMail,google map,facebook,youtube)
            
        Ajax is a developer dream because you can:
            Update a web page Without reloading the page
            Request data from a server - after the page has loaded
            Recive data from a server - after the page has loaded
            Send data to a server - in the background
        
        What is AJAX?
            AJAX-Asynchronous Javascript and XML
            It is not a programming language.
        
        Ajax just use a combination of:
            browser build-in XMLHttpRequest Object(to request data from a web server)
            Javascript and HTML DOM (to display or use the data)
            AJAX application might use XML to transfort data, but it is equal comon transition to plain text or Json text.
        
        How Ajax Works:
                Browser:                   \                   \                            Server:
            An event occcrs          _______\   INTERNET   _____\                      Process HTTP Request
         create HTTPRequest Object          /                   /  Create a responce and send data back to the browser via internet
            Sent HTTPRequest               /                   /


PART-19:
    1.Access Across Domains:
        For security resons, moder browser do not allow access across domains.

        XMLHTTPRequest Methods:
            1. new XMLHTTPRequest()
                Create a xmlhttp request
            2. abort():
                Cancel the currend request
            3. getAllResponseHeaders():
                Return Header information
            4. getResponseHeader()
                Returns specific header information
            5. open(method,url,async,user,psw)
                Specific the request 
                method :Get or Post
                url    :the file location
                async  :true or false
                user   : (Optional) User Name
                psw    : (Optional) Password
            6. send():
                Send the request to the server
            7. Used for GET request
            8. send(string)
                send the request to the server ,Used for post request
            9. setRequestHeader()
                Adds a lable/value pair to the header to be sent        
        
        XMLHTTPRequest Property:
            1.onreadystatechange:
                Define a function to be called when the readyState Property change
            2. readyState:
                0 - request not initialized
                1 - Server connection established
                2 - request Recived
                3 - Processing Request
                4 - Request finished and responce is ready
            3. responseText:
                Return the response data as a string
            4. responseXML:
                Return the response data as a XML
             5. Status:
                200 - OK
                403 = forbidden
                404 - Not found
                For complete list go to the http Messages reference
            6. statusText:
                Return the status-text(eg.'OK' or 'Not Found')
        
        AJAX - sent to a request to a server
            1.open('GET',filename,true);
            2.send();
            3.send(string);

PART-20:
    1.Server Response:
        Properties:
            responseText
            responceXML
        methods:
            getResponseHeader()
            getAllResponseHeaders()
    2. How to Show XML File in html Table Using Ajax

PART-21:
    Ajax Database Example
                