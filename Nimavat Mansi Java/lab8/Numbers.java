import java.util.*;
public class Numbers{
	public static void main(String[] args) {
		negative();
	}
		public static void negative(){
			try{
				numb();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{

			}
		}
		public static void numb() throws Exception{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 0 to exit::");
		for(int i = 1;i!=0;i++){
			System.out.println("Enter your Number::");
        	int randomIndex = sc.nextInt();
        if(randomIndex<0){
        	throw new Exception("-ves are not allowed");
        }
        else{
        System.out.println(randomIndex);
       }
    }
		}
	
}
