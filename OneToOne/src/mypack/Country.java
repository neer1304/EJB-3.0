package mypack;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="g2",
		sequenceName="myKey")
public class Country {
@Id
@GeneratedValue(generator="g2",
		strategy=GenerationType.SEQUENCE)
int id;
String name;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="hosId")
HeadOfState hos;


public Country() {
	super();
}
public Country(String name, HeadOfState hos) {
	super();
	this.name = name;
	this.hos = hos;
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
public HeadOfState getHos() {
	return hos;
}
public void setHos(HeadOfState hos) {
	this.hos = hos;
}

}
