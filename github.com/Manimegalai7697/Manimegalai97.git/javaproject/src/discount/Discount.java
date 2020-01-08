package discount;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Discount {

	private JFrame frame;
	private JTextField pa;
	private JTextField dp;
	private JTextField np;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discount window = new Discount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Discount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Discount calculator");
		lblNewLabel.setBounds(133, 29, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel PA = new JLabel("Principal Amount");
		PA.setBounds(38, 76, 105, 14);
		frame.getContentPane().add(PA);
		
		JLabel DP = new JLabel("Discount Percentage");
		DP.setBounds(38, 129, 105, 17);
		frame.getContentPane().add(DP);
		
		pa = new JTextField();
		pa.setBounds(219, 73, 86, 20);
		frame.getContentPane().add(pa);
		pa.setColumns(10);
		
		dp = new JTextField();
		dp.setBounds(219, 126, 86, 20);
		frame.getContentPane().add(dp);
		dp.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int principal= Integer.parseInt(pa.getText());
				int discount=Integer.parseInt(dp.getText());
				int net;
				net =(principal*discount)/100;
				int total;
				total=principal-net;
				np.setText(String.valueOf(total));
				
				
				
				
			}
		});
		
		btnNewButton.setBounds(165, 175, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel NP = new JLabel("Net Price");
		NP.setBounds(38, 223, 115, 14);
		frame.getContentPane().add(NP);
		
		np = new JTextField();
		np.setBounds(219, 220, 86, 20);
		frame.getContentPane().add(np);
		np.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Rs");
		lblNewLabel_4.setBounds(340, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(340, 129, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs");
		lblNewLabel_6.setBounds(340, 223, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}

}
