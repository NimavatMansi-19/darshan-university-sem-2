public class mutlithreading{
	
	public static void main(String[] args) {
		PrintAnyString pas=new PrintAnyString();
		pas.start();
		System.out.println("hello");
	}
}
class PrintAnyString extends Thread{
	String clgname;
	public PrintAnyString(){
		System.out.println("")

	}
	public void run(){
	 String clg="Darshan University Rajkot";
		for(int i=0;i<clg.length();i++){
			System.out.print(clg.charAt(i));
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		}
		System.out.println("");	
	}

}