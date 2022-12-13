package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import com.email.durgesh.Email;

import Connectivity.CP;
import Connectivity.myMethod;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JPanel main;
	private JPanel Menue;
	private JPanel Pending;
	private JPanel shift;
	private JPanel Delivered;
	private JButton delivery;
	private JButton menue;
	public static JTable Pendingtable;
	private JScrollPane scrollPane_2;
	private JButton btnRecords;
	private JButton btnAvailibilities;
	private JLabel lblNewLabel_2;
	private String sName;
	private JPanel in;
	private JPanel out;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextPane txtpnDataRelatedTo;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton order;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel total;
	private int item = 0;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_13;
	private JLabel lblPrawnsBiryani;
	private JLabel lblPlaneBiryani;
	private JLabel lblBiryani;
	private JLabel lblFullCourse;
	private JLabel lblDumbiryaniChiken;
	private JLabel lblPrawnDumBiryani;
	private JLabel lblVegBiryani;
	private JLabel lblMuttonBiryani;
	private JLabel lblMuttonDumBiryani;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_14;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblCode;
	private JTextField textField_2;
	private JPanel Add;
	public static JTable table;
	private JTable table_1;
	private JTextField textField_3;
	private JPanel panel_1;
	private JTable table_2;
	private JScrollPane scrollPane_3;
	public static JTable table_3;
	private JScrollPane scrollPane_1;
	private int count;
	private int sum;
	private int ans;
	private ButtonGroup group;
	private JButton btnNewButton_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		main = new JPanel();
		main.setBackground(new Color(47, 79, 79));
		main.setBounds(0, 0, 1038, 524);
		contentPane.add(main);
		main.setLayout(null);
		
		group = new ButtonGroup();
		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(27, 423, 467, -385);
//		Add.add(scrollPane);
//		
//		table = new JTable();
//		scrollPane.setViewportView(table);
		
		Menue = new JPanel();
		Menue.setForeground(new Color(46, 139, 87));
		Menue.setBackground(new Color(192, 192, 192));
		Menue.setBounds(109, 40, 929, 484);
		main.add(Menue);
		Menue.setLayout(null);
										
										
										
										out = new JPanel();
										out.setBackground(new Color(192, 192, 192));
										out.setBounds(10, 11, 909, 462);
										Menue.add(out);
										out.setLayout(null);
										
										lblMuttonDumBiryani = new JLabel("Mutton Dum Biryani");
										lblMuttonDumBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblMuttonDumBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblMuttonDumBiryani.setForeground(Color.WHITE);
										lblMuttonDumBiryani.setBounds(233, 322, 171, 34);
										out.add(lblMuttonDumBiryani);
										
										lblMuttonBiryani = new JLabel("Mutton Biryani");
										lblMuttonBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblMuttonBiryani.setForeground(Color.WHITE);
										lblMuttonBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblMuttonBiryani.setBounds(10, 323, 171, 34);
										out.add(lblMuttonBiryani);
										
										lblVegBiryani = new JLabel("Veg Biryani");
										lblVegBiryani.setForeground(Color.WHITE);
										lblVegBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblVegBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblVegBiryani.setBounds(665, 174, 171, 34);
										out.add(lblVegBiryani);
										
										lblPrawnDumBiryani = new JLabel("Prawn Dum Biryani");
										lblPrawnDumBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblPrawnDumBiryani.setForeground(Color.WHITE);
										lblPrawnDumBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblPrawnDumBiryani.setBounds(665, 11, 171, 34);
										out.add(lblPrawnDumBiryani);
										
										lblDumbiryaniChiken = new JLabel("Dum Biryani Chiken");
										lblDumbiryaniChiken.setForeground(Color.WHITE);
										lblDumbiryaniChiken.setFont(new Font("Arial", Font.BOLD, 13));
										lblDumbiryaniChiken.setHorizontalAlignment(SwingConstants.CENTER);
										lblDumbiryaniChiken.setBounds(444, 174, 171, 34);
										out.add(lblDumbiryaniChiken);
										
										lblFullCourse = new JLabel("Full Course");
										lblFullCourse.setHorizontalAlignment(SwingConstants.CENTER);
										lblFullCourse.setFont(new Font("Arial", Font.BOLD, 13));
										lblFullCourse.setForeground(Color.WHITE);
										lblFullCourse.setBounds(233, 174, 171, 34);
										out.add(lblFullCourse);
										
										lblBiryani = new JLabel("Biryani");
										lblBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblBiryani.setForeground(Color.WHITE);
										lblBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblBiryani.setBounds(10, 174, 171, 34);
										out.add(lblBiryani);
										
										lblPlaneBiryani = new JLabel("Plane Biryani");
										lblPlaneBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblPlaneBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblPlaneBiryani.setForeground(Color.WHITE);
										lblPlaneBiryani.setBounds(444, 11, 171, 34);
										out.add(lblPlaneBiryani);
										
										lblPrawnsBiryani = new JLabel("Prawns Biryani");
										lblPrawnsBiryani.setForeground(Color.WHITE);
										lblPrawnsBiryani.setFont(new Font("Arial", Font.BOLD, 13));
										lblPrawnsBiryani.setHorizontalAlignment(SwingConstants.CENTER);
										lblPrawnsBiryani.setBounds(233, 11, 171, 34);
										out.add(lblPrawnsBiryani);
										
										lblNewLabel_13 = new JLabel("Chiken Biryani");
										lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
										lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 13));
										lblNewLabel_13.setForeground(Color.WHITE);
										lblNewLabel_13.setBounds(10, 11, 171, 34);
										out.add(lblNewLabel_13);
										
										button_2 = new JButton("Food3");
										button_2.setBackground(Color.DARK_GRAY);
										button_2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Plane Biryani");
												lblNewLabel_14.setText("₹ 100");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-sohani-kamat-7837978 (2).jpg")));
												item = 3;
											}
										});
										button_2.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-sohani-kamat-7837978 (2).jpg")));
										button_2.setBounds(444, 11, 171, 131);
										out.add(button_2);
										
										button_3 = new JButton("Food4");
										button_3.setBackground(Color.DARK_GRAY);
										button_3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Prawn Dum Biryani");
												lblNewLabel_14.setText("₹ 300");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alleksana-4224304.jpg")));
												item = 4;
												
											}
										});
										button_3.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alleksana-4224304.jpg")));
										button_3.setBounds(665, 11, 171, 131);
										out.add(button_3);
										
										button_4 = new JButton("Food8");
										button_4.setBackground(Color.DARK_GRAY);
										button_4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Veg Biryani");
												lblNewLabel_14.setText("₹ 100");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alberta-studios-9743517.jpg")));
												item = 5;
												
											}
										});
										button_4.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alberta-studios-9743517.jpg")));
										button_4.setBounds(665, 174, 171, 131);
										out.add(button_4);
										
										button_5 = new JButton("Food7");
										button_5.setBackground(Color.DARK_GRAY);
										button_5.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Chiken Dum Biryani");
												lblNewLabel_14.setText("₹ 300");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-rajesh-tp-1624487 (3).jpg")));
												item = 6;
												
											}
										});
										button_5.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-rajesh-tp-1624487 (3).jpg")));
										button_5.setBounds(444, 174, 171, 131);
										out.add(button_5);
										
										button_6 = new JButton("Food6");
										button_6.setBackground(Color.DARK_GRAY);
										button_6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Full Course (2 Person)");
												lblNewLabel_14.setText("₹ 500");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-murtada-mustafa-7426864.jpg")));
												item = 7;
											}
										});
										button_6.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-murtada-mustafa-7426864.jpg")));
										button_6.setBounds(233, 174, 171, 131);
										out.add(button_6);
										
										button_7 = new JButton("Food5");
										button_7.setBackground(Color.DARK_GRAY);
										button_7.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Biryani");
												lblNewLabel_14.setText("₹ 150");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alberta-studios-9743517.jpg")));
												item = 8;
											}
											
										});
										button_7.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alberta-studios-9743517.jpg")));
										button_7.setBounds(10, 174, 171, 131);
										out.add(button_7);
										
										button_8 = new JButton("Food9");
										button_8.setBackground(Color.DARK_GRAY);
										button_8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Mutton Biryani");
												lblNewLabel_14.setText("₹ 300");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alleksana-4224304.jpg")));
												item = 9;
											}
										});
										button_8.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alleksana-4224304.jpg")));
										button_8.setBounds(10, 322, 171, 131);
										out.add(button_8);
										
										button_9 = new JButton("Food10");
										button_9.setBackground(Color.DARK_GRAY);
										button_9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
												in.setVisible(true);
												out.setVisible(false);
												lblNewLabel_12.setText("Mutton Dum Biryani");
												lblNewLabel_14.setText("₹ 350");
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-sohani-kamat-7837978 (2).jpg")));
												item = 10;
												
											}
										});
										button_9.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-sohani-kamat-7837978 (2).jpg")));
										button_9.setBounds(233, 322, 171, 131);
										out.add(button_9);
										
										button = new JButton("Chiken Biryani");
										button.setBackground(Color.DARK_GRAY);
										button.setForeground(Color.WHITE);
										button.setFont(new Font("Arial", Font.BOLD, 13));
										button.setToolTipText("");
										button.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-rajesh-tp-1624487 (4).jpg")));
										button.addActionListener(new ActionListener() {
											

											public void actionPerformed(ActionEvent e) {
												
												lblNewLabel_12.setText("Chiken Biryani");
												lblNewLabel_14.setText("₹ 200");
												item = 1;
												
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-rajesh-tp-1624487 (4).jpg")));
												
												item = 1;
												
											}
										});
										button.setBounds(10, 11, 171, 131);
										out.add(button);
										
										button_1 = new JButton("Food2");
										button_1.setBackground(Color.DARK_GRAY);
										button_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alleksana-4224304.jpg")));
										button_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblNewLabel_12.setText("Prawn Biryani");
												lblNewLabel_14.setText("₹ 200");
												in.setVisible(true);
												out.setVisible(false);
												
												lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/pexels-alleksana-4224304.jpg")));
												item = 2;
												
											}
										});
										button_1.setFocusable(false);
										button_1.setBounds(233, 11, 171, 131);
										out.add(button_1);
										
										in = new JPanel();
										in.setBackground(new Color(192, 192, 192));
										in.setVisible(false);
										in.setBounds(10, 11, 909, 462);
										Menue.add(in);
										in.setLayout(null);
										
										lblNewLabel_1 = new JLabel("");
										//		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/user (2).png")));
												lblNewLabel_1.setBounds(234, 31, 169, 145);
												in.add(lblNewLabel_1);
												
												txtpnDataRelatedTo = new JTextPane();
												txtpnDataRelatedTo.setEditable(false);
												txtpnDataRelatedTo.setForeground(Color.BLACK);
												txtpnDataRelatedTo.setBackground(new Color(192, 192, 192));
												txtpnDataRelatedTo.setFont(new Font("Arial", Font.BOLD, 13));
												txtpnDataRelatedTo.setText("* Working on Quantity Management.\r\n* Main focus is for ease to use for staff\r\n* This is data about food . All data must be enterred indivisulay. \r\n* The system is not created yet.\r\n* Hope in next sem.\r\n* There can be some bugs, please ignor them we are working on them.\r\n* We will correct that as soon we get it.\r\n*ThankYou!");
												txtpnDataRelatedTo.setBounds(234, 176, 437, 204);
												in.add(txtpnDataRelatedTo);
												
												btnNewButton_1 = new JButton("Add");
												btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
												btnNewButton_1.setForeground(Color.WHITE);
												btnNewButton_1.setBackground(Color.DARK_GRAY);
												btnNewButton_1.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														btnNewButton_3.setEnabled(true);
														btnNewButton_1.setEnabled(false);
														if(item == 1) {
															Connectivity.myMethod.additem1();
														}else if((item == 2)) {
															Connectivity.myMethod.additem2();
														}else if((item == 3)) {
															Connectivity.myMethod.additem3();
														}else if((item == 4)) {
															Connectivity.myMethod.additem4();
														}else if((item == 5)) {
															Connectivity.myMethod.additem8();
														}else if((item == 6)) {
															Connectivity.myMethod.additem7();
														}else if((item == 7)) {
															Connectivity.myMethod.additem6();
														}else if((item == 8)) {
															Connectivity.myMethod.additem5();
														}else if((item == 9)) {
															Connectivity.myMethod.additem9();
														}else if((item == 10)) {
															Connectivity.myMethod.additem10();
														}
													}
												});
												btnNewButton_1.setBounds(612, 391, 89, 23);
												in.add(btnNewButton_1);
												
												btnNewButton = new JButton("");
												btnNewButton.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														out.setVisible(true);
														in.setVisible(false);
														btnNewButton_1.setEnabled(true);
														btnNewButton_3.setEnabled(false);
													}
												});
												btnNewButton.setFocusable(false);
												btnNewButton.setContentAreaFilled(false);
												btnNewButton.setBorderPainted(false);
												btnNewButton.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/icons8-back-arrow-24.png")));
												btnNewButton.setBounds(0, 0, 39, 33);
												in.add(btnNewButton);
												
												btnNewButton_3 = new JButton("Remove");
												btnNewButton_3.setForeground(Color.WHITE);
												btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 12));
												btnNewButton_3.setEnabled(false);
												btnNewButton_3.setBackground(Color.DARK_GRAY);
												btnNewButton_3.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														btnNewButton_1.setEnabled(true);
														btnNewButton_3.setEnabled(false);
														
														if(item == 1) {
															Connectivity.myMethod.remitem1();
														}else if((item == 2)) {
															Connectivity.myMethod.remitem2();
														}else if((item == 3)) {
															Connectivity.myMethod.remitem3();
														}else if((item == 4)) {
															Connectivity.myMethod.remitem4();
														}else if((item == 5)) {
															Connectivity.myMethod.remitem8();
														}else if((item == 6)) {
															Connectivity.myMethod.remitem7();
														}else if((item == 7)) {
															Connectivity.myMethod.remitem6();
														}else if((item == 8)) {
															Connectivity.myMethod.remitem5();
														}else if((item == 9)) {
															Connectivity.myMethod.remitem9();
														}else if((item == 10)) {
															Connectivity.myMethod.remitem10();
														}
													}
												});
												btnNewButton_3.setFocusable(false);
												btnNewButton_3.setBounds(513, 391, 89, 23);
												in.add(btnNewButton_3);
												
												lblNewLabel_12 = new JLabel("");
												lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 23));
												lblNewLabel_12.setBounds(458, 31, 269, 47);
												in.add(lblNewLabel_12);
												
												lblNewLabel_14 = new JLabel("");
												lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 15));
												lblNewLabel_14.setBounds(458, 96, 129, 33);
												in.add(lblNewLabel_14);
		
//		ButtonGroup group = new ButtonGroup();
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		
		

		
		
		shift = new JPanel();
		shift.setBackground(new Color(47, 79, 79));
		shift.setBounds(0, 0, 110, 524);
		main.add(shift);
		shift.setLayout(null);
		
		menue = new JButton("Food");
		menue.setHorizontalAlignment(SwingConstants.LEFT);
		menue.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menue.setForeground(Color.WHITE);
		menue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				menue.setForeground(Color.black);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				menue.setForeground(Color.WHITE);
			}
		});
		menue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				panel_1.setVisible(false);
				Menue.setVisible(true);
				out.setVisible(true);
				Pending.setVisible(false);
				Add.setVisible(false);
			}
		});
		menue.setBounds(0, 115, 100, 23);
		menue.setFocusable(false);
		menue.setBorderPainted(false);
		menue.setContentAreaFilled(false);
		shift.add(menue);
		
		JButton pending = new JButton("Cart");
		pending.setHorizontalAlignment(SwingConstants.LEFT);
		pending.setForeground(Color.WHITE);
		pending.setBounds(0, 149, 100, 23);
		pending.setFont(new Font("Times New Roman", Font.BOLD, 13));
		pending.setFocusable(false);
		pending.setBorderPainted(false);
		pending.setContentAreaFilled(false);
		pending.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pending.setForeground(Color.black);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pending.setForeground(Color.WHITE);
			}
		});
		pending.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

//				on button press the data will be refresh
				Connectivity.myMethod.pendingdata();
				
				panel_1.setVisible(false);
				Menue.setVisible(false);
				out.setVisible(false);
				in.setVisible(false);
				Pending.setVisible(true);
				Delivered.setVisible(false);
				Add.setVisible(false);
			}
		});
		shift.add(pending);
		
		delivery = new JButton("Delivereies");
		delivery.setHorizontalAlignment(SwingConstants.LEFT);
		delivery.setForeground(Color.WHITE);
		delivery.setBounds(0, 183, 100, 23);
		delivery.setFont(new Font("Times New Roman", Font.BOLD, 13));
		delivery.setFocusable(false);
		delivery.setBorderPainted(false);
		delivery.setContentAreaFilled(false);
		delivery.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				delivery.setForeground(Color.black);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				delivery.setForeground(Color.WHITE);
			}
		});
		delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				myMethod.deliverydata();
				
				
				panel_1.setVisible(false);
				Add.setVisible(false);
				Menue.setVisible(false);
				Pending.setVisible(false);
				Delivered.setVisible(true);
			}
		});
		shift.add(delivery);
		
		JLabel lblNewLabel = new JLabel("BiryaniHouse");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.ITALIC, 13));
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/shop (1).png")));
		lblNewLabel.setBounds(0, 0, 132, 52);
		shift.add(lblNewLabel);
		
		btnRecords = new JButton("Records");
		btnRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection con = CP.ceateC();
					
					String q = "select * from rec";
					
					PreparedStatement pstmt = con.prepareStatement(q);
					ResultSet rs = pstmt.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				panel_1.setVisible(true);
				
				Add.setVisible(false);
				Menue.setVisible(false);
				Pending.setVisible(false);
				Delivered.setVisible(false);
				
			}
		});
		btnRecords.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnRecords.setForeground(Color.black);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnRecords.setForeground(Color.WHITE);
			}
		});
		btnRecords.setHorizontalAlignment(SwingConstants.LEFT);
		btnRecords.setForeground(Color.WHITE);
		btnRecords.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnRecords.setFocusable(false);
		btnRecords.setContentAreaFilled(false);
		btnRecords.setBorderPainted(false);
		btnRecords.setBounds(0, 217, 100, 23);
		shift.add(btnRecords);
		
		btnAvailibilities = new JButton("EditMenue");
		btnAvailibilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					Connection con = CP.ceateC();
					
					String q = "select * from menue";
					
					PreparedStatement pstmt = con.prepareStatement(q);
					ResultSet rs = pstmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
////				Taking menue data from database
//				Connectivity.myMethod.availabledata();
				
				panel_1.setVisible(false);
				Delivered.setVisible(false);
				Add.setVisible(true);
				Menue.setVisible(false);
				Pending.setVisible(false);
			}
		});
		btnAvailibilities.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnAvailibilities.setForeground(Color.black);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnAvailibilities.setForeground(Color.WHITE);
			}
		});
		btnAvailibilities.setHorizontalAlignment(SwingConstants.LEFT);
		btnAvailibilities.setForeground(Color.WHITE);
		btnAvailibilities.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAvailibilities.setFocusable(false);
		btnAvailibilities.setContentAreaFilled(false);
		btnAvailibilities.setBorderPainted(false);
		btnAvailibilities.setBounds(0, 81, 100, 23);
		shift.add(btnAvailibilities);
		
		JButton logout = new JButton("");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomWindow window = new WelcomWindow();
				window.setVisible(true);
				window.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		Pending = new JPanel();
		Pending.setBackground(new Color(192, 192, 192));
		Pending.setBounds(109, 40, 929, 484);
		main.add(Pending);
		Pending.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(24, 23, 503, 333);
		Pending.add(scrollPane_2);
		
		Pendingtable = new JTable();
		scrollPane_2.setViewportView(Pendingtable);
		
		lblNewLabel_3 = new JLabel("Customer Code");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(594, 64, 112, 23);
		Pending.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Payment Methods");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_4.setBounds(558, 140, 252, 44);
		Pending.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/icons8-google-pay-india-48.png")));
		lblNewLabel_5.setBounds(594, 215, 109, 53);
		Pending.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/icons8-paytm-48.png")));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(726, 224, 109, 44);
		Pending.add(lblNewLabel_6);
		
		order = new JButton("Order");
		order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				myMethod.adddeli1();
				myMethod.adddeli2();
				myMethod.adddeli3();
				myMethod.adddeli4();
				myMethod.adddeli5();
				myMethod.adddeli6();
				myMethod.adddeli7();
				myMethod.adddeli8();
				myMethod.adddeli9();
				myMethod.adddeli10();
				
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				try {
					
					Email email = new Email("testinghiman@gmail.com", "himanshubhoir");
					email.setFrom("testinghiman@gmail.com", "Email Check");
					email.setSubject("This is testing email");
					email.setContent("<h1> You Have Succesfully Paid "+ ans +" for Order."
							+ "Wait Till the Order gets ready! </h1>", "text/html");
					email.addRecipient("bhaiharsh795@gmail.com");
					email.send();
					
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				
			}
		});
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = getSelectedButtonText(group);
				System.out.print(a);
				
				if(a == "G-Pay") {
				}
				else if(a == "Paytm") {
				
				}
				else if(a == "COD (Cash On Delivery)") {
//					menue.setVisible(true);
//					out.setVisible(true);
//					Pending.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Fill the data!");
				}
				
				
			}
		});
		order.setFocusable(false);
		order.setBounds(809, 419, 81, 23);
		
		Pending.add(order);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(402, 367, 125, 23);
		Pending.add(lblNewLabel_7);
		
		btnNewButton_2 = new JButton("Get Total");
		btnNewButton_2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				sum = sumRow(Pendingtable, 2);
				lblNewLabel_7.setText(sum+".00");
				count = Pendingtable.getRowCount()*2;
				lblNewLabel_10.setText(count+".00");
				ans = sum + count;
				total.setText(ans+".00");
			}
		});
		btnNewButton_2.setBounds(231, 367, 89, 23);
		btnNewButton_2.setFocusable(false);
		Pending.add(btnNewButton_2);
		
		lblNewLabel_8 = new JLabel("Price");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(330, 367, 62, 23);
		Pending.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("GST");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(330, 401, 72, 20);
		Pending.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBounds(412, 401, 117, 20);
		Pending.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Total");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(340, 428, 62, 23);
		Pending.add(lblNewLabel_11);
		
		total = new JLabel("");
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		total.setFont(new Font("Arial", Font.BOLD, 12));
		total.setForeground(new Color(255, 255, 255));
		total.setBounds(438, 423, 89, 28);
		Pending.add(total);
		
		JRadioButton gpay = new JRadioButton("G-Pay");
		gpay.setHorizontalAlignment(SwingConstants.CENTER);
		gpay.setBackground(new Color(192, 192, 192));
		gpay.setBounds(594, 265, 109, 23);
		gpay.setBorderPainted(false);
		gpay.setFocusable(false);
		Pending.add(gpay);
		group.add(gpay);
		
		JRadioButton cod = new JRadioButton("COD (Cash On Delivery)");
		cod.setBackground(new Color(192, 192, 192));
		cod.setBounds(624, 304, 155, 23);
		Pending.add(cod);
		group.add(cod);
		
		JRadioButton paytm = new JRadioButton("Paytm");
		paytm.setHorizontalAlignment(SwingConstants.CENTER);
		paytm.setBackground(new Color(192, 192, 192));
		paytm.setBounds(726, 265, 109, 23);
		Pending.add(paytm);
		group.add(paytm);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(594, 89, 155, 20);
		Pending.add(passwordField);
		
		
		Delivered = new JPanel();
		Delivered.setBackground(new Color(192, 192, 192));
		Delivered.setBounds(109, 40, 929, 484);
		main.add(Delivered);
		Delivered.setLayout(null);
		
		
		JButton btnNewButton_5 = new JButton("Delivered");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Email email = new Email("testinghiman@gmail.com", "himanshubhoir");
					email.setFrom("testinghiman@gmail.com", "Email Check");
					email.setSubject("Your order is delivered");
					email.setContent("<h1> Your Order is Delivered"
							+ "Thanks for ordering from our shop! </h1>", "text/html");
					email.addRecipient("bhaiharsh795@gmail.com");
					email.send();
					
				} catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myMethod.remdeli1();
				myMethod.remdeli2();
				myMethod.remdeli3();
				myMethod.remdeli4();
				myMethod.remdeli5();
				myMethod.remdeli6();
				myMethod.remdeli7();
				myMethod.remdeli8();
				myMethod.remdeli9();
				myMethod.remdeli10();
				
				
				
				myMethod.remitem1();
				myMethod.remitem2();
				myMethod.remitem3();
				myMethod.remitem4();
				myMethod.remitem5();
				myMethod.remitem6();
				myMethod.remitem7();
				myMethod.remitem8();
				myMethod.remitem9();
				myMethod.remitem10();
			}
			
		});
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(43, 47, 495, 389);
		Delivered.add(scrollPane_1);
		
		table_3 = new JTable();
		scrollPane_1.setViewportView(table_3);
		
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBounds(752, 304, 125, 23);
		Delivered.add(btnNewButton_5);
		
		JLabel lblNewLabel_17 = new JLabel("Customer Code");
		lblNewLabel_17.setForeground(new Color(0, 0, 0));
		lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_17.setBounds(624, 158, 136, 23);
		Delivered.add(lblNewLabel_17);
		
		textField_3 = new JPasswordField();
		textField_3.setBounds(624, 199, 204, 20);
		Delivered.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_7 = new JButton("Get");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Connection con = CP.ceateC();
					
					String q = "insert into rec(Food,code) select FooName, code from deli";
					
					PreparedStatement pstmt = con.prepareStatement(q);
//					pstmt.setString(1, add.getOrderCode());
					
					pstmt.executeUpdate();
					System.out.println("Added to records...");
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_7.setBounds(842, 198, 77, 23);
		Delivered.add(btnNewButton_7);
		logout.setIcon(new ImageIcon(HomePage.class.getResource("/Frames/icon/logout (6).png")));
		logout.setBounds(995, 0, 43, 39);
		logout.setFocusable(false);
		logout.setBorderPainted(false);
		logout.setContentAreaFilled(false);
		main.add(logout);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		try {
			int n = Integer.parseInt(WelcomWindow.passwordField.getText());
			
			if(n == 9) {
				sName = "Himanshu";
			}else if(n == 11) {
				sName = "Yatisha";
			}else if(n == 37) {
				sName = "Suyash";
			}else if(n == 70) {
				sName = "Pratham";
			}
	        System.out.println(sName + " Entered");
	        
		} catch (Exception e) {
			// TODO: handle exception
		}
		
        
		lblNewLabel_2.setText(sName);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(893, 0, 101, 39);
		main.add(lblNewLabel_2);
		
		Add = new JPanel();
		Add.setBackground(new Color(192, 192, 192));
		Add.setBounds(109, 40, 929, 484);
		main.add(Add);
		Add.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Add Food");
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_15.setBounds(550, 69, 83, 23);
		Add.add(lblNewLabel_15);
		
		textField = new JTextField();
		textField.setBounds(547, 97, 249, 20);
		Add.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Price");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_16.setBounds(550, 147, 71, 23);
		Add.add(lblNewLabel_16);
		
		textField_1 = new JTextField();
		textField_1.setBounds(547, 181, 103, 20);
		Add.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Add");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Connection con = CP.ceateC();
					
					String q = "select * from menue";
					
					PreparedStatement pstmt = con.prepareStatement(q);
					ResultSet rs = pstmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connectivity.getName data = new Connectivity.getName(textField.getText(), textField_1.getText(), textField_2.getText());
				boolean isadded = Connectivity.myMethod.insert(data);
				if(isadded) {
					System.out.println("Data added succesfully!!!");
				}
				
				clearFields();
			}
			
			
		});
		btnNewButton_4.setBounds(744, 353, 89, 23);
		btnNewButton_4.setFocusable(false);
		Add.add(btnNewButton_4);
		
		lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Arial", Font.BOLD, 12));
		lblCode.setBounds(550, 235, 71, 23);
		Add.add(lblCode);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(550, 268, 103, 20);
		Add.add(textField_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 41, 467, 385);
		Add.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		
		scrollPane.setViewportView(table);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(109, 40, 929, 484);
		main.add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(51, 47, 808, 371);
		panel_1.add(scrollPane_3);
		
		table_2 = new JTable();
		scrollPane_3.setViewportView(table_2);
		
		
	}
	
	   public String getSelectedButtonText(ButtonGroup buttonGroup) {
	        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	        }

	        return null;
	    }
	
	   public int sumRow(JTable pendingtable, int col) {
		    int total = 0;
		    // iterate over all columns
		    for (int i = 0 ; i < pendingtable.getRowCount() ; i++) {
		        // null or not Integer will throw exception
		        total += Integer.parseInt(pendingtable.getValueAt(i,col)+"");
		    }
		    return total;
		}
	   
	   protected void clearFields() {
			// TODO Auto-generated method stub
			textField.setText(null);
			textField_1.setText(null);
			textField_2.setText(null);
		}
}
