import java.io.*;
public class Readers{
	public static void main(String[] args) {
		try{
			Reader r=new FileReader("xyz.txt");
			int a=r.read();
			while(a!=1){
				char d=(char)a;
				a=r.read();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
}
}