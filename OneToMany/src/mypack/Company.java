package mypack;

import java.util.Set;
import javax.persistence.*;

@Entity
@SequenceGenerator(name="g2",
		sequenceName="myKey")

public class Company {
@Id
@GeneratedValue(generator="g2",
		strategy=GenerationType.SEQUENCE)
int id;
String name;
//@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="companyId")
/*@JoinTable(name="Company_Emp",joinColumns=
{@JoinColumn(name="companyId")},
		inverseJoinColumns=
		{@JoinColumn(name="empId")})*/
@OneToMany(mappedBy="company")
Set<Emp> employees;

public Company() {
	super();
}

public Company(String name) {
	super();
	this.name = name;
}

public Company(String name, Set<Emp> employees) {
	super();
	this.name = name;
	this.employees = employees;
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
public Set<Emp> getEmployees() {
	return employees;
}
public void setEmployees(Set<Emp> employees) {
	this.employees = employees;
}

}
