import java.lang.Thread;
import java.util.Date;
class CountStu extends Thread{
	public void run(){
		for(long i=0;i<10000000l;i++){
			//code here
		}
		System.out.println("loop Done");
	}
}
public class DemoWhatWhen{
	public static void main(String[] args) {
		long dStart=new Date().getTime();
		CountStu cs=new CountStu();
		CountStu cs1=new CountStu();
		CountStu cs2=new CountStu();
		cs.start();
		cs1.start();
		cs2.start();
		//waitting in main
		try{
		cs.join();
		cs1.join();
		cs2.join();
	}catch(Exception e){
		e.printStackTrace();
	}
		System.out.println("program Done");

		long dEnd=new Date().getTime();
		System.out.println("Time="+(dEnd-dStart)+"ms");
	}
}
//As Multi Thread means java does two program together and here run method is too long 
//start separate two thread run and main so smaller thread is small so its o/p will be first