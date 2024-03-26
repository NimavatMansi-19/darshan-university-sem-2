import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class meth2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		// NumberFormat nf = NumberFormat.getInstance();
  //  		nf.setMinimumFractionDigits(4);
		System.out.println("How many elemants you want to Access:");
		int a=sc.nextInt();
		System.out.println("At which value you have to find Answer:");
		double xn=sc.nextDouble();
		double[] x=new double[a];
		double[] y=new double[a];
		double[] z=new double[a];
		z=y;
		for(int i=0;i<x.length;i++){
			System.out.println("Enter value of X"+i);
			 x[i]=sc.nextDouble();
			 x[i]=Double.valueOf(df.format(x[i]));


		}
		//System.out.println(x[0]);
		for(int i=0;i<y.length;i++){
			System.out.println("Enter value of Y"+i);
			 y[i]=sc.nextDouble();
			 y[i]=Double.valueOf(df.format(y[i]));
			
			 
		}
		double[] element=new double[a];
		//element[0]=y[0];
		for(int i=a;i>=1;i--){
			double[] del=new double[i-1];
			element[a-i]=y[0];
			for(int j=0;j<y.length-1;j++){
				del[j]=y[j+1]-y[j];
				del[j]=Double.valueOf(df.format(del[j]));
                //System.out.println(del[j]);
	
			}
				y=del;
		
		}

		double p=(xn-x[0])/(x[1]-x[0]);
		double temp=p;
		double ans=z[0];
		System.out.println(p);
		//function m=new function();
		for(int i=0;i<a-1;i++){
			element[i]=Double.valueOf(df.format(element[i]));
			ans=ans+((func(i,temp)*element[i+1])/fac(i+1)) ;
			ans=Double.valueOf(df.format(ans));

		}
		System.out.println(ans);
		//System.out.println(fac(3));
		//func(a,temp);
		
	}
	public static int fac(int a){
	
	if(a==1){
		return 1;
		
	}else{
		return a*(a-1);
	}
}
public static double func(int a,double p){
	double value=p;
	p=p-1;

	for(int k=0;k<a;k++){
		value*=p;
		p=p-1;
		
	}

	return value;
	
	


}
}