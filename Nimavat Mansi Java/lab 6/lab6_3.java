import java.util.*;
class Book{
	private String author_name; 
	Book(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter author_name::");
		author_name=sc.next();
		System.out.println("author_name::"+author_name);
	}
		void Display(){
			System.out.println("book_publication and paper_publication:::");
		
	}
	}
class book_publication extends Book{
	private String title;
	book_publication(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your title name::");
		title=sc.next();
	}
	void Display(){
		System.out.println("Your title of book_publication::"+title);
	}

}
class paper_publication extends Book{
	private String title;
	paper_publication(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your title name::");
		title=sc.next();
	}
	void Display(){
		
		System.out.println("Your title of paper_publication::"+title);

	}
}
public class lab6_3{
	public static void main(String[] args) {
		Book myBook=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no::");
		int temp=sc.nextInt();
		if(temp==1){
			myBook=new book_publication();
		}else if(temp==2){
			myBook=new paper_publication();
			
		}else{

			System.out.println("Invalid Data...!");

		}
		myBook.Display();


	}
}