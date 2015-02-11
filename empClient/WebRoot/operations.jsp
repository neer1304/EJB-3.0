<%@ page import="javax.naming.*,mypack.*,
java.util.*" %>
<b>
<%
EmpRemote stub=(EmpRemote) 
session.getAttribute("stub");
if(stub==null)
{
InitialContext ctx=new InitialContext();
stub=(EmpRemote) ctx.lookup("myEmp");
session.setAttribute("stub",stub);
}
String opr=request.getParameter("opr");
if(opr.equals("all"))
{
List<Emp> list=stub.getAllEmp();
Iterator <Emp> itr=list.iterator();
out.println("following objects are selected <br>");
while(itr.hasNext())
{
Emp e=itr.next();
out.println(e.getName()+"\t"+e.getJob()+
"\t"+e.getSalary()+"<br>");
}
}
else if(opr.equals("byId"))
{
int id=Integer.parseInt(
request.getParameter("id"));
Emp e=stub.getById(id);
out.println(
"following object is selected <br>");
out.println(e.getName()+"\t"+e.getJob()+
"\t"+e.getSalary()+"<br>");
}
else if(opr.equals("delete"))
{
int id=Integer.parseInt(
request.getParameter("id"));
stub.delete(id);
out.println("successfully deleted.");
}
else
{
String n=request.getParameter("name");
String j=request.getParameter("job");
int s=Integer.parseInt(
request.getParameter("salary"));
Emp e=new Emp(n,j,s);
if (opr.equals("save"))
{
stub.save(e);
out.println("successfully saved.");
}
else
{
int id=Integer.parseInt(
request.getParameter("id"));
e.setId(id);
stub.update(e);
out.println("successfully updated.");
}
}
%>
</b> <br>
<jsp:include page="empForm.html" />


