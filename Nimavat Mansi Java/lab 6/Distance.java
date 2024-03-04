import java.util.*;
class myPoint{
	int x;
	int y;
	public int getx(){
		return x;
	}
	public int gety(){
		return y;
	}
	public void set(int x,int y){
		this.x=x;
		this.y=y;
	}
	myPoint(){
		x=0;
		y=0;
	}
	myPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class Distance{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of X::");
		int a=sc.nextInt();
		System.out.println("Enter value of Y::");
		int b=sc.nextInt();
		
		myPoint m=new myPoint(a,b);
		System.out.println("value of point is>>"+m.x+","+m.y);
	}
}