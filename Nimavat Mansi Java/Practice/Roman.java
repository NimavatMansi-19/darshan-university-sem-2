import java.util.*;
public class Roman{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		        int i=0;
        for(int j=0;j<s.length();j++){
        if(s.charAt(j)=='I'){
            i=i+1;
        }else if(s.charAt(j)=='V'){
            i=i+5;

        }else if(s.charAt(j)=='X'){
            i=i+10;

        }else if(s.charAt(j)=='L'){
            i=i+50;

        }else if(s.charAt(j)=='C'){
            i=i+100;

        }else if(s.charAt(j)=='D'){
            i=i+500;

        }else if(s.charAt(j)=='M'){
            i=i+1000;

        }else{
            System.out.println("Incrt");
        }
        }
        
    System.out.println(i);

	}
}