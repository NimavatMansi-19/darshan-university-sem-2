import java.util.*;
public class prime{
 public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		int count=0,i=2;
		while(i<=a){
			if(a%i!=0){
				count++;
			}
			i++;

		}
		if(count==2){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}

 }
}