package mypack;

import java.util.Scanner;

import javax.persistence.*;

public class FindTest {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter emp Id:");
		int id=in.nextInt();
		EntityManagerFactory f=Persistence.createEntityManagerFactory("emp");
		EntityManager m=f.createEntityManager();
		Emp e=m.find(Emp.class,id);
		m.close();
		System.out.println("State of entity is:");
		System.out.println(e.getName()+"\t"+e.getJob()+"\t"+e.getSalary());
	}

}
