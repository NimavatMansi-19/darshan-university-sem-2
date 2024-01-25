import java.util.*;
public class diamond{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int i,j;
		for(i=1;i<=((a*2)-1);i++){
			if(i>a){
				for(j=a;j>=i-(a-1);j--){
					System.out.print("*");
					
				}
			}
			else{
				for(j=1;j<=i;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}