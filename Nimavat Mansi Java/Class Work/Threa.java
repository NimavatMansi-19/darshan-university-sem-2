import java.lang.Thread;
class MyThread implements Runnable{
	public void run(){
			while(true){
				System.out.println("hello");
			}
	}
	

}
public class Threa{
	public static void main(String[] args) {
		Thread m=new Thread(new MyThread());
		m.start();
	}
} 