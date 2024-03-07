import java.util.*;
class vegetable{
	String colour;
	vegetable(){
		Scanner sc=new Scanner(System.in);
		colour=sc.next();
	}
	abstract public String getName();
	public String toString(){
		return getName()+"with colour"+colour;
	}

	
}
class Potato extends vegetable{
	Potato(String colour){
		super(colour);
	}
	public String getName(){
		return "Potato";
	}

}
class Brinjal extends vegetable{
	Brinjal(String colour){
		super(colour);
	}
	public String getName(){
		return "Brinjal";
	}
	
}
class Tomato extends vegetable{
	Tomato(String colour){
		super(colour);
	}
	public String getName(){
		return "Tomato";
	}
	
}
public class Vegetable{
	public static void main(String[] args) {
		vegetable v1=new Tomato();
		v1.
	}
}