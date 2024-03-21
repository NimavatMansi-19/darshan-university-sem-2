import java.lang.Thread;
class MyThread implements Runnable{
	public void run(){
			while(true){
				System.out.println("Good Morning");
				try{
				Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
	}
	

}
class MyThread1 implements Runnable{
	public void run(){
			while(true){
				System.out.println("Good Afternoon");
				try{
				Thread.sleep(3000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
	}
	

}
public class Clock{
	public static void main(String[] args) {
		Thread m=new Thread(new MyThread());
		m.start();
		Thread n=new Thread(new MyThread1());
		n.start();
	}
} 