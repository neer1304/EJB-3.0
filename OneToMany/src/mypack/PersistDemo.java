package mypack;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


public class PersistDemo {

	
public static void main(String[] args)
{
Set<Emp> set1=new HashSet<Emp>();
set1.add(new Emp("Amit","S.E.",35000));
set1.add(new Emp("Aditya","T.L.",55000));
set1.add(new Emp("Vipul","P.M.",75000));

Set<Emp> set2=new HashSet<Emp>();
set2.add(new Emp("Hari","S.E.",25000));
set2.add(new Emp("Sachin","Q.A.",15000));
set2.add(new Emp("Varun","G.L.",45000));

Company c1=new Company("HCL",set1);
Company c2=new Company("Chetu",set2);
System.out.println(
		"Persisting Objects...");
EntityManager m=MyFactory.getManager();
EntityTransaction t=
	m.getTransaction();
t.begin();
		m.persist(c1);
		m.persist(c2);
		t.commit();
		m.close();
		System.out.println(
		"Successfully persisted.");
	}

}


