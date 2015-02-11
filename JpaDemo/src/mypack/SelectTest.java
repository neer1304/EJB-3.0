package mypack;

import java.util.*;
import javax.persistence.*;

public class SelectTest {

	
public static void main(String[] args) {
EntityManagerFactory f=
	Persistence.createEntityManagerFactory(
			"emp");
	EntityManager m=
			f.createEntityManager();
	Query q=m.createQuery("from Emp e");
	List<Emp> list=q.getResultList();
	Iterator<Emp> itr=list.iterator();
	System.out.println(
		"following objects are fetched...");
		while(itr.hasNext())
		{
			Emp e=itr.next();
System.out.println(e.getId()+"\t"+
		e.getName()+"\t"+e.getJob()+"\t"
		+e.getSalary());
			
		}
		m.close();
	}

}
