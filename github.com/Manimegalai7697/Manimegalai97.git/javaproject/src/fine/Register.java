package fine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;

public class Register {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 102, 102));
		frame.setBounds(100, 100, 558, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel First = new JLabel("FirstName");
		First.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
		First.setBackground(Color.GRAY);
		First.setBounds(38, 54, 67, 14);
		frame.getContentPane().add(First);
		
		JLabel Last = new JLabel("LastName");
		Last.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
		Last.setBounds(216, 54, 80, 14);
		frame.getContentPane().add(Last);
		
		JLabel Gen = new JLabel("Gender");
		Gen.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
		Gen.setBounds(38, 109, 62, 14);
		frame.getContentPane().add(Gen);
		
		JLabel dob = new JLabel("Date Of Birth");
		dob.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
		dob.setBounds(216, 109, 91, 14);
		frame.getContentPane().add(dob);
		
		JLabel mobile = new JLabel("MobileNo");
		mobile.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
		mobile.setBounds(38, 158, 62, 14);
		frame.getContentPane().add(mobile);
		
		JLabel email = new JLabel("EmailId");
		email.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
		email.setBounds(216, 158, 80, 14);
		frame.getContentPane().add(email);
		
		JLabel user = new JLabel("Registration Form");
		user.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		user.setBounds(185, 11, 152, 29);
		frame.getContentPane().add(user);
		
		txt1 = new JTextField();
		txt1.setBounds(115, 51, 86, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(317, 51, 86, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(317, 106, 86, 20);
		frame.getContentPane().add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(115, 155, 86, 20);
		frame.getContentPane().add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBounds(317, 155, 86, 20);
		frame.getContentPane().add(txt6);
		txt6.setColumns(10);
		
		JRadioButton m = new JRadioButton("M");
		m.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 12));
		buttonGroup.add(m);
		m.setBounds(112, 105, 40, 23);
		frame.getContentPane().add(m);
		

		JTextArea ta = new JTextArea();
		ta.setBounds(10, 255, 532, 76);
		frame.getContentPane().add(ta);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 13));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Firstname = txt1.getText();
				String Lastname = txt2.getText();
				String Gender;
				if(m.isSelected())
				{
					Gender ="Male";
				}
				else
				{
					Gender="Female";
				}
				String DateOfBirth=txt4.getText();
				String MobileNo=txt5.getText();
				String EmailId=txt6.getText();
				
				ta.setText("FIRSTNAME\t LASTNAME\t GENDER\t DATEOFBIRTH\t MOBILENO\t EMAILID\n"+Firstname+"\t"+Lastname+"\t"+Gender+"\t"+DateOfBirth+"\t"+MobileNo+"\t"+EmailId+"\n");
				
				
				
			}
		});
		submit.setBounds(170, 211, 137, 23);
		frame.getContentPane().add(submit);
		
		JRadioButton f = new JRadioButton("F");
		f.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		f.setBounds(154, 105, 40, 23);
		frame.getContentPane().add(f);
		
		
		
	}
}
