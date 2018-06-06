import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DaySum daysum1;
		DaySum daysum2;
		long sum1,sum2;
		
		int year1 = in.nextInt();
		int month1 = in.nextInt();
		int day1 = in.nextInt();
		int year2 = in.nextInt();
		int month2 = in.nextInt();
		int day2 = in.nextInt();

		daysum1 = new DaySum(year1,month1,day1);
		daysum2 = new DaySum(year2,month2,day2);
		sum1 = daysum1.getDay();
		sum2 = daysum2.getDay();
		System.out.println(sum2-sum1);
	}
}