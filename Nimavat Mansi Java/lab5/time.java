public class time{
	int hour;
	int min;
	time(){
	}
	 time(int h,int m){
	 	hour=h;
	 	min=m;
	 }
	 void Add1(time t1,time t2){
	 	time t3=new time();
	 	t3.hour=t1.hour+t2.hour;
	 	t3.min=t1.min+t2.min;
	 	if(t3.min>60){
	 		int c=t3.min/60;
	 		t3.hour=t3.hour+c;
	 		t3.min=t3.min%60;
	 	}
	 	System.out.println(t3.hour+":"+t3.min);
	 }
}