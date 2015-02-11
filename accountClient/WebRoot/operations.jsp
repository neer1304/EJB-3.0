<%@ page import="mypack.*" %>
<b>
<%
Account stub=(Account)session.getAttribute(
"stub");
String opr=request.getParameter("opr");
if (opr.equals("balance"))
{
int b=stub.getBalance();
out.println("Your current Balance is: "+b);
}
else
{
int a=Integer.parseInt(request.getParameter(
"amount"));
if (opr.equals("deposit"))
	{
	stub.deposit(a);
	out.println("Successfully Deposited.");
	}
else if(stub.withdraw(a))
out.println("Successfully Withdrawn.");
else
out.println("Insufficient Balance.");
}
%>
</b><br>
<jsp:include page="options.html" />



