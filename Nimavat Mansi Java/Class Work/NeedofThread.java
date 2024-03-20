import java.lang.Thread;
public class NeedofThread{
	public static void main(String[] args) {
		TryPrority1 tp1=new TryPrority1();
		tp1.setPriority(1);
		tp1.start();
		TryPrority2 tp2=new TryPrority2();
		tp2.setPriority(10);
		tp2.start();
		
	}
}
class TryPrority1 extends Thread{
	public void run(){
		int i=0;
		while(true){
			i++;
			System.out.println("HI:1:"+i);
		}
	}
}
class TryPrority2 extends Thread{
	public void run(){
		int i=0;
		while(true){
			i++;
			System.out.println("HI:2:"+i);
		}
	}
}

