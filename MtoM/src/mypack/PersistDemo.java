package mypack;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


public class PersistDemo {
	
public static void main(String[] args)
{
Previlige p1=new Previlige("Car",60000);
Previlige p2=new Previlige("Flat",300000);
Previlige p3=new Previlige("Foreign Tour",
		500000);
Set<Previlige> set1=new HashSet<Previlige>();
set1.add(p1);set1.add(p2);set1.add(p3);
Set<Previlige> set2=new HashSet<Previlige>();
set2.add(p1);	set2.add(p2);
Set<Previlige> set3=new HashSet<Previlige>();
set3.add(p1);
Emp e1=new Emp("Sachin","CEO",99000,set1);
Emp e2=new Emp("Ravi","CFO",75000,set2);
Emp e3=new Emp("Aditya","COO",60000,set3);
	
System.out.println(
		"Persisting Objects...");
EntityManager m=MyFactory.getManager();
EntityTransaction t=
	m.getTransaction();
t.begin();
		m.persist(e1);
		m.persist(e2);
		m.persist(e3);
		t.commit();
		m.close();
		System.out.println(
		"Successfully persisted.");
	}

}


