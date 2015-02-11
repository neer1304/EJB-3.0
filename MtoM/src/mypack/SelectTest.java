package mypack;

import java.util.*;

import javax.persistence.EntityManager;



public class SelectTest {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter Previlige Id:");
int id=in.nextInt();
EntityManager m=MyFactory.getManager();
Previlige p=m.find(
		Previlige.class, id);
System.out.println("Previlige Details: ");
System.out.println(p.getName()+"\t"+p.getCost());
Set<Emp> set=p.getEmployees();
System.out.println("It is availed by following emp:");
Iterator<Emp> itr=set.iterator();
while(itr.hasNext())
{
	Emp e=itr.next();
System.out.println(e.getName()+"\t"
		+e.getJob()+"\t"+e.getSalary());
}
System.out.println("Enter Emp Id:");
int eid=in.nextInt();
Emp emp=m.find(Emp.class, eid);
System.out.println(
		"Emp Details :");
System.out.println(emp.getName()+"\t"
		+emp.getJob()+"\t"+emp.getSalary());
	Set<Previlige> ps=emp.getPreviliges();
	Iterator<Previlige> pitr=ps.iterator();
System.out.println(
"Following previliges are availed by this emp : ");
		
while(pitr.hasNext())
{
	Previlige pr=pitr.next();
System.out.println(pr.getName()+"\t"
		+pr.getCost());
}
m.close();
		
	}

}


