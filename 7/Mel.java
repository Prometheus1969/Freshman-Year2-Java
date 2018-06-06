
public class Mel implements A{
	int mel = 1;

	public int method (int n){
		for ( int i=1; i<=n; i++ ){
			mel = mel * i;
		}
		return mel;
	}
	public String name (){
		return "½×³Ë";
	}
}
