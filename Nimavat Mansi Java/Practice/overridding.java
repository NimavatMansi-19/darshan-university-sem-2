import java.util.*;
class Vehicle{
	
	public void start(){
		System.out.println("Add key and kick and Enter password to start:");

	}
}
class Car extends Vehicle{
	public void start(){
		System.out.println("Add key to start:");

	}
}
class Bike extends Vehicle{
	public void start(){
		System.out.println("Kick to start:");

	}
}
class eBike extends Bike{
	public void start(){
		System.out.println("Enter password and start:");

	}
}
//overriding is coplietime
//to over ride name of method should be same, return type and signature should be same as parent class main imp is it should be in parent class
public class overridding{
	public static void main(String[] args) {
		Car a=new Car();
		a.start();
		Vehicle splender=new Bike();//upcasting//
		splender.start();
		Vehicle oreva=new Bike();//upcasting//
		oreva.start();
		Vehicle myVehicle=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter \n1 for car\n2 for bike\n 3 for ebike\n for anything");
		int temp=sc.nextInt();
		if(temp==1){
			myVehicle=new Car();
		}else if(temp==2){
			myVehicle=new Bike();
		}else if(temp==3){
			myVehicle=new eBike();

		}else{

			myVehicle=new Vehicle();

		}

		myVehicle.start();


	}
}