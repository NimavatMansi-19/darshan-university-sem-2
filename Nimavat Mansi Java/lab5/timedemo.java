import java.util.*;
public class timedemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hour");
		int a=sc.nextInt();
		System.out.println("Enter mintues");
		int b=sc.nextInt();
		System.out.println("Enter hour");
		int c=sc.nextInt();
		System.out.println("Enter mintues");
		int d=sc.nextInt();
		time t1=new time();
		t1.hour=a;
		t1.min=b;
		time t2=new time();
		t2.hour=c;
		t2.min=d;
		t1.Add1(t1,t2);
	}
}