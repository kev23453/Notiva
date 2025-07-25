package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.BorderFactory;

public class avatar {

	private JFrame frame;
	private List<JButton> botones = new ArrayList<>();

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				avatar window = new avatar();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public avatar() {
		initialize();
	}

	private void estilizarBoton(JButton boton) {
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setFocusPainted(false);
	}

	private void seleccionarBoton(JButton botonSeleccionado) {
		for (JButton boton : botones) {
			if (boton == botonSeleccionado) {
				boton.setBorderPainted(true);
				boton.setBorder(BorderFactory.createLineBorder(Color.pink, 3));
			} else {
				estilizarBoton(boton);
				boton.setBorder(null); 
			}
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon icono2 = new ImageIcon(getClass().getResource("/iconos/avatar1.png"));
		Image image = icono2.getImage().getScaledInstance(140, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton = new JButton(new ImageIcon(image));
		btnNewButton.setBounds(10, 57, 140, 110);
		estilizarBoton(btnNewButton);
		botones.add(btnNewButton);
		btnNewButton.addActionListener(e -> seleccionarBoton(btnNewButton));
		frame.getContentPane().add(btnNewButton);

		ImageIcon icono = new ImageIcon(getClass().getResource("/iconos/avatar2.png"));
		Image images = icono.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_1 = new JButton(new ImageIcon(images));
		btnNewButton_1.setBounds(170, 57, 150, 110);
		estilizarBoton(btnNewButton_1);
		botones.add(btnNewButton_1);
		btnNewButton_1.addActionListener(e -> seleccionarBoton(btnNewButton_1));
		frame.getContentPane().add(btnNewButton_1);

		ImageIcon iconon = new ImageIcon(getClass().getResource("/iconos/avatar3.png"));
		Image imageM = iconon.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_2 = new JButton(new ImageIcon(imageM));
		btnNewButton_2.setBounds(330, 57, 150, 110);
		estilizarBoton(btnNewButton_2);
		botones.add(btnNewButton_2);
		btnNewButton_2.addActionListener(e -> seleccionarBoton(btnNewButton_2));
		frame.getContentPane().add(btnNewButton_2);

		ImageIcon icom = new ImageIcon(getClass().getResource("/iconos/avatar4.png"));
		Image ima = icom.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_3 = new JButton(new ImageIcon(ima));
		btnNewButton_3.setBounds(10, 191, 150, 110);
		estilizarBoton(btnNewButton_3);
		botones.add(btnNewButton_3);
		btnNewButton_3.addActionListener(e -> seleccionarBoton(btnNewButton_3));
		frame.getContentPane().add(btnNewButton_3);

		ImageIcon iconoQ = new ImageIcon(getClass().getResource("/iconos/avatra5.png"));
		Image imaYE = iconoQ.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_1_1 = new JButton(new ImageIcon(imaYE));
		btnNewButton_1_1.setBounds(170, 191, 150, 110);
		estilizarBoton(btnNewButton_1_1);
		botones.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(e -> seleccionarBoton(btnNewButton_1_1));
		frame.getContentPane().add(btnNewButton_1_1);

		ImageIcon iconoK = new ImageIcon(getClass().getResource("/iconos/avatra6.png"));
		Image imaJE = iconoK.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_2_1 = new JButton(new ImageIcon(imaJE));
		btnNewButton_2_1.setBounds(330, 191, 150, 110);
		estilizarBoton(btnNewButton_2_1);
		botones.add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(e -> seleccionarBoton(btnNewButton_2_1));
		frame.getContentPane().add(btnNewButton_2_1);

		ImageIcon iconoB = new ImageIcon(getClass().getResource("/iconos/avatra7.png"));
		Image imageC = iconoB.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_4 = new JButton(new ImageIcon(imageC));
		btnNewButton_4.setBounds(10, 322, 150, 110);
		estilizarBoton(btnNewButton_4);
		botones.add(btnNewButton_4);
		btnNewButton_4.addActionListener(e -> seleccionarBoton(btnNewButton_4));
		frame.getContentPane().add(btnNewButton_4);

		ImageIcon iconoT = new ImageIcon(getClass().getResource("/iconos/avatra8.png"));
		Image imagesKE = iconoT.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_1_2 = new JButton(new ImageIcon(imagesKE));
		btnNewButton_1_2.setBounds(170, 322, 150, 110);
		estilizarBoton(btnNewButton_1_2);
		botones.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(e -> seleccionarBoton(btnNewButton_1_2));
		frame.getContentPane().add(btnNewButton_1_2);

		ImageIcon iconoTY = new ImageIcon(getClass().getResource("/iconos/avatra9.png"));
		Image imagesY = iconoTY.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);
		JButton btnNewButton_2_2 = new JButton(new ImageIcon(imagesY));
		btnNewButton_2_2.setBounds(330, 322, 150, 110);
		estilizarBoton(btnNewButton_2_2);
		botones.add(btnNewButton_2_2);
		btnNewButton_2_2.addActionListener(e -> seleccionarBoton(btnNewButton_2_2));
		frame.getContentPane().add(btnNewButton_2_2);

		JLabel lblNewLabel = new JLabel("Choose avatar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(170, 11, 160, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("continuar");
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		btnNewButton_5.setBounds(192, 456, 112, 33);
		frame.getContentPane().add(btnNewButton_5);
	}
}
