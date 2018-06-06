import java.util.Calendar;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		int year1 = in.nextInt();
		int month1 = in.nextInt();
		int day1 = in.nextInt();
		int year2 = in.nextInt();
		int month2 = in.nextInt();
		int day2 = in.nextInt();
		calendar1.set(year1, month1-1, day1 );
		calendar2.set(year2, month2-1, day2 );
		long time1 = calendar1.getTimeInMillis();
		long time2 = calendar2.getTimeInMillis();
		long subday = (time2 - time1)/(1000*60*60*24);
		System.out.println("œ‡≤Ó: "+ subday+ " ÃÏ");
	}
}
