import java.util.*;
import java.lang.Thread;
class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("Hello");
			try{
			sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
}
public class Thr{
	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
	}
}