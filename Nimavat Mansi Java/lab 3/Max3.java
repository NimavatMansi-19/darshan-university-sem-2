import java.util.*;
public class Max3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		System.out.println("Enter Number:");
		int b=sc.nextInt();
		System.out.println("Enter Number:");
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(" max."+a);

			}else{
				System.out.println(" max."+c);

			}
		}else{
			if(b>c){
				System.out.println("max."+b);

			}else{
				System.out.println(" max."+c);

			}
		}
     }
}