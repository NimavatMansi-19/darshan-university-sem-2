public class stream{
	public static void main(String[] args) {
		String a="stream";
		for(int i=0;i<=(a.length()-1);i++){
			for(int j=0;j<=i;j++){
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}
}