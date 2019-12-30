package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DistanceCalculator {

	private JFrame frame;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JButton Exit;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceCalculator window = new DistanceCalculator();
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
	public DistanceCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 102));
		frame.setBounds(100, 100, 450, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel A = new JLabel("A");
		A.setBounds(112, 51, 46, 14);
		frame.getContentPane().add(A);
		
		JLabel B = new JLabel("B");
		B.setBounds(112, 105, 46, 14);
		frame.getContentPane().add(B);
		
		a = new JTextField();
		a.setBounds(209, 48, 86, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(209, 102, 86, 20);
		frame.getContentPane().add(b);
		b.setColumns(10);
		
		JButton Add = new JButton("Add");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int A = Integer.parseInt(a.getText());
                int B = Integer.parseInt(b.getText()); 
                int C = A + B; 
                c.setText( String.valueOf(C)); 
                                  
			}
		});
		Add.setBounds(164, 169, 89, 23);
		frame.getContentPane().add(Add);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setText("");
		        b.setText("");
		        c.setText("");
			}
		});
		Clear.setBounds(75, 264, 89, 23);
		frame.getContentPane().add(Clear);
		
		c = new JTextField();
		c.setBounds(164, 219, 86, 20);
		frame.getContentPane().add(c);
		c.setColumns(10);
		
		Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		Exit.setBounds(206, 264, 89, 23);
		frame.getContentPane().add(Exit);
		
		lblNewLabel = new JLabel("Addition Of Two Numbers");
		lblNewLabel.setBounds(131, 11, 183, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
