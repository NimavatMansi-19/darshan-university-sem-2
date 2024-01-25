public class caperror{
	public static void main(String[] args) {
		  int length=args.length;
		  for(int i=0;i<=length;i++){
		  	if(args[i].charAt(0)<65 || args[i].charAt(0)>90){
		  		System.out.println("Error:string is not started with capital");
		  		return;
		  	}
		  }

		 
		
	}
}