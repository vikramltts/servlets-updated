<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*,com.ltts.demowebproject.model.*,com.ltts.demowebproject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
PlayerDao pd=new PlayerDao();
Player p1=pd.getPlayerById(id);
%>
<form action="./UpdatePlayerServlet" method="post">
Player Id: <%=p1.getPlayerId() %> <br><br>
Player Name: <input type="text" value="<%=p1.getPlayerName()%>" name="pname"><br><br>
Player Country: <input type="text" value="<%=p1.getCountry()%>" name="pcountry"><br><br>
<input type="submit" value="Update Player">




</form>
</body>
</html>