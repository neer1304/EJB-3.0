package mypack;

import java.util.Set;
import javax.persistence.*;

@Entity
@SequenceGenerator(name="g1",
		sequenceName="mySequence")
public class Emp {
@Id
@GeneratedValue(generator="g1",
			strategy=GenerationType.SEQUENCE)
int id;
String name,job;
int salary;
@ManyToMany(cascade=CascadeType.PERSIST)
@JoinTable(name="Emp_Previlige",
joinColumns={@JoinColumn(name="empId")},
inverseJoinColumns=
{@JoinColumn(name="previligeId")})
Set<Previlige> previliges;


public Emp() {
	super();
}
public Emp(String name, String job, int salary, Set<Previlige> previliges) {
	super();
	this.name = name;
	this.job = job;
	this.salary = salary;
	this.previliges = previliges;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Set<Previlige> getPreviliges() {
	return previliges;
}
public void setPreviliges(Set<Previlige> previliges) {
	this.previliges = previliges;
}

}
