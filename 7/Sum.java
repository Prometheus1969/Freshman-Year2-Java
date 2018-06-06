
public class Sum implements A{
	int sum = 0;
	
	public int method (int n){
		for ( int i=1; i<=n; i++){
			sum = sum + i;
		}
		return sum;
	}
	public String name (){
		return "ÇóºÍ";
	}
}

