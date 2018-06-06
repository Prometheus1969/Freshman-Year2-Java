
public class ChuFa extends JiSuan{
	double num1, num2 ;
	
	ChuFa(double num1 ,double num2 ){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double yunSuan(){
		return num1*1.0/num2;
	}
}
