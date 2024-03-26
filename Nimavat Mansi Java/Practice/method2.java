import java.math.BigDecimal;
import java.math.RoundingMode;


    
    //how to fix ans upto 4 digit.
//recursion
public class method2{
	public static void main(String[] args) {
		// Scanner sc= new Scanner(System.in);
		// DecimalFormat df = new DecimalFormat("#.####");
		// System.out.println("How much value you want to Enter:");
		// int m=sc.nextInt();
		// int j=3;
		// int[] x=new int[4];
		// float[] y=new float[4];
		// float[][] dely=new float[3][j];
		// System.out.println("Enter the value where you need to find Answer:" );
		// int a=sc.nextInt();
		// //System.out.println(a);
		// float p;
		// float ans;
		// for(int i=0;i<x.length;i++){
		// 	System.out.println("Enter value of X"+i);
		// 	 x[i]=sc.nextInt();
		// }
		// //System.out.println(x[0]);
		// for(int i=0;i<y.length;i++){
		// 	System.out.println("Enter value of Y"+i);
		// 	 y[i]=sc.nextFloat();
		// }
		
			
		// 	p=(a-x[0])/2f;
		// System.out.println("Value of p is:"+p);
		// for(int i=0;i<3;i++){
		// 	for(int k=0;k<j;k++){
		// 		if(i==0){
		// 		j=j-i;
		// 		dely[0][k]=y[k+1]-y[k];
		// 		dely[0][k]=Float.valueOf(df.format(dely[0][k]));
		// 		System.out.println("y0:"+dely[0][k]);
		// 	}
		// 		if(i==1){
		// 			j=j-i;
		// 		dely[1][k]=dely[0][k+1]-dely[0][k];
		// 		dely[1][k]=Float.valueOf(df.format(dely[1][k]));
		// 		System.out.println("y1:"+dely[1][k]);	
		// 		}
		// 		if(i==2){
		// 		j=j-i;
		// 		dely[2][k]=dely[1][k+1]-dely[1][k];
		// 		dely[2][k]=Float.valueOf(df.format(dely[2][k]));
		// 		System.out.println("y2:"+dely[2][k]);
		// 		}

		// }
		// }
		// ans=y[0]+p*dely[0][0]+(p*(p-1f)*dely[1][0])/2f+(p*(p-1f)*(p-2f)*dely[2][0])/6f;
		// System.out.println(ans);
		double operation = -7.0e^-4;
            BigDecimal big = new BigDecimal(operation);     
            big = big.setScale(4, RoundingMode.HALF_UP);        
            double d2 = big.doubleValue();
            System.out.println(String.format("operation : %s", operation));
            System.out.println(String.format("scaled : %s", d2));
 
		    
	}
}