import java.util.*;
public class marks{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of sub1 outof100:");
		int a=sc.nextInt();
		System.out.println("Enter marksof sub2 outof100:");
		int b=sc.nextInt();
		System.out.println("Enter marksof sub3 outof100:");
		int c=sc.nextInt();
		System.out.println("Enter marksof sub4 outof100:");
		int d=sc.nextInt();
		System.out.println("Enter marksof sub5 outof100:");
		int e=sc.nextInt();
		double perc;
		perc=(a+b+c+d+e)/5.0;
		if(perc>=60){
			System.out.println("First division");
		}else if(perc>=50 && perc<=59){
			System.out.println("Second division");
		}else if(perc>=40 && perc<=49){
			System.out.println("Third division");
		}else{
			System.out.println("fail");

		}

		
	}
	
}