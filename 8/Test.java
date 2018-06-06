import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1,str2;
		Remove remove = new Remove();
		
		str1 = in.nextLine();
		remove.setString(str1);
		str2 = remove.removeStr();
		System.out.println(str2);
	}

}
