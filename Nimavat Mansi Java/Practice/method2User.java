import java.util.*;
public class method2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How much value you want to Enter:");
		int m=sc.nextInt();
		int j=3;
		int[] x=new int[m];
		int[] y=new int[m];
		int[][] dely=new int[m-1][j];
		System.out.println("Enter the value where you need to find Answer:" );
		int a=sc.nextInt();
		//System.out.println(a);
		double p;
		double ans;
		for(int i=0;i<x.length;i++){
			System.out.println("Enter value of X"+i);
			 x[i]=sc.nextInt();
		}
		//System.out.println(x[0]);
		for(int i=0;i<y.length;i++){
			System.out.println("Enter value of Y"+i);
			 y[i]=sc.nextInt();
		}
		
			
			p=(a-x[0])/2.0;
		System.out.println("Value of p is:"+p);
		}
	}
class elemant{
	public elemant(int )
}