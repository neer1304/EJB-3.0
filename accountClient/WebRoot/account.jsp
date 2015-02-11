<%@ page import="javax.naming.*,mypack.*" %>

<%
InitialContext ctx=new InitialContext();
Account stub=(Account)ctx.lookup(
"myAccount");
session.setAttribute("stub",stub);
int a=Integer.parseInt(request.getParameter(
"amount"));
stub.deposit(a);
%>
<b> Account is successfully opened. </b><br>
<jsp:include page="options.html" />



