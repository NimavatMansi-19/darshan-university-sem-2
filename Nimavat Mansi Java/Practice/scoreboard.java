public class scoreboard{
	public static void main(String[] args) {
		//56=wide ball
		//66=no ball
		//70=wicket
		int runperover[][][]={
        
			{
				{2,3,4,5,6,4},
				{56,3,6,70,2,4},
				{70,6,4,66,4,4}
			
			},
        {
			
				{2,3,4,5,56,3},
				{56,3,66,0,2,4},
				{70,6,4,66,4,4}
        }
			
		};
			int tt=0,wideball=0,noball=0,wicket=0;
		for(int k=0;k<2;k++){
		for(int i=0;i<3;i++){
			for(int j=0;j<6;j++){
				if(runperover[k][i][j]==56){
					runperover[k][i][j]=1;
					tt=tt+runperover[k][i][j];
					wideball++;
				}
				if(runperover[k][i][j]==66){
					runperover[k][i][j]=0;
					tt=tt+runperover[k][i][j];
					noball++;
				}if(runperover[k][i][j]==70){
					runperover[k][i][j]=0;
					tt=tt+runperover[k][i][j];
					wicket++;
				}else{
				tt=tt+runperover[k][i][j];
			}
				

		}
	}
		
	}
	System.out.println("total runs="+tt);
	System.out.println("Wideball="+wideball);
	System.out.println("noball="+noball);
	System.out.println("Wicket="+wicket);
}
}