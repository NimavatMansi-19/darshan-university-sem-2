import java.io.*;
public class FileExist{
	public static void main(String[] args) {
		String input=args[0];
		File file = new File(input);
		if(!file.exists()){
			System.out.println("File Not Found");
		}else{
			if(file.isFile()){
				System.out.println(file.length());
			}else{
				File[] files = file.listFiles();
				if(files!=null){
				for (File f : files) {//"for each" loop
					System.out.println(f.getName());
				}
				}
			}
		}
	}
}