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
import javax.swing.JPanel;

public class Register {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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
		frame.setBackground(new Color(64, 128, 128));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 350, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setBounds(49, 89, 122, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(49, 110, 245, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Correo");
		lblNewLabel_1_1.setBounds(49, 157, 122, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(49, 178, 245, 27);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contraseña");
		lblNewLabel_1_2.setBounds(49, 235, 122, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(109, 394, 107, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Confirman contraseña");
		lblNewLabel_1_2_1.setBounds(49, 313, 146, 13);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("ya tienes cuenta?");
		lblNewLabel_2.setBounds(61, 447, 107, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Acceder al Login");
		lblNewLabel_3.setBounds(179, 447, 97, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(49, 258, 245, 25);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(49, 336, 245, 25);
		frame.getContentPane().add(passwordField_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 22, 288, 474);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		 ImageIcon iconoM = new ImageIcon(getClass().getResource("/iconos/logo.jpg"));
	        Image ima = iconoM.getImage().getScaledInstance(70, 50, Image.SCALE_SMOOTH);
	        ImageIcon iconoA = new ImageIcon(ima);
		
		JLabel lblNewLabel = new JLabel("",iconoA,JLabel.LEFT);
		lblNewLabel.setBounds(100, 11, 99, 50);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
	}
}
