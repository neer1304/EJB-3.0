package mypack;

import javax.persistence.*;

public class PersistDemo {
public static void main(String[] args) {
EntityManager m=MyFactory.getManager();
Person p=new Person("Rahul");
Emp e=new Emp("Aditya","CEO",78000);
Student s=new Student("Ravi","Java",7000);
System.out.println("Persisting objects...");
EntityTransaction tr=m.getTransaction();
tr.begin();
m.persist(p);
m.persist(e);
m.persist(s);
tr.commit();
m.close();
System.out.println("persisted.");
	}

}
