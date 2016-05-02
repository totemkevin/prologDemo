import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String str="";
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClock = new JLabel("Clock : ");
		lblClock.setBounds(10, 10, 46, 15);
		contentPane.add(lblClock);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("07:00");
		textField.setBounds(66, 7, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNow = new JButton("Now");
		btnNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(JPLUtl.time());
			}
		});
		btnNow.setBounds(172, 6, 87, 23);
		contentPane.add(btnNow);
		
		JLabel lblSay = new JLabel("Say : ");
		lblSay.setBounds(10, 41, 46, 15);
		contentPane.add(lblSay);
		
		JButton btnSay = new JButton("Hello,Robot!");
		
		btnSay.setBounds(66, 37, 193, 23);
		contentPane.add(btnSay);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 69, 249, 235);
		contentPane.add(textArea);
		
		str+=JPLUtl.link()+"\n";
		textArea.setText(str);
		btnSay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] parse=textField.getText().split(":");
				int testH=Integer.valueOf(parse[0]);
				int testM=Integer.valueOf(parse[1]);
				
				try{
					if( testH<0 | testH>=24 | testM<0 | testM>=60 )
					{
						textField.setText("請輸入正確時間");
					}
					else
					{
						str +=JPLUtl.run(testH);
						textArea.setText(str);
					}
				}
				catch(Exception e)
				{
					textField.setText("請輸入正確時間");
				}
				
			}
		});
	}
}
