package mypack;

import java.util.Set;
import javax.persistence.*;

@Entity
@SequenceGenerator(name="g2",
		sequenceName="myKey")

public class Previlige {
@Id
@GeneratedValue(generator="g2",
		strategy=GenerationType.SEQUENCE)

int id;
String name;
int cost;
@ManyToMany(mappedBy="previliges")
Set<Emp> employees;

public Previlige() {
	super();
}
public Previlige(String name, int cost) {
	super();
	this.name = name;
	this.cost = cost;
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
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public Set<Emp> getEmployees() {
	return employees;
}
public void setEmployees(Set<Emp> employees) {
	this.employees = employees;
}

}
