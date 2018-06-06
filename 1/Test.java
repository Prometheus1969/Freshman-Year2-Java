import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, answer;
		JiSuan js;
		String s;
		char c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		num1 = in.nextInt();
		System.out.print("请输入第二个数：");
		num2 = in.nextInt();
		in.nextLine();
		System.out.print("请输入运算符：");
		s = in.nextLine();
		c = s.charAt(0);
		switch (c) {
		case '+':
			js = new JiaFa(num1, num2);
			System.out.println("答案为"+ js.yunSuan());
			break;
		case '-':
			js = new JianFa(num1 ,num2);
			System.out.println("答案为"+ js.yunSuan());
			break;
		case '*':
			js = new ChengFa(num1, num2);
			System.out.println("答案为"+ js.yunSuan());
			break;
		case '/':
			js = new ChuFa(num1, num2);
			System.out.println("答案为"+ js.yunSuan());
			break;
		default:
			System.out.println("您输入的运算符有误！");
			break;
		}
	}

}
