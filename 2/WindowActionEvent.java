import javax.swing.*;

import java.awt.*;

public class WindowActionEvent extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JTextArea textShow;
	JTextField textInput;
	JButton button;
	Label label;
	MyCommandListener listener;
	
	public WindowActionEvent() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	void init() {
		setLayout(new FlowLayout());
		textInput = new JTextField(30);
		button = new JButton("确定");
		textShow = new JTextArea(9,30);
		label = new Label("ActionEvent的事件处理");
		add(label);
		add(new JScrollPane(textShow));
		add(button);
		add(textInput);
	}
	
	void setMyCommandListener(MyCommandListener listener){
		this.listener = listener;
		listener.setJTextField(textInput);
		listener.setJTextArea(textShow);
		button.addActionListener(listener);
	}
	
}
