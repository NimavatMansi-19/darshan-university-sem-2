import java.io.*;
public class StudentDetail{
	public static void main(String[] args){
		String filename="Detail.txt";
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter(filename));
			bw.write("Darshan,20\n");
			bw.write("Mansi,18\n");
			bw.write("Darshi,18\n");
			bw.close();
			System.out.println("Done");

		
			BufferedReader br=new BufferedReader(new FileReader(filename));
			String line;

			while((line=br.readLine())!=null){
				String[] word=line.split(",");
				String name=word[0];
				int age=Integer.parseInt(word[1]);
				Student st=new Student(name,age);
				System.out.println(st);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+","+age;
	}
}