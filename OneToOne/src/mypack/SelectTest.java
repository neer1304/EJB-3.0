package mypack;

import javax.persistence.EntityManager;
import java.util.*;
public class SelectTest {

public static void main(String[] args) {
EntityManager m=MyFactory.getManager();
Scanner in=new Scanner(System.in);
System.out.println("Enter country Id");
int cid=in.nextInt();
Country c=m.find(Country.class, cid);
System.out.println("Country Name: "+
		c.getName());
System.out.println("Head of State:");
HeadOfState h=c.getHos();
System.out.println(h.getTitle()+"\t"+
		h.getName());
System.out.println("Enter HeadOfState Id");
int hid=in.nextInt();
HeadOfState hos=m.find(HeadOfState.class,hid);
System.out.println("Head of State Details:");
System.out.println(hos.getTitle()+"\t"+
		hos.getName());
Country ct=hos.getCountry();
System.out.println("Country Name : "+
		ct.getName());
		m.close();
	}

}





