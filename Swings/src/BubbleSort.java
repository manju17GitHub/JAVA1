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

public class BubbleSort extends JFrame {

	private JPanel contentPane;
	private JTextField tx2;
	private JTextField tx1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSort frame = new BubbleSort();
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
	public BubbleSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelsrt = new JLabel("SORTING");
		labelsrt.setForeground(new Color(64, 0, 0));
		labelsrt.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelsrt.setBounds(171, 10, 73, 19);
		contentPane.add(labelsrt);
		
		JLabel lbl2 = new JLabel("NUMBERS AFTER SORTING");
		lbl2.setForeground(new Color(0, 0, 0));
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl2.setBounds(10, 85, 194, 15);
		contentPane.add(lbl2);
		
		tx2 = new JTextField();
		tx2.setBounds(214, 84, 201, 19);
		contentPane.add(tx2);
		tx2.setColumns(10);
		
		JLabel lbl1 = new JLabel("ENTER NUMBERS FOR SORTING");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl1.setBounds(10, 60, 194, 15);
		contentPane.add(lbl1);
		
		tx1 = new JTextField();
		tx1.setColumns(10);
		tx1.setBounds(214, 57, 201, 19);
		contentPane.add(tx1);
		
		JButton sort = new JButton("BUBBLE SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//loGIC OF SORTING 
				String data1=tx2.getText();
				String arr[]= data1.split("");
				String help;
				String result="";
				for(int i=0;i<=arr.length-2;i++) {
					for(int j=0;j<=arr.length-2-1;j++) {
						if(Integer.valueOf(arr[i])>Integer.valueOf(arr[j+1])) {
							help=arr[i];
							arr[i]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++) {
					result =result+arr[i]+" ";
				}
				
				lbl2.setText(result);
			}
		});
		sort.setForeground(new Color(255, 0, 128));
		sort.setFont(new Font("Tahoma", Font.BOLD, 16));
		sort.setBounds(159, 173, 145, 29);
		contentPane.add(sort);
	}

}
