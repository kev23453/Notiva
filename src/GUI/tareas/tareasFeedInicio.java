package GUI.tareas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tareasFeedInicio extends JFrame {

	public tareasFeedInicio() {
		initialize();
	}

	private void initialize() {
		// Configuramos el JFrame actual (this), no otro JFrame
		setTitle("Tareas");
		setBounds(100, 100, 1065, 581);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // DISPOSE para que no cierre toda la app
		getContentPane().setLayout(null);

		JToolBar toolBar = new JToolBar();
		toolBar.setToolTipText("");
		toolBar.setBounds(0, 0, 1051, 21);
		getContentPane().add(toolBar);

		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.setEnabled(false);
		toolBar.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Tareas");
		toolBar.add(btnNewButton_1);

		JButton btnNewButton_4 = new JButton("Feed");
		btnNewButton_4.setEnabled(false);
		toolBar.add(btnNewButton_4);

		JButton btnNewButton_3 = new JButton("Perfil");
		btnNewButton_3.setEnabled(false);
		toolBar.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("Notas");
		btnNewButton_2.setEnabled(false);
		toolBar.add(btnNewButton_2);

		JButton btnNewButton_5 = new JButton("Cerrar sesión");
		btnNewButton_5.setEnabled(false);
		toolBar.add(btnNewButton_5);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 23, 1031, 511);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton_6 = new JButton("Agregar tarea");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaTarea crearTarea = new NuevaTarea();
				crearTarea.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(23, 59, 125, 27);
		panel.add(btnNewButton_6);

		JLabel lblNewLabel = new JLabel("Listado de tareas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 22, 196, 27);
		panel.add(lblNewLabel);
	}
}
