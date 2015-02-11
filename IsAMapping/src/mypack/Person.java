package mypack;

import javax.persistence.*;


@Entity
@SequenceGenerator(name="g1",
		sequenceName="mySequence")
@Inheritance(strategy=
	InheritanceType.TABLE_PER_CLASS)
public class Person {
@Id	
@GeneratedValue(generator="g1",
		strategy=GenerationType.SEQUENCE)
int id;
String name;

public Person() {
	super();
}
public Person(String name) {
	super();
	this.name = name;
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

}
