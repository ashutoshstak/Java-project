<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script>
            var xmlhttp;
            function f3()
            {
                s=document.getElementById("t1").value;
                xmlhttp=new XMLHttpRequest();
                xmlhttp.open("GET","p12.jsp?id="+s,true);
                xmlhttp.onreadystatechange=f4;
                xmlhttp.send(null);
            }
            function f4()
            {
                if(xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    s=xmlhttp.responseText;
                    document.getElementById("t2").value=s;
                }
            }
        </script>
    </head>
    <body>
        <div id="d1"></div>
        <hr>
        <input type="text" name="t1" id="t1" onkeyup="f3()" onblur="f3()"><br>
        <input type="text" name="t2" id="t2"><br>
        <input type="button" value="Click Here" onclick="f3()">
    </body>
</html>
