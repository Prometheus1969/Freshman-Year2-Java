
public class Test {
	
	public static void main(String[] args) {
		WindowActionEvent win = new WindowActionEvent();
		PoliceListen police = new PoliceListen();
		win.setMyCommandListener(police);
		win.setBounds(100, 100, 500, 300);
		win.setTitle("ActionEvent�¼�����İ���");
	}
}
