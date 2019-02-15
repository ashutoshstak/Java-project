<%-- 
    Document   : p9
    Created on : Jun 25, 2018, 9:09:46 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:setDataSource driver="org.gjt.mm.mysql.Driver" url="jdbc:mysql://127.0.0.1/dbshop" user="root" password="" var="con"/>
        <s:query var="rs" dataSource="${con}">
            Select * from Products
        </s:query>
            Total Rows:<c:out value="${f:length(rs.rows)}" />    <br>
            <table border="1">
                <c:forEach var="row" items="${rs.rows}" >
                <tr>
                    <c:forEach items="${row}" var="col">
                        <td>
                            <c:out value="${col.value}"/>
                        </td>
                    </c:forEach>
                </tr>
            </c:forEach>
             </table>   
    </body>
</html>
