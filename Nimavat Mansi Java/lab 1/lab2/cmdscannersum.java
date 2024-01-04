import java.util.*;
public class cmdscannersum{
	public static void main(String[] args) {
		int k=Integer.parseInt(args[0]);
		
		int l=Integer.parseInt(args[1]);
		int sum=k+l;

		System.out.println("sum="+sum);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your num1 ");
        int x=sc.nextInt();
        
        System.out.println("Enter your num2 ");
        int y=sc.nextInt();
        
        int n;
        n=x+y;
        System.out.println("sum="+n);
	}
}