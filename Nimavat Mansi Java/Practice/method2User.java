import java.util.*;
import java.text.DecimalFormat;
public class method2User{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("How many elemants you want to Access:");
		int a=sc.nextInt();
		System.out.println("At which value you have to find Answer:");
		double xn=sc.nextDouble();
		int[] x=new int[a];
		int[] y=new int[a];
		for(int i=0;i<x.length;i++){
			System.out.println("Enter value of X"+i);
			 x[i]=sc.nextInt();
		}
		//System.out.println(x[0]);
		for(int i=0;i<y.length;i++){
			System.out.println("Enter value of Y"+i);
			 y[i]=sc.nextInt();
		}
		int[] element=new int[a];
		//element[0]=y[0];
		for(int i=a;i>=1;i--){
			int[] del=new int[i-1];
			element[a-i]=y[0];
			for(int j=0;j<y.length-1;j++){
				del[j]=y[j+1]-y[j];
				//System.out.println(del[j]);
			}
				y=del;
		
		}
		double p=(xn-x[0])/(x[1]-x[0]);
		double temp=p;
		double ans;
		System.out.println(p);
		function m=new function();
		//System.out.println(m.fac(a));
		for(int i=0;i<a;i++){
			element[i]=Integer.parseInt(String.format("%s1000.4f",element[i]));
			ans+=(m.element[i]*m.func[i])/m.fac(i);

		}
		

		
	}
}
class function{
public int fac(int a){
	
	if(a==1){
		return 1;
		
	}else{
		return a*(a-1);
	}
}
public double func(int a){
	for(int i=1;i<a;i++){//here there will be error
		p=p*(p-i);
	}
}
}