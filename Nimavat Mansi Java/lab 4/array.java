import java.util.*;
public class array{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[4];
		int sum=0,i;
		for(i=0;i<4;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		double avg=sum/4.0;
		 System.out.println(avg);
		
	}
}