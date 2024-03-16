interface Transport{
	public void Delivery();
}
abstract class Animal implements Transport{
   public void Delivery(){
   	System.out.println("Hello");
   }
}
class Tiger extends Animal{

}
class Camel extends Animal{
	
}
class Deer extends Animal{
	
}
class Donkey extends Animal{
	
}
public class Deliver{
	public static void main(String[] args) {
		Animal[] a=new Animal[4];
		a[0]=new Tiger();
		a[1]=new Camel();
		a[2]=new Deer();
		a[3]=new Donkey();
		
	}
}