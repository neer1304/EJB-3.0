package mypack;
import javax.persistence.*;

public class MyFactory {
static EntityManagerFactory factory;
static
{
factory=Persistence.createEntityManagerFactory(
		"emp");	
}
public static EntityManager getManager()
{
return factory.createEntityManager();	
}
}



