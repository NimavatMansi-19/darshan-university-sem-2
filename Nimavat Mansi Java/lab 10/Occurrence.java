//Write an application that reads a file and counts the number of occurrences of digit 5.
// Supply the file name as a command-line argument.
import java.io.*;
import java.util.*;

public class Occurrence{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int count=0;
		int wordcount=0;
		try(BufferedReader in=new BufferedReader(new FileReader(a))){
			String line;
			while((line=in.readLine())!=null){
				//System.out.println(line);
		String[] words = line.split("\\s+");//Space
		
		for(int i=0;i<words.length;i++){
                	if(words[i].equals("5")){
                		wordcount++;
                	}
                 }
        
               
                
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}
		        
		System.out.println(wordcount);
		
	}
}