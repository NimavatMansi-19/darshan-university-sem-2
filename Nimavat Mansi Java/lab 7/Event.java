//Create interface EventListener with performEvent() method.
// Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods.
// Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods.
// WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.
interface EventListener{
	public void performEvent();
		
}
interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface KeyListener extends EventListener{
	
	public void keyPressed();
	public void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
		public void performEvent(){
			System.out.println("hello");
		}
		public void mouseClicked(){
			System.out.println("its mouse:");
		}
		public void mousePressed(){
			System.out.println("its mouse:");
		}
		public void mouseReleased(){
			System.out.println("its mouse:");
		}
		public void mouseMoved(){
			System.out.println("its mouse:");
		}
		public void mouseDragged(){
			System.out.println("its mouse:");
		}
	public void keyPressed(){
		System.out.println("its key");
	}
	public void keyReleased(){
		System.out.println("its key");
	}


}
public class Event{
	public static void main(String[] args) {
		EventDemo l=new EventDemo();
		l.mouseClicked();
	}
}