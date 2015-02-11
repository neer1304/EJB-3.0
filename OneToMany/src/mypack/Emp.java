package mypack;

import javax.persistence.*;

@Entity
@Table(name="Emp1")
@SequenceGenerator(name="g1",
		sequenceName="mySequence")
public class Emp {
@Id
@GeneratedValue(generator="g1",
		strategy=GenerationType.SEQUENCE)
int id;
String name,job;
int salary;
@ManyToOne(cascade=CascadeType.PERSIST)
@JoinColumn(name="companyId")
Company company;

public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public Emp() {
	super();
}

public Emp(String name, String job, int salary, Company company) {
	super();
	this.name = name;
	this.job = job;
	this.salary = salary;
	this.company = company;
}
public Emp(String name, String job, int salary) {
	super();
	this.name = name;
	this.job = job;
	this.salary = salary;
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

}
