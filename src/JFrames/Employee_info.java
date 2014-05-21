package JFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Employee_info extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JLabel nameLabel;

	/**
	 * Create the frame.
	 */
	public Employee_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("welcome");
		lblWelcome.setBounds(89, 99, 58, 14);
		contentPane.add(lblWelcome);
		
		username = new JTextField();
		username.setBounds(157, 96, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		nameLabel = new JLabel("");
		nameLabel.setBounds(167, 129, 46, 14);
		contentPane.add(nameLabel);
	}
	
	public void setUserNameFiled(String s){
		nameLabel.setText(s);		
		username.setText(s);	
	}
}
