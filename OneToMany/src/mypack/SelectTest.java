package mypack;

import java.util.*;
import javax.persistence.*;

public class SelectTest {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter company Id:");
int id=in.nextInt();
EntityManager m=MyFactory.getManager();
Company comp=m.find(
		Company.class, id);
System.out.println("Company Name: "+
		comp.getName());
Set<Emp> set=comp.getEmployees();
System.out.println(
"Employees of company are:");
Iterator<Emp> itr=set.iterator();
while(itr.hasNext())
{
	Emp e=itr.next();
System.out.println(e.getName()+"\t"
		+e.getJob()+"\t"+e.getSalary());
}
System.out.println("Enter Emp Id:");
int eid=in.nextInt();
Emp emp=m.find(
		Emp.class, eid);
System.out.println(
		"Emp Details :");
System.out.println(emp.getName()+"\t"
		+emp.getJob()+"\t"+emp.getSalary());
	Company c=emp.getCompany();
System.out.println(
"Company Name of the Emp is : "+
c.getName());
		m.close();
		
	}

}


