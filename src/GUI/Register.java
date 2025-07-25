package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Register {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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

	public Register() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(64, 128, 128));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 363, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 ImageIcon iconoM = new ImageIcon(getClass().getResource("/iconos/logoS.jpg"));
	        Image ima = iconoM.getImage().getScaledInstance(80, 70, Image.SCALE_SMOOTH);
	        ImageIcon iconoA = new ImageIcon(ima);
		
		JLabel lblNewLabel = new JLabel("",iconoA,JLabel.LEFT);
		lblNewLabel.setBounds(114, 11, 99, 50);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setBounds(46, 91, 122, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(46, 112, 245, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Correo");
		lblNewLabel_1_1.setBounds(46, 159, 122, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 180, 245, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contraseña");
		lblNewLabel_1_2.setBounds(46, 237, 122, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(46, 260, 245, 25);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Confirman contraseña");
		lblNewLabel_1_2_1.setBounds(46, 315, 146, 13);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(46, 338, 245, 25);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBounds(106, 396, 107, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBackground(new Color(192, 192, 192));
		
		JLabel lblNewLabel_2 = new JLabel("ya tienes cuenta?");
		lblNewLabel_2.setBounds(62, 449, 107, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Acceder al Login");
		lblNewLabel_3.setBounds(180, 449, 97, 13);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
