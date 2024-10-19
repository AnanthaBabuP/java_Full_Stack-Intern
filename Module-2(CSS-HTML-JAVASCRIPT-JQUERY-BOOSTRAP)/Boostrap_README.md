# CSS-HTML-JAVASCRIPT-JQUERY-Bootsrap
Day to day Learning

Bootsrap 

PART-1:
    1.What is Bootstrap?
        1. Bootstrap is a free front-end framework for faster and easier web development
        2. Bootstrap includes HTML and CSS based design templates for typography, forms, buttons, tables, navigation, modals, image carousels and many other, as well as optional JavaScript plugins
        3. Bootstrap also gives you the ability to easily create responsive designs.
    2.Responsive Web Design.
    3.How to use Bootstrap 4 on a webpage
        1.Include Bootstrap from the CDN link
        2.Download Bootstrap from gerBootsrap.com and use it.
    
        Bootstrap from CDN:
            it is easy and Highly recemented 
            <!-- Latest compiled and minified CSS -->
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

            <!-- jQuery library -->
            <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>

            <!-- Popper JS -->
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

            <!-- Latest compiled JavaScript -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        
    4.Create A first web page With bootstrap 4
        1.Add the Html5 doctype
            Bootstrap used Html and CSS elements so, We require to HTML5 doctype.
        
        2.Bootstrap 4 is mobile-first
            Bootstrap is designed to be responsive mobile devices.
            Mobile=first style are part of core framework.
            To ensure proper rendering and touch zooming ,add the following <meta> tag inside the <head> tag
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                
                    width=device-width(device width take that)
        
        3.Containers:
            Also requires a container to wrap site contents.

            Two Container
                1. .container(responsive fixed width container)
                2. .container-fluid(Provide a full width container, spanning entire width of the view port)

PART-2:
    1.Containers Sample Program with difference for .container VS .container-fluid:
    2. Container Padding:
        By default ,container have 15px left and right padding, with no top and bottom.
    
    3.Spacing
        1. margin and Padding
        2. Notation
            {property}{sides}-{size}

            property
                m-margin
                p-padding
            sides:
                t-top
                b-bottom
                s-(start) ml or pl LTR, mr or pr RTL
                e-(start) mr or pr RTL, ml or pl LTR 
                x- set both left and right
                y- set both top and bottom
                blank -margin or padding on all 4 sides
            size:
                  0 - 0
                  1 - spacer*.25
                  2 - spacer*.5
                  3 - spacer
                  4 - spacer*1.5
                  5 - spacer*3
                  auto- set size auto  

PART-3:
    1.Bootsrap Grid System:
        1. Bootstrap's grid system allows up to 12 columns across the page.
        2. It is Responsive and the columns will re-Arrange auto-mantically based on the screen size.

        1.Grid Classes
            Grid system have 5 classes
                1. .col  (extra small device - Screen width < 576px) 
                2. .col-sm  ( small device - Screen width > 576px)
                3. .col-md  (Medium device - Screen width >= 768px)
                4. .col-lg  (Large device - Screen width >= 992px)
                5. .col-xl  (Extra Large device - Screen width >= 1200px)
            
            Device Grid system have 4 classes
                1.xs (for phone, screen < 768px)
                2.sm (for tablet, screen >= 768px)
                3.md (for small Laptop, screen >= 992px)
                4.lg (for Laptop and Desktop, screen >= 1200px)

            3.It is More Dynamix and flexible layout

            4.Rules:
                1. Rows must be placed within a .container (fixed-width) or .container-fluid (full-width) for proper alignment and padding
                2. Use rows to create horizontal groups of columns
                3. Content should be placed within columns, and only columns may be immediate children of rows
                4. Predefined classes like .row and .col-sm-4 are available for quickly making grid layouts
                5. Columns create gutters (gaps between column content) via padding. That padding is offset in rows for the first and last column via negative margin on .rows
                6. Grid columns are created by specifying the number of 12 available columns you wish to span. For example, three equal columns would use three .col-sm-4
                7. Column widths are in percentage, so they are always fluid and sized relative to their parent element
            
            5. Grid options: -6
                extra small
                small
                medium
                large
                extra large
                extra extra large
            6.Responsive Class:
                1. Mix With match
                2. Alignment
                3. horizontal Gutters

PART-4:
    1.Verical Gutters
    2.Typograpy in Bootstrap:
        Used for Styling and formatting Text content

        Typography can be used to create:
            1. Heading
            2. Subheading
            3. Text and paragraph font colour, font style and alignment
            4. Lists
            5. Other inline Elements

        Some Class Tags
            h1-h6
            text-muted
            display
            lead = visually better
            mark
            small
            initialism
            blockquote
            blockquote-footer
            text-center
            text-right
            text-left
            list-inline
            list-unstyle
            text-truncate
            text-uppercase
            text-lowercase
            text-capitalize
            pre-scrollable = <pre>

PART-5:
    1. Code tag: It change to the inline content colour.
    2. kbd Tag: Reference for keyboard key
    3. pre Tag: type whatever or content like white space accept all .
    4.Color:
        1. Primary
        2. secondary
        3. success
        4. danger
        5. warning
        6. info
        7. light
        8. dark
    5.Table
        classes:
            1.table
            2.table-Striped
            3.table-hover

PART-6:
    1. Contextual Classes:
        Used to color whole table<table>,table rows<tr>, table cells<td>
    2. Responsive Table
    3. Images
        1.Rounded Corners = .rounded
        2. Circle = .rounded-circle
        3. Thumbnail = .img-thumbnail
        4. Aligning Image =.float-right (or).float-left
        5. Cantering image =.mx-auto(margin-auto) and .d-block(display:block)
        6. Responsive Image
            1. .img-fluid (Applies max-width:100%)
            2. .img-responsive

PART-7:
    1. Bootstrap Components:
        1.Alert
        2.Button
        3.Button Group
        4.Badge
        5.Progress bar
        6.snipper
        
    1.Alert
    2.Button
        classes:
            .btn
            .btn-primary
            .btn-secondary
            .btn-success
            .btn-info
            .btn-warning
            .btn-danger
            .btn-light
            .btn-dark
            .btn-link
        types:
            submit
            reset
            button
        Active/Disabled
    
    3.Badge:

PART-8:
    1. Progress Bar
    2. How it work
        style="width:_%"


PART-9:
    1.Spinner
        classes:
            spinner-border
            spinner-grow
            spinner-border-sm(must declare spinner-border)
            spinner-grow(must declare spinner-grows)
        Snipper-border:
        sniper-grow:
        sniper color property:
            text-{type}
        types:
            primary
            secondary
            .
            .
            .
            etc

    