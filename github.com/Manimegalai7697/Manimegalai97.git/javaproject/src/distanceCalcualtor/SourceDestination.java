package distanceCalcualtor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SourceDestination {

	private JFrame frame;
	private JTextField sl;
	private JTextField dl;
	private JTextField dc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SourceDestination window = new SourceDestination();
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
	public SourceDestination() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel DC = new JLabel("Distance Calculator");
		DC.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		DC.setBounds(123, 26, 174, 35);
		frame.getContentPane().add(DC);
		
		JLabel SL = new JLabel("Source Location");
		SL.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 14));
		SL.setBounds(19, 72, 134, 29);
		frame.getContentPane().add(SL);
		
		JLabel DL = new JLabel("Destination Location");
		DL.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 14));
		DL.setBounds(10, 130, 143, 29);
		frame.getContentPane().add(DL);
		
		JButton CD = new JButton("Calculate Distance");
		CD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String SL= sl.getText();
				String DL = dl.getText();
				double distance =2.3;
				int stop=57;
				double mileage;
				mileage = distance*stop;
				dc.setText(String.valueOf(mileage+"km"));
				
				
				
			}
		});
		CD.setFont(new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 12));
		CD.setBounds(144, 175, 174, 23);
		frame.getContentPane().add(CD);
		
		JLabel DCo = new JLabel("Distance Covered");
		DCo.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 14));
		DCo.setBounds(10, 222, 143, 14);
		frame.getContentPane().add(DCo);
		
		sl = new JTextField();
		sl.setBounds(177, 76, 86, 20);
		frame.getContentPane().add(sl);
		sl.setColumns(10);
		
		dl = new JTextField();
		dl.setBounds(177, 134, 86, 20);
		frame.getContentPane().add(dl);
		dl.setColumns(10);
		
		dc = new JTextField();
		dc.setBounds(177, 219, 86, 20);
		frame.getContentPane().add(dc);
		dc.setColumns(10);
	}

}
