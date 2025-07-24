package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class datosPersonales {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datosPersonales window = new datosPersonales();
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
	public datosPersonales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1064, 602);
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
		panel.setBounds(10, 20, 1030, 545);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(264, 22, 497, 500);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("aqui ira la imagen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(177, 100, 138, 13);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(46, 219, 183, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(260, 219, 193, 29);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(44, 196, 69, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(260, 196, 69, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Biografia");
		lblNewLabel_3.setBounds(46, 258, 67, 13);
		panel_1.add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 279, 407, 125);
		panel_1.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino", "No definido"}));
		comboBox.setBounds(46, 440, 259, 29);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setBounds(46, 417, 45, 13);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton_6 = new JButton("Modificar");
		btnNewButton_6.setBounds(331, 440, 122, 29);
		panel_1.add(btnNewButton_6);
	}

}
