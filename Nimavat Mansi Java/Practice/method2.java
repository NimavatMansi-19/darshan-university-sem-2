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
		int n=0;
		for(int i=0;i<m-1;i++){
			for(int k=0;k<j;k++){
				if(i==n){
					j=j-i;
				dely[n][k]=y[k+1]-y[k];
				System.out.println("y0:"+dely[n][k]);
			}
				/*if(i==n){
					j=j-i;
				dely[1][k]=dely[0][k+1]-dely[0][k];
				System.out.println("y1:"+dely[1][k]);	
				}
				if(i==n){
				j=j-i;
				dely[2][k]=dely[1][k+1]-dely[1][k];
				System.out.println("y2:"+dely[2][k]);
				}*/
				if(i==m-1){
					break;
				}

		}
		n++;
		}
		ans=y[0]+p*dely[0][0]+(p*(p-1.0)*dely[1][0])/2+(p*(p-1)*(p-2)*dely[2][0])/6;
		System.out.println(ans);
	}
}