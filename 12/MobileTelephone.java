
public class MobileTelephone {
	SIM card;
	
	public void useSIM( SIM c ){
		card = c;
	}
	
	public void showMess(){
		System.out.println("ʹ�õĿ��ǣ�"+ card.giveCorpName()+ "�ṩ��");
		System.out.println("�ֻ������ǣ�"+ card.giveNumber());
	}
}
