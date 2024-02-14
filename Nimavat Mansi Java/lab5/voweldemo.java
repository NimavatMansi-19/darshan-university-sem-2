import java.util.*;
class AskString{
	String sen;
	public AskString(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Sentence:");
		sen=sc.nextLine();
		
		
		
	}
	public void vowel(){
		int count=0;
		for(int i=1;i!=sen.length();i++){
			if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u'){
				count++;
			}
			
		}System.out.println(count);
	}
	public void quit(){
		for(int i=0;i<1000;i++){
			if(sen=="quit"){
				break;
			}
		}
	}
	}

	


public class voweldemo{
	public static void main(String[] args) {
		AskString[] str=new AskString[5];
		for(int j=0;j<5;j++){
		str[j]=new AskString();
	}
	for(int j=0;j<5;j++){
		str[j].vowel();
	}
	for(int j=0;j<5;j++){
		if(str[j].sen=="quit"){
			break;
		}
	}
	}
	}
