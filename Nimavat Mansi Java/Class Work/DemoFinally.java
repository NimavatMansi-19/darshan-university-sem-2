import java.io.*;
import java.util.*;
public class DemoFinally{
	public static void main(String[] args) {
		try{
			printstream ps=new printstream(new file("abclasdflasdf.txt"));
			Scanner sc=new Scanner(system.in);
			int temp=sc.nextInt();
			for(int i=0;i<temp;i++) {
				ps.println("hello world from java"+i);
			}
		}catch(FileNoFoundException fne){
			fne.printstacktrace();
		}
		finally{
			System.out.println("closing the file");
			ps.close();
		}
	}
}