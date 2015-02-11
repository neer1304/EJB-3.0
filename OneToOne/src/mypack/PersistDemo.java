package mypack;

import javax.persistence.*;

public class PersistDemo {
public static void main(String[] args) {
EntityManager m=MyFactory.getManager();
HeadOfState hos1=new HeadOfState("President","P.Patil");
HeadOfState hos2=new HeadOfState("Queen","Elizabeth III");
Country c1=new Country("India",hos1);
Country c2=new Country("England",hos2);

System.out.println("Persisting objects...");
EntityTransaction tr=m.getTransaction();
tr.begin();
m.persist(c1);
m.persist(c2);
tr.commit();
m.close();
System.out.println("persisted.");
	}

}
