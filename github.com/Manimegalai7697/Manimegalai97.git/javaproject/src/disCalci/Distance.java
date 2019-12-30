package disCalci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Distance {

	private JFrame frame;
	private JTextField dc;
	private JTextField pc;
	private JTextField mp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distance window = new Distance();
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
	public Distance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 204, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel MC = new JLabel("Mileage Calculator");
		MC.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));
		MC.setBounds(113, 25, 213, 23);
		frame.getContentPane().add(MC);
		
		JLabel DC = new JLabel("Distance Covered in Km");
		DC.setFont(new Font("Segoe UI Light", Font.BOLD, 12));
		DC.setBounds(10, 88, 146, 14);
		frame.getContentPane().add(DC);
		
		JLabel PC = new JLabel("Petrol Consumed in Litre");
		PC.setFont(new Font("Segoe UI Light", Font.BOLD, 12));
		PC.setBounds(10, 146, 157, 14);
		frame.getContentPane().add(PC);
		
		JButton CM = new JButton("Calculate Mileage");
		CM.setFont(new Font("Sitka Text", Font.BOLD, 12));
		CM.setBackground(new Color(204, 204, 255));
		CM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int DC = Integer.parseInt(dc.getText());
                int PC = Integer.parseInt(pc.getText()); 
                int CM = DC / PC; 
                mp.setText( String.valueOf(CM));
			}
		});
		CM.setBounds(152, 188, 174, 23);
		frame.getContentPane().add(CM);
		
		JLabel MP = new JLabel("Mileage Per Litre");
		MP.setFont(new Font("Segoe UI Light", Font.BOLD, 12));
		MP.setBounds(10, 236, 157, 25);
		frame.getContentPane().add(MP);
		
		dc = new JTextField();
		dc.setBounds(191, 86, 86, 20);
		frame.getContentPane().add(dc);
		dc.setColumns(10);
		
		pc = new JTextField();
		pc.setBounds(191, 143, 86, 20);
		frame.getContentPane().add(pc);
		pc.setColumns(10);
		
		mp = new JTextField();
		mp.setBounds(191, 233, 86, 20);
		frame.getContentPane().add(mp);
		mp.setColumns(10);
	}

}
