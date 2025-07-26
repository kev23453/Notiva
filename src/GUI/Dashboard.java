package GUI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JToolBar;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class Dashboard {

	private JFrame frame;

	public Dashboard() {
		initialize();
	}

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
		
		JLabel lblNewLabel_1 = new JLabel("Tareas pendientes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 20, 115, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_2.setBounds(20, 43, 46, 31);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(250, 98, 201, 133);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tareas Creadas");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 23, 102, 13);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_3.setBounds(10, 38, 46, 36);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(475, 98, 201, 133);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tareas Realizadas");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 20, 103, 13);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_4.setBounds(10, 44, 46, 36);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(698, 98, 201, 133);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tareas en conjunto");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 21, 118, 13);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_5.setBounds(10, 45, 46, 36);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(27, 64, 128, 21);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
