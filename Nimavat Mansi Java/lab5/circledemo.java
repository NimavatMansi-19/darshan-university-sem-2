import java.util.*;
public class circledemo{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius:");
	double a=sc.nextDouble();
	circle c=new circle();
		c.radius=a;
		c.area(a);
	}
}