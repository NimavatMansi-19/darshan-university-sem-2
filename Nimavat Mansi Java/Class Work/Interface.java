interface Object{
	public void getHeight();
	public void getHeight();
}
interface  MovingObject extends Object{//no need to write Abstract by deafault it  is abstract
	public  void start();
	public  void stop();
	public  void turnLeft();
	public  void turnRight();//All the body or method of abstract class will be given in any class then only we can compile
	int a=12;
}
abstract class Vehicle implements MovingObject{//we use implements in Interface
	public void start(){
		//code
	}
	
	public void turnLeft(){
		//code
	}
	public void turnRight(){
		//code
	}
	

}
class Car extends Vehicle{
public void stop(){
		//code
	}
}

public class Interface{
	public static void main(String[] args) {
		System.out.println(Car.a);
		
	}
}
//All the method are abstract
//we cannot creat instance variable
//we can create using public static
//interfaces are more abstract than abstract class