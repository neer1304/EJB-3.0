package mypack;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless(mappedName="myEmp")
public class EmpBean implements EmpRemote
{
	@PersistenceContext(unitName="emp")
	EntityManager manager;
	
	public void delete(int id) {
		Emp e=manager.find(Emp.class, id);
		manager.remove(e);
	}

	public List<Emp> getAllEmp() {
	Query q=manager.createQuery(
				"select e from Emp e");
	return (List<Emp>)q.getResultList();
	}

	public Emp getById(int id) {
		return manager.find(Emp.class,id);
	}

	public void save(Emp e) {
		manager.persist(e);
	}

	public void update(Emp e) {
		manager.merge(e);
	}

}


