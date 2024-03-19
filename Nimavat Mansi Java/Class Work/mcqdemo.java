class Vehicle{
	{
		System.out.println("Somewhere in Vehicle");
	}

public Vehicle(){
	{
		System.out.println("Constructer in Vehicle");
	}
}
int noOfGear;
}

public class mcqdemo{
	public static void main(String[] args) {
		System.out.println("In main method");
		Vehicle a=new Vehicle();
		a.noOfGear=5;
		Vehicle b=a;
		a=null;
		//stack memory is null not heap so referance of a is b and 5 is stored in b so ans is not null//
		System.out.println(b.noOfGear);




		
	}
} 