import java.util.*;
class Student{
	int id_no;
	int no_of_subjects_registered;
	int[] subject_code;
	int[] subject_credit;
	char[] grade;
	double spi;
     Student(){
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter id no");
     	id_no=sc.nextInt();
     	System.out.println("Enter Number of registered subject:");
     	no_of_subjects_registered=sc.nextInt();
     	subject_code=new int[no_of_subjects_registered];
     	subject_credit=new int[no_of_subjects_registered];
     	grade=new char[no_of_subjects_registered];


     	 for(int i=0;i<no_of_subjects_registered;i++){
     	 	System.out.println("Enter subject code:");
     	 	subject_code[i]=sc.nextInt();
     	 	System.out.println("Enter subject credit:");
     	 	subject_credit[i]=sc.nextInt();
			System.out.println("Enter subject grade:");
     	 	grade[i]=sc.next().charAt(0);

     	 }

     }
    public void spi_cal(){
    	System.out.println("0.00");
     	 	

    } 
}
public class Result{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students in your class:");
		int a=sc.nextInt();
		Student[] s=new Student[a];
		for(int i=0;i<a;i++){
			s[i]=new Student();
			s[i].spi_cal();

		}
	}
}