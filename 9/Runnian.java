
public class Runnian {
	int year;
	public Runnian( int year ){
		this.year = year;
	}
	public boolean getRunnian(){
		if( year%4==0 && year%100!=0)
			return true;
		else if(year%400==0)
			return true;
		else
			return false;
	}
}
