package mypack;

import java.util.List;

import javax.ejb.*;

@Remote
public interface EmpRemote {
public void save(Emp e);
public void update(Emp e);
public Emp getById(int id);
public void delete(int id);
public List<Emp> getAllEmp();
}
