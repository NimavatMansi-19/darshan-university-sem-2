import java.io.*;
public class Replaces{
	public static void main(String[] args) {
		String filePath = "xyz.txt";
		String f="out.txt";
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
			BufferedWriter out=new BufferedWriter(new FileWriter(f));) {
            String line;
			while((line=reader.readLine())!=null){
				String newLine = line.replaceAll("Mansi", "Nimavat Mansi");
                out.write(newLine);
                out.newLine();
//Ask About Your Logic
			// 	if(words.equals("Mansi")){
			// 		words="Darshi";
			// 	}
			// 	out.write(words);
			// 	out.close();
			 }
			}catch(Exception e){
				e.printStackTrace();
			

		}
	}
}