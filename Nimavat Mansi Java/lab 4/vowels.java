import java.util.*;
public class vowels{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your string:");
		String  a=sc.nextLine();
		int i=0,b=a.length(),n=b,vo=0,con=0;
		while(i!=n){
			if(a.charAt(i)=='a' ||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
				vo++;
				i++;
			}else{
				con++;
				i++;
			}
		}
		System.out.println(vo);
		System.out.println(con);
	}
}