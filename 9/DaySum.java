
public class DaySum {
	int year;
	int day;
	int month;
	long sum=0;
	int []s = {31,28,31,30,31,30,31,31,30,31,30,31};
	Runnian runnian;
	
	public DaySum( int year, int month, int day ){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public long getDay(){
		for( int i=1; i<year; i=i+1 ){
			runnian = new Runnian(i);
			if( runnian.getRunnian() ){
				sum = sum+366;
			}
			else {
				sum = sum+365;
			}
		}
		runnian = new Runnian(year);
		if( runnian.getRunnian()){
			s[1] = 29;
		}
		for(int i=0; i<month-1; i=i+1){
			sum = sum+s[i];
		}
		sum = sum+day;
		return sum;
	}
}
