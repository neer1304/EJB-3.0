package mypack;

import javax.persistence.*;

public class EmpDao {

public Emp getById(int id){
EntityManager m=MyFactory.getManager();
Emp e=m.find(Emp.class,id);
m.close();
return e;
}
public void update(Emp e)
{
EntityManager m=MyFactory.getManager();
EntityTransaction t=m.getTransaction();
		t.begin();
		m.merge(e);
		t.commit();
		m.close();
		
	}
public void remove(int id)
{
EntityManager m=MyFactory.getManager();
Emp e=m.getReference(Emp.class,id);
EntityTransaction t=m.getTransaction();
t.begin();
		m.remove(e);
		t.commit();
		m.close();
		
	}
}




