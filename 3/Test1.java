import javax.swing.JFrame;


public class Test1 {
	public static void main(String args[]) {
		Winf win = new Winf();
		win.setBounds(50,50,400,400);
		win.setTitle("actionevent事件处理的案例");
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
