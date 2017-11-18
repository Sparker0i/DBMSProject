<%-- 
    Document   : addalbum
    Created on : 18 Nov, 2017, 12:54:39 AM
    Author     : Spark
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="music.*"%>
<%@page import="connection.DataConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= request.getParameter("format") %>
        <%
            MusicHandler.addAlbum(new DataConnection().getConnection(), new Album(Integer.parseInt(request.getParameter("album_id")) , request.getParameter("title") , new SimpleDateFormat("YYYY-MM-dd").parse(request.getParameter("copyright_date")) , request.getParameter("format")));
        %>
    </body>
</html>
