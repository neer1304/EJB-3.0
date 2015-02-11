package mypack;

import java.util.Scanner;


public class DisconnectedUpdate {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter emp Id:");
	int id=in.nextInt();
	EmpDao dao=new EmpDao();
	Emp e=dao.getById(id);
	System.out.println("Current state is:");
	System.out.println(e.getName()+"\t"+
			e.getJob()+"\t"+e.getSalary());
System.out.println("changing job & salary...");
	e.setJob("Manager");
	e.setSalary(56000);
	dao.update(e);
System.out.println("successfully updated.");
	}

}
