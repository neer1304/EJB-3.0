package mypack;

import java.util.Scanner;
import javax.naming.InitialContext;

public class Client {
public static void main(String[] args) {
try{
System.out.println(
		"Obtaining bean stub...");
InitialContext ctx=new InitialContext();
AdderSubtractor stub=(AdderSubtractor)
		ctx.lookup("adderSubtractor");
System.out.println(
"Stub obtained, invoking business methods...");
Scanner in=new Scanner(System.in);
	System.out.println("Enter First No.");
	int a=in.nextInt();
	System.out.println("Enter Second No.");
	int b=in.nextInt();
		int s=stub.add(a, b);
		int d=stub.subtract(a, b);
System.out.println("Sum is : "+s);
System.out.println("Difference is : "+d);
		}catch(Exception ex)
		{
			System.out.println(ex);
			
		}
	}

}

