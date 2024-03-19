import java.util.*;
interface Abc{
	  // protected void abc();
	private void abc(){
		//private Interface allows method in Interface
	}
	
}
class Xyz implements Abc{
	// public void xyz(){
	// 	abc();
	// }
	//we can't call the method bcz it is private

}
public abstract class DemoExam{
	public static void main(String[] args){
		System.out.println("Hello");

		
	}
}
//in Interface we can't make protected method
