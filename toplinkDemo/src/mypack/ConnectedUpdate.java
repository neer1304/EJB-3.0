package mypack;

import java.util.Scanner;
import javax.persistence.*;
public class ConnectedUpdate {

	
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter emp Id:");
int id=in.nextInt();
EntityManager m=MyFactory.getManager();
Emp e=m.find(Emp.class, id);
System.out.println("Current state is:");
System.out.println(e.getName()+"\t"+
		e.getJob()+"\t"+e.getSalary());
System.out.println("changing job & salary...");
EntityTransaction t=m.getTransaction();
t.begin();
	e.setJob("Manager");
	e.setSalary(56000);
	t.commit();
	m.close();
System.out.println("successfully updated.");
	}

}
