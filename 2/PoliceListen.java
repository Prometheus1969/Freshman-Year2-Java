import javax.swing.*;
import java.awt.event.*;

public class PoliceListen implements MyCommandListener{
	JTextArea textShow;
	JTextField textInput;
	
	public void setJTextField(JTextField text) {
		textInput = text;
	}
	
	public void setJTextArea(JTextArea area) {
		textShow = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = textInput.getText();
		textShow.append(str+ "\n"+ e.getSource()+ "\n");
	}
}
