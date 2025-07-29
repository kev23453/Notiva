package GUI.tareas;

import App.conexion;
import Modules.Sesion;
import Modules.User;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NuevaTarea extends JFrame {

	//private JFrame frame;
	private JTextField textField;

	public NuevaTarea() {
		initialize();
	}

	private void initialize() {
		setBounds(100, 100, 340, 607);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear nueva tarea");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(20, 10, 208, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TITULO");
		lblNewLabel_1.setBounds(20, 60, 58, 13);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(20, 76, 273, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DESCRIPCION");
		lblNewLabel_2.setBounds(20, 119, 96, 13);
		getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 142, 273, 145);
		getContentPane().add(textArea);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Publico");
		rdbtnNewRadioButton.setBounds(20, 300, 74, 21);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Privado");
		rdbtnNewRadioButton_1.setBounds(96, 300, 87, 21);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 357, 273, 27);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("CATEGORIA");
		lblNewLabel_3.setBounds(20, 339, 74, 13);
		getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("COMPARTIR");
		chckbxNewCheckBox.setBounds(20, 403, 111, 21);
		getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_4 = new JLabel("FECHA DE EXPIRACION");
		lblNewLabel_4.setBounds(20, 440, 143, 13);
		getContentPane().add(lblNewLabel_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1753243200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(20, 463, 273, 27);
		getContentPane().add(spinner);
		
		JButton btnNewButton = new JButton("Crear Tarea");
		btnNewButton.setBounds(182, 520, 111, 27);
		getContentPane().add(btnNewButton);
		
		
		
	}
}
