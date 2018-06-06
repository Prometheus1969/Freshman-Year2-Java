
public class Test {
	
	public static void main(String[] args) {
		WindowActionEvent win = new WindowActionEvent();
		PoliceListen police = new PoliceListen();
		win.setMyCommandListener(police);
		win.setBounds(100, 100, 500, 300);
		win.setTitle("ActionEvent事件处理的案例");
	}
}
