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
          .form{
              display:flex;
              margin-left:100px;
              margin-right:100px;
              background-color:yellow;
              width:500px;
              height:500px;
              border:2px double;
          }
      </style>
    </head>
    <body>
    <center> User form</center>
        <div class="form">
        <form action="add.jsp">
              <h1>Enter the First Number:</h1>
              <input type="text" name="num1">
              <h1>Enter the Second Number:</h1>
              <input type="text" name="num2">
              <br/>
              <input type="submit" >
        </form>
        </div>
         <iframe src="https://vengateshk18.github.io/vengateshk18/"
                    width="600"
                    height="400"
                    style="border:2px solid black;">
         </iframe>
    </body>
</html>

