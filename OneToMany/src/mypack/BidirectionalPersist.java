package mypack;

import javax.persistence.*;



public class BidirectionalPersist {
	public static void main(String[] args)
	{
	Company c1=new Company("HCL");
	Company c2=new Company("Chetu");
			
	Emp e1=new Emp("Amit","S.E.",35000,c1);
	Emp e2=new Emp("Aditya","T.L.",55000,c1);
	Emp e3=new Emp("Vipul","P.M.",75000,c1);

	Emp e4=new Emp("Hari","S.E.",25000,c2);
	Emp e5=new Emp("Sachin","Q.A.",15000,c2);
	Emp e6=new Emp("Varun","G.L.",45000,c2);

	System.out.println(
			"Persisting Objects...");
	EntityManager m=MyFactory.getManager();
	EntityTransaction t=
		m.getTransaction();
		t.begin();
			m.persist(e1);
			m.persist(e2);
			m.persist(e3);
			m.persist(e4);
			m.persist(e5);
			m.persist(e6);
			t.commit();
			m.close();
			System.out.println(
			"Successfully persisted.");
		}
}
