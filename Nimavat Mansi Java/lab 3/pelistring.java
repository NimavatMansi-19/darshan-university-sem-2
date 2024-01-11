import java.util.*;
public class pelistring{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String a=sc.next();
		int n=a.length(),i=0,end=n-1;
		while(i<n/2){
			if(a.charAt(i)!=a.charAt(end)){
				System.out.println("not pelistring");
				break;

			}
			else{
				
				i++;
				end--;
				System.out.println(" pelistring");
			}
			
		}
		
	}
}