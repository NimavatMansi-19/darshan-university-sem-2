public class countobj{
	static int count=0;
	public countobj(){
		count++;
}
	public static void main(String[] args) {
		countobj c1=new countobj();
		countobj c2=new countobj();
		countobj c3=new countobj();
		countobj c4=new countobj();
		countobj c5=new countobj();
		System.out.println("Count="+count);
	}

}
