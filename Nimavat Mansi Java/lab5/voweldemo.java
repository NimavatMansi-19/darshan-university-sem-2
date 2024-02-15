import java.util.*;
class AskString{
	String sen;
	public AskString(String sen){
		this.sen=sen;
		
		
	}
	public void vowel(){
		int count=0;
		for(int i=1;i!=sen.length();i++){
			if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u'){
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	}

	


public class voweldemo{
	public static void main(String[] args) {
		
		AskString[] str=new AskString[1000];
		for(int j=0;j<str.length;j++){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Sentence:");
		String a=sc.nextLine();
		str[j]=new AskString(a);
		String b=str[j].sen;
		
		if(b.equals("quit")){
				break;
			}
		str[j].vowel();
		
		
}
	
	
	}
	}
