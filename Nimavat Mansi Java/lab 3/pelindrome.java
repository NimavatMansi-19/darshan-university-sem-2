import java.util.*;
public class pelindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int a=sc.nextInt();
		int temp=a,r=1,i=0;
        while(a!=0){
           r=a%10;
           i=i*10+r;
           a=a/10;
        }
        if(i==temp){
        	System.out.println("pelindrome");
        }else{
        	System.out.println(" not pelindrome");
        }
	}

}