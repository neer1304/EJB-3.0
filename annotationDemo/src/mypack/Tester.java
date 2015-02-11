package mypack;

import java.util.Scanner;

public class Tester {

public static void main(String[] args) {
try
{
Scanner in=new Scanner(System.in);
System.out.println("Enter class Name:");
String cname=in.nextLine();
Class c=Class.forName(cname);
if (c.isAnnotationPresent(
		Descriptor.class))
			{
Descriptor des=(Descriptor)
	c.getAnnotation(Descriptor.class);
System.out.println(des.developer()+
		"\t"+des.purpose());
				
			}
			else
			{
System.out.println(cname+
		" can't be described.");
				
			}
		}catch(Exception ex)
		{
			System.out.println(ex);
			
		}
	}

}
