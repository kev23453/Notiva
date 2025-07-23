package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class Dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 938, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 924, 21);
		toolBar.setToolTipText("");
		frame.getContentPane().add(toolBar);
		
		JButton btnNewButton = new JButton("Dashboard");
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Feed");
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("Tareas");
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Notas");
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Perfil");
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Cerrar sesion");
		toolBar.add(btnNewButton_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(27, 98, 201, 133);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 21, 72, 13);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(250, 98, 201, 133);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(10, 20, 86, 13);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(475, 98, 201, 133);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setBounds(10, 20, 77, 13);
		panel_2.add(lblNewLabel_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(698, 98, 201, 133);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setBounds(10, 21, 76, 13);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(27, 64, 128, 21);
		frame.getContentPane().add(lblNewLabel);
	}
}
