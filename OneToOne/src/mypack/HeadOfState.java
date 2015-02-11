package mypack;

import javax.persistence.*;

@Entity
@Table(name="hos")
@SequenceGenerator(name="g1",
		sequenceName="mySequence")
public class HeadOfState {
@Id
@GeneratedValue(generator="g1",
		strategy=GenerationType.SEQUENCE)
int id;
String title,name;
@OneToOne(mappedBy="hos")
Country country;

public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public HeadOfState() {
	super();
}
public HeadOfState(String title, String name) {
	super();
	this.title = title;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
