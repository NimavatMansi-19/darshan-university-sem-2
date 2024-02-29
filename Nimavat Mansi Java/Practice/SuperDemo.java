class MovingObject{
	int noOfGears=2;
}
class Vehicle extends MovingObject{
	int noOfGears=5;
	public int getsuper(){
		return super.noOfGears;

	}
}
class Car extends Vehicle{
	int noOfGears=10;

	public void printGear(){
		int noOfGears=15;
		System.out.println(noOfGears);//local
		System.out.println(this.noOfGears);//instance
		System.out.println(super.noOfGears);//global	
		System.out.println(super.getsuper());
	}
}
	public class SuperDemo{
	public static void main(String[] args) {
		Car a=new Car();
		a.printGear();
		
	}
}