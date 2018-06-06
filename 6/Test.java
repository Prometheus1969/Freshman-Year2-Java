import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<String>number = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		Outer outer = new Outer();
		int []c;
		String num;
		double aver;
		
		System.out.println("请输入数字，输入0停止：");
		num = in.nextLine();
		while( num.charAt(0) != '0' ){
			try{
				Integer.parseInt(num);
			}
			catch(java.lang.NumberFormatException e){
				System.out.println("输入错误！请输入数字"+ e.getMessage());
				System.out.println("退出");
				System.exit(0);
			}
			number.add(num);
			num = in.nextLine();
			try{
				num.charAt(0);
			}
			catch(java.lang.StringIndexOutOfBoundsException e2){
				System.out.println("输入错误！"+ e2.getMessage());
				System.out.println("退出");
				System.exit(0);
			}
		}
		String a[] = number.toArray(new String[number.size()]);
		c = new int[a.length];
		for( int i=0; i<a.length; i++){
			c[i] = Integer.parseInt(a[i]);
		}
		outer.setArray(c);
		outer.inner.show();
		aver = outer.inner.average();
		System.out.println("\n平均值为："+ aver);
	}
}
