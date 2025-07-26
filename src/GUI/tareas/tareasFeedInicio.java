package GUI.tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class tareasFeedInicio {

	private JFrame frame;

	public tareasFeedInicio() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1065, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setToolTipText("");
		toolBar.setBounds(0, 0, 1051, 21);
		frame.getContentPane().add(toolBar);
		
		JButton btnNewButton = new JButton("Dashboard");
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tareas");
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Feed");
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Perfil");
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Notas");
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Cerrar sesion");
		toolBar.add(btnNewButton_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 23, 1031, 511);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Agregar tarea");
		btnNewButton_6.setBounds(23, 59, 125, 27);
		panel.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("Listado de tareas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 22, 196, 27);
		panel.add(lblNewLabel);
	}
}
