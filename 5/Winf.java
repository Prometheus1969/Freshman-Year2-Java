import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Winf extends JFrame {
	JButton jia, jian, cheng, chu;
	JTextField jTextField1, jTextField2, jTextField3;
	PoliceListener police;
	
	public Winf() {
		setLayout(new FlowLayout());
		jTextField1 = new JTextField(30);
		jTextField2 = new JTextField(30);
		jia = new JButton("加法");
		jian = new JButton("减法");
		cheng = new JButton("乘法");
		chu = new JButton("除法");
		police = new PoliceListener();
		add(jTextField1);
		jTextField1.addActionListener(police);
		add(jTextField2);
		jTextField2.addActionListener(police);
		add(jia);
		jia.addActionListener(police);
		add(jian);
		jian.addActionListener(police);
		add(cheng);
		cheng.addActionListener(police);
		add(chu);
		chu.addActionListener(police);
		jTextField3 = new JTextField(30);
		add(jTextField3);
		jTextField3.addActionListener(police);
	}
	
	class PoliceListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			try {
				double x = Double.parseDouble(jTextField1.getText());
				double y = Double.parseDouble(jTextField2.getText());
				double ans;
				if( e.getSource() == jia ){
					ans = x+y;
					jTextField3.setText(ans+ "");
				}
				else if ( e.getSource() == jian ) {
					ans = x-y;
					jTextField3.setText(ans+"");
				}
				else if( e.getSource() == cheng ){
					ans = x*y;
					jTextField3.setText(ans+"");
				}
				else if( e.getSource() == chu ){
					ans = x*1.0/y;
					jTextField3.setText(ans+"");
				}
			}
			catch (Exception e2) {
				jTextField3.setText("Wrong! 请输入数字!");
			}
		
		}
	}
}
