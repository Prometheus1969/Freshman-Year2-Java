
public class Outer {
	int []a;
	double aver;
	Inner inner = new Inner();
	
	public void printlnner(){
		System.out.println("平均数为："+ aver);
	}
	public void setArray(int [] c){
		a = new int[c.length];
		a = c;
	}
	class Inner {
		int sum = 0;
		double ave;
		
		void show(){
			for ( int k=0; k<a.length; k++ ){
				sum = sum + a[k];
				System.out.print(a[k]+ " ");
			}
		}
		double average(){
			return sum*1.0/a.length;
		}
	}
}
