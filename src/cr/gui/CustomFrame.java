package cr.gui;

import cr.*;
import oodp.GUI;
import oodp.GUI.LoginFrame;
import oodp.GUI.LoginFrame.MyPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame
{
	private JFrame frame;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}
	public class LoginFrame extends JFrame{
		BufferedImage img = null;
		JTextField loginTextField;
		JPasswordField passwordField;
		JButton bt;
		
	public LoginFrame() {
		setTitle("Login");
		setSize(600,800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		setLayout(null);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(185, 30, 600, 500);
		layeredPane.setLayout(null);
		
		try {
			img = ImageIO.read(new File("C:\\Users\\hyose\\OneDrive\\바탕 화면\\다운로드.png"));
		}catch(IOException e) {
			System.out.println("이미지 불러오기 실패");
			System.exit(0);
		}
		
		MyPanel panel = new MyPanel();
		panel.setBounds(0,0,600,500);
		
//		JLabel loginTitle = new JLabel("LOGIN");
//		loginTitle.setBounds(0,0, 50, 20);
//		layeredPane.add(loginTitle);
//		loginTitle.setForeground(Color.black);
		
		loginTextField = new JTextField(15);
		loginTextField.setBounds(0,300,280,50);
		layeredPane.add(loginTextField);
		loginTextField.setOpaque(false);
		loginTextField.setBackground(Color.white);
		loginTextField.setForeground(Color.black);
//		loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		passwordField = new JPasswordField(15);
		passwordField.setBounds(0,370,280,50);
		passwordField.setOpaque(false);
		passwordField.setBackground(Color.white);
		passwordField.setForeground(Color.black);
//		passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		layeredPane.add(passwordField);
		
		bt = new JButton("Login");
		bt.setBounds(70,430,104,48);
		
		bt.setBackground(Color.lightGray);
		bt.setFocusPainted(false);
		bt.setContentAreaFilled(false);
		
		layeredPane.add(bt);
		bt
		.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginFrame();
			}
		});
		
		layeredPane.add(panel);
		add(layeredPane);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(0, 0, 700, 700);
		
		JPanel panel = new JPanel();
		panel.setBounds(9, 0, 174, 473);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB0B4\uC77C \uBB50 \uC785\uC9C0?");
		lblNewLabel.setBounds(9, 12, 151, 57);
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("오픈애즈", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("NEW ARRIVAL");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(9, 81, 139, 27);
		btnNewButton.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("WEEKLY BEST");
		btnNewButton2.setBackground(Color.WHITE);
		btnNewButton2.setBounds(9, 111, 139, 27);
		btnNewButton2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton2.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		panel.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("CLOSET");
		btnNewButton3.setBackground(Color.WHITE);
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton3.setBounds(9, 139, 105, 27);
		panel.add(btnNewButton3);
		btnNewButton3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton3.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		
		JButton btnNewButton4 = new JButton("THEME");
		btnNewButton4.setBackground(Color.WHITE);
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton4.setBounds(9, 169, 105, 27);
		btnNewButton4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton4.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		panel.add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("COORDINATOR");
		btnNewButton5.setBackground(Color.WHITE);
		btnNewButton5.setBounds(9, 199, 159, 27);
		btnNewButton5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton5.setFont(new Font("나눔바른고딕", Font.PLAIN, 15));
		panel.add(btnNewButton5);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(197, 24, 207, 29);
		frame.getContentPane().add(splitPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hyose\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\icon.png"));
		splitPane.setLeftComponent(lblNewLabel_2);
		
		textField_1 = new JTextField();
		splitPane.setRightComponent(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("\uC624\uB298\uC758 \uCD94\uCC9C >");
		
		lblNewLabel_1.setFont(new Font("나눔바른고딕", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(204, 65, 193, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\hyose\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\4.JPG"));
		lblNewLabel_3.setBounds(201, 106, 256, 218);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hyose\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\2.JPG"));
		label.setBounds(461, 106, 256, 218);
		frame.getContentPane().add(label);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\hyose\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\closet.jpg"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(565, 24, 60, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginFrame();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\hyose\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\login.png"));
		btnNewButton_1.setBounds(491, 24, 60, 39);
		frame.getContentPane().add(btnNewButton_1);
		

		

	}

	
//	public CustomFrame()
//	{
//		super("CLTRec_Beta");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setBackground(Color.WHITE);
//	}	
//
//
//	public CustomFrame size(int x, int y)
//	{
//		this.setSize(x,y);	
//		
//		return this;
//	}
//
//	public CustomFrame adds(Component com)
//	{
//		this.add(com);
//	
//		return this;
//	}
//
//	public void start()
//	{
//		repaint();
//		this.setVisible(true);
//	}
}
