import java.util.*;
public class Multi{
	public static void main(String[] args) {
		
		int m;
		
		try{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			m=x*y;
			System.out.println(m);
		}
		catch(Exception e){
			System.out.println("Invalid DataType");
		}
		System.out.println("Done");
}
}