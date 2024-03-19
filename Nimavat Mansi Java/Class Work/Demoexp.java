import java.util.*;
public class Demoexp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		try{
		System.out.println("Enter your value::");
		 a=sc.nextInt();
		System.out.println("Enter your value::");
		 b=sc.nextInt();
	}catch(Exception e){
		System.out.println("Enter data as Integer");
	}
		try{
		int ans=a/b;
		System.out.println("Enter your ans::"+ans);
		}catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println("Have a nice day");
	}
}
//methods to handel exception
//first way is try and catch