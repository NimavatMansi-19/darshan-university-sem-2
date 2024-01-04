import java.util.*;
public class clac{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	       System.out.println("Enter your num1 ");

                 int k=sc.nextInt();
        
                 System.out.println("Enter your num2 ");
                 int l=sc.nextInt();
                 System.out.println("Enter your operation(+,-,*,/,%)");
                 char m=sc.next().charAt(0);
                if(m=='+'){
                        int n=k+l;
                        System.out.println("ans="+n);
                }else if(m=='-'){
                        int n=k-l;
                        System.out.println("ans="+n);
                }else if(m=='*'){
                        int n=k*l;
                        System.out.println("ans="+n);
                }else if(m=='/'){
                        int n=k/l;
                        System.out.println("ans="+n);
                }else if(m=='%'){
                        int n=k%l;
                        System.out.println("ans="+n);
                }else{
                        System.out.println("Invalid operator");
                }
                
      
        }
        
}
	
