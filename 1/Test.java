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
		
		System.out.print("�������һ������");
		num1 = in.nextInt();
		System.out.print("������ڶ�������");
		num2 = in.nextInt();
		in.nextLine();
		System.out.print("�������������");
		s = in.nextLine();
		c = s.charAt(0);
		switch (c) {
		case '+':
			js = new JiaFa(num1, num2);
			System.out.println("��Ϊ"+ js.yunSuan());
			break;
		case '-':
			js = new JianFa(num1 ,num2);
			System.out.println("��Ϊ"+ js.yunSuan());
			break;
		case '*':
			js = new ChengFa(num1, num2);
			System.out.println("��Ϊ"+ js.yunSuan());
			break;
		case '/':
			js = new ChuFa(num1, num2);
			System.out.println("��Ϊ"+ js.yunSuan());
			break;
		default:
			System.out.println("����������������");
			break;
		}
	}

}
