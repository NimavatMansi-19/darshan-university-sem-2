import java.util.*;
public class Bankdemo{
	int accno;
	String username;
	String email;
	String acctype;
	double amount;
	void getDetail(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number:");
		 accno=sc.nextInt();
		System.out.println("Enter account name:");
		 username=sc.next();
		System.out.println("Enter email:");
		 email=sc.next();
		System.out.println("Enter account type:");
		 acctype=sc.next();
		System.out.println("Enter amount:");
		 amount=sc.nextDouble();


	}
	void displayAccountdetails(){
		System.out.println(accno);
		System.out.println(username);
		System.out.println(email);
		System.out.println(acctype);
		System.out.println(amount);
	}
}