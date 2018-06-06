
public class Remove {
	String str2,str3;
	String regex = "[\\D]+";
	public void setString(String str1){
		str2 = str1;
	}
	public String removeStr(){
		str3 = str2.replaceAll(regex, "");
		return str3;
	}
}
