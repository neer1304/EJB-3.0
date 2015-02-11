package mypack;

import java.util.Scanner;

public class RemoveTest {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter emp Id:");
		int id=in.nextInt();
		EmpDao dao=new EmpDao();
		dao.remove(id);
		System.out.println("deleted.");
	}

}
