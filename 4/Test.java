
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computable com ;
		int sum;
		int number;
		
		com = new China();
		sum = com.ff(100);
		number = com.setNumber(32);
		System.out.println("zhang��ѧ���ǣ�"+ number+ ", ���Ϊ:"+ sum);
		
		com = new Japan();
		sum = com.ff(100);
		number = com.setNumber(14);
		System.out.println("henlu��ѧ���ǣ�"+ number+ ", ���Ϊ:"+ sum);
	}

}
