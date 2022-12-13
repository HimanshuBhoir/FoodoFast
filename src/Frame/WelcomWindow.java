package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connectivity.myMethod;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WelcomWindow extends JFrame {

	private JPanel contentPane;
	private JPanel LoginPan;
	private JPanel WelcomePan;
	private JLabel lblNewLabel_2;
	private JPanel panel;
	private JLabel lblNewLabel_4;
	private JLabel staffID;
	public static JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JTextPane txtpnCheckYourId;
	private JButton Exit;
	public static String sName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomWindow frame = new WelcomWindow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomWindow() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LoginPan = new JPanel();
		LoginPan.setBackground(new Color(47, 79, 79));
		LoginPan.setBounds(0, 0, 450, 300);
		LoginPan.setVisible(false);
		contentPane.add(LoginPan);
		LoginPan.setLayout(null);
		
		lblNewLabel_2 = new JLabel("BiryaniHouse");
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.ITALIC, 13));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon(WelcomWindow.class.getResource("/Frames/icon/shop (1).png")));
		lblNewLabel_2.setBounds(10, 0, 155, 61);
		LoginPan.add(lblNewLabel_2);
		
		panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(239, 35, 178, 226);
		LoginPan.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(WelcomWindow.class.getResource("/Frames/icon/user (2).png")));
		lblNewLabel_4.setBounds(56, 28, 69, 64);
		panel.add(lblNewLabel_4);
		
		staffID = new JLabel("Staff ID");
		staffID.setForeground(new Color(0, 0, 0));
		staffID.setBounds(20, 114, 46, 14);
		panel.add(staffID);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 133, 136, 20);
		panel.add(passwordField);
				
		
		JButton EnterToHome = new JButton("Enter");
		EnterToHome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Entered");
			}
		});
		EnterToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connectivity.getName data = new Connectivity.getName(Integer.parseInt(passwordField.getText()));
                Boolean status = Connectivity.myMethod.StaffLogin(data);
                if(status) {
                	HomePage home = new HomePage();
    				home.setLocationRelativeTo(null);
    				home.setVisible(true);
    				dispose();
    				System.out.println("Staff Connection Succesfull Entered...");
                }
                else { 
                	System.out.println("Something went wrong");
                }
				
			}
		});
		EnterToHome.setBounds(45, 170, 89, 23);
		EnterToHome.setFocusable(false);
		EnterToHome.setBorderPainted(true);
		panel.add(EnterToHome);
		
		lblNewLabel_3 = new JLabel("Staff Login");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 0, 178, 28);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(WelcomWindow.class.getResource("/Frames/icon/card.png")));
		lblNewLabel_5.setBounds(10, 110, 219, 70);
		LoginPan.add(lblNewLabel_5);
		
		txtpnCheckYourId = new JTextPane();
		txtpnCheckYourId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCheckYourId.setForeground(new Color(255, 255, 255));
		txtpnCheckYourId.setText("Check Your ID and enter vaid number");
		txtpnCheckYourId.setBackground(new Color(47, 79, 79));
		txtpnCheckYourId.setBounds(10, 191, 219, 20);
		LoginPan.add(txtpnCheckYourId);
		
		WelcomePan = new JPanel();
		WelcomePan.setBackground(new Color(47, 79, 79));
		WelcomePan.setBounds(0, 0, 450, 300);
		contentPane.add(WelcomePan);
		WelcomePan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BiryaniHouse");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.ITALIC, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(WelcomWindow.class.getResource("/Frames/icon/shop (1).png")));
		lblNewLabel.setBounds(10, 0, 131, 62);
		WelcomePan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(0, 104, 450, 62);
		WelcomePan.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePan.setVisible(false);
				LoginPan.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(WelcomWindow.class.getResource("/Frames/icon/power (2).png")));
		btnNewButton.setBounds(181, 177, 89, 23);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		WelcomePan.add(btnNewButton);
		
		Exit = new JButton("New button");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Exit.setIcon(new ImageIcon(WelcomWindow.class.getResource("/Frames/icon/log-out.png")));
		Exit.setBounds(412, 252, 38, 37);
		Exit.setFocusable(false);
		Exit.setBorderPainted(false);
		Exit.setContentAreaFilled(false);
		
		WelcomePan.add(Exit);
	}
}
