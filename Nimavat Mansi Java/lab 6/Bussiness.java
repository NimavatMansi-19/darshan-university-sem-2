import java.util.*;
class Member{
	String Name;
	int Age;
	int Phone_no;
	String Address;
	int Salary;
	public Member(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name::");
		name=sc.next();
		System.out.println("Enter your age::");
		Age=sc.nextInt();
		System.out.println("Enter your contact details::");
		Phone_no=sc.nextInt();
		System.out.println("Enter your Address::");
		Address=sc.next();
		System.out.println("Enter your Salary::");
		Salary=sc.nextInt();
	

	}
	public void printsalary(){
		System.out.println(Salary);
	}

}
class Employee extends Member{
	String specialization;
	public Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee's specialization::");
		specialization=sc.next();
		
	}
}
class Manager extends Member{
	String department;
	public Manager(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Manager's Department::");
		department=sc.next();
		
	}
}
public class Bussiness{
	public static void main(String[] args) {
		
	}
}