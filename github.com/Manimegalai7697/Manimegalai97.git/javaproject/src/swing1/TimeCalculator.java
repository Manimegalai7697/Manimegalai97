package swing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TimeCalculator {

	private JFrame frame;
	private JTextField d;
	private JTextField s;
	private JTextField Time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeCalculator window = new TimeCalculator();
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
	public TimeCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 204, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Distance = new JLabel("Distance");
		Distance.setBounds(77, 41, 67, 14);
		frame.getContentPane().add(Distance);
		
		JLabel Speed = new JLabel("Speed");
		Speed.setBounds(77, 93, 46, 17);
		frame.getContentPane().add(Speed);
		
		d = new JTextField();
		d.setBounds(229, 38, 86, 20);
		frame.getContentPane().add(d);
		d.setColumns(10);
		
		s = new JTextField();
		s.setBounds(229, 91, 86, 20);
		frame.getContentPane().add(s);
		s.setColumns(10);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Distance= Integer.parseInt(d.getText());
                int Speed= Integer.parseInt(s.getText()); 
                int T= Distance/Speed; 
                Time.setText( String.valueOf(T)); 
			}
		});
		Calculate.setBounds(134, 125, 89, 30);
		frame.getContentPane().add(Calculate);
		
		Time = new JTextField();
		Time.setBounds(229, 180, 86, 20);
		frame.getContentPane().add(Time);
		Time.setColumns(10);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setText("");
		        s.setText("");
		        Time.setText("");
			}
		});
		clear.setBounds(55, 211, 89, 23);
		frame.getContentPane().add(clear);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setBounds(229, 211, 89, 23);
		frame.getContentPane().add(Exit);
		
		JLabel T = new JLabel("Time");
		T.setBounds(77, 183, 46, 14);
		frame.getContentPane().add(T);
		
		JLabel lblNewLabel = new JLabel("Time Calculator");
		lblNewLabel.setBackground(new Color(51, 204, 255));
		lblNewLabel.setBounds(147, 11, 120, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
