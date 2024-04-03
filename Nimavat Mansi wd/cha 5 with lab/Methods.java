import java.io.*;
public class Methods{
	public static void main(String[] args) {
		File f=new File("Methods.java");
		System.out.println("name:"+f.getName());
		System.out.println("path:"+f.getPath());
		System.out.println("abs path:"+f.getAbsolutePath());
		System.out.println("parent:"+f.getParent());
		System.out.println(f.canRead()?"exist":"not");
		System.out.println(f.canWrite()?"exist":"not");
	}
}