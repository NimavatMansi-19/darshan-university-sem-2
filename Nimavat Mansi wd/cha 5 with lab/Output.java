import java.io.*;
public class Output{
	public static void main(String[] args) {
		try{
		FileOutputStream fout=new FileOutputStream("abc.txt");
		String s="Hi hello";
		byte[] b=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Done...");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}