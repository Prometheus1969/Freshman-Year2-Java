import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Winf extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JTextField jTextField1, jTextField2;
	ReadListen listen;
	
	public Winf() {

		jTextField1 = new JTextField(20);
		jTextField2 = new JTextField(20);
		setLayout(new FlowLayout());
		listen = new ReadListen();
		jTextField1.addActionListener(listen);
		add(jTextField1);
		add(jTextField2);
	}

	class ReadListen implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String string = jTextField1.getText();
			String regex = "[ ]+";
			String d[] = string.split(regex);
			double sum = 0;
			double avg, i;
			int n = 0;
			for( String s: d ){
				i = Double.parseDouble(s);
				sum = sum+i;
				n++;
			}
			avg = sum*1.0/n;
			jTextField2.setText(n+ "个数的和是:"+ sum+ "平均值是:"+ avg);
		}
		
	}
}
