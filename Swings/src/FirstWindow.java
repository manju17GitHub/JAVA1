import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow extends JFrame {

	private JPanel tfr;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		tfr = new JPanel();
		tfr.setBackground(new Color(255, 255, 0));
		tfr.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(tfr);
		tfr.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(156, 10, 123, 22);
		tfr.add(lblNewLabel);
		
		JLabel labela = new JLabel("A");
		labela.setForeground(new Color(255, 0, 0));
		labela.setFont(new Font("Tahoma", Font.BOLD, 14));
		labela.setBounds(156, 59, 10, 17);
		tfr.add(labela);
		
		tfa = new JTextField();
		tfa.setBounds(177, 60, 84, 19);
		tfr.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(Color.RED);
		labelb.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelb.setBounds(156, 73, 10, 62);
		tfr.add(labelb);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(177, 97, 84, 19);
		tfr.add(tfb);
		
		JLabel labelres = new JLabel("RESULT");
		labelres.setForeground(Color.RED);
		labelres.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelres.setBounds(112, 134, 55, 17);
		tfr.add(labelres);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(177, 135, 84, 19);
		tfr.add(tf3);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO ADD
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1+var2;
				
				String result=String.valueOf(res);
		        tf3.setText(result);
				
				}
		});
		add.setForeground(new Color(0, 0, 0));
		add.setFont(new Font("Tahoma", Font.BOLD, 14));
		add.setBounds(10, 200, 65, 25);
		tfr.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO SUB
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1-var2;
				
				String result=String.valueOf(res);
		        tf3.setText(result);
				
			}
		});
		sub.setForeground(Color.BLACK);
		sub.setFont(new Font("Tahoma", Font.BOLD, 14));
		sub.setBounds(85, 200, 65, 25);
		tfr.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO MUL
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				
				int res=var1*var2;
				
				String result=String.valueOf(res);
		        tf3.setText(result);
				
			}
		});
		mul.setForeground(Color.BLACK);
		mul.setFont(new Font("Tahoma", Font.BOLD, 14));
		mul.setBounds(165, 200, 65, 25);
		tfr.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO DIV
				String data1=tfa.getText();
				String data2=tfb.getText();
				
				float var1=Float.valueOf(data1);
				float var2=Float.valueOf(data2);
				
				float res=var1/var2;
				
				String result=String.valueOf(res);
		        tf3.setText(result);
				
			}
		});
		div.setForeground(Color.BLACK);
		div.setFont(new Font("Tahoma", Font.BOLD, 14));
		div.setBounds(240, 200, 65, 25);
		tfr.add(div);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LOGIC TO REM
				int var1=Integer.valueOf(tfa.getText());
				int var2=Integer.valueOf(tfb.getText());
				
				int res =var1%var2;
				String result=String.valueOf(res);
				tf3.setText(result);
			}
		});
		rem.setForeground(Color.BLACK);
		rem.setFont(new Font("Tahoma", Font.BOLD, 14));
		rem.setBounds(318, 200, 65, 25);
		tfr.add(rem);
	}
}
