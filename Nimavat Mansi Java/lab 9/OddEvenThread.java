import java.lang.Thread;
class Odd extends Thread{
	public void run(){
		int i=1;
		try{
			while(i<=20){
				if(i%2!=0){
					System.out.println("Odd:"+i);
				}
				sleep(1000);
				i++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Even extends Thread{
	public void run(){
		int i=1;
		try{
			while(i<=20){
				if(i%2==0){
					System.out.println("Even:"+i);
				}
				sleep(1000);
				i++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class OddEvenThread{
	public static void main(String[] args) {
		Odd m=new Odd();
		m.start();
		Even n=new Even();
		n.start();
	}
}