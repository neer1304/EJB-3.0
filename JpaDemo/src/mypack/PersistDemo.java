package mypack;

import javax.persistence.*;

public class PersistDemo {
public static void main(String[] args) {
EntityManager m=MyFactory.getManager();
Emp e1=new Emp("Rahul","Trainer",45000);
Emp e2=new Emp("Aditya","CEO",78000);
System.out.println("Persisting objects...");
EntityTransaction tr=m.getTransaction();
tr.begin();
m.persist(e1);
m.persist(e2);
tr.commit();
m.close();
System.out.println("persisted.");
	}

}
