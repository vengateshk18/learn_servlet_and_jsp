<!DOCTYPE html>
<html>
    <head>
      <title>Index Page</title>
      <style>
          body{
              background-color:blue;
              font-family: Arial, sans-serif;
          }
          center{
             color:red;
             background-color:white;
          }
      </style>
    </head>
    <body>
    <center> User form</center>
    <%
        int i=Integer.parseInt(request.getParameter("num1"));
        int j=Integer.parseInt(request.getParameter("num2"));
        int result=i+j;

        out.println("Result: "+result);
     %>
    </body>
</html>

