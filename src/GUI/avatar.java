package GUI;
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
	private JButton avatarSeleccionado = null;

	public avatar() {
		initialize();
	}

	private void estilizarBoton(JButton boton) {
		boton.setBorderPainted(false);
		boton.setContentAreaFilled(false);
		boton.setFocusPainted(false);
	}

	/** Marca visualmente el botón seleccionado y desmarca los demás */
	private void seleccionarBoton(JButton botonSeleccionado) {
		this.avatarSeleccionado = botonSeleccionado;

		for (JButton boton : botones) {
			if (boton == botonSeleccionado) {
				boton.setBorderPainted(true);
				boton.setBorder(BorderFactory.createLineBorder(Color.PINK, 3));
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

		agregarAvatar("/iconos/avatar1.png", 10, 57);
		agregarAvatar("/iconos/avatar2.png", 170, 57);
		agregarAvatar("/iconos/avatar3.png", 330, 57);
		agregarAvatar("/iconos/avatar4.png", 10, 191);
		agregarAvatar("/iconos/avatra5.png", 170, 191);
		agregarAvatar("/iconos/avatra6.png", 330, 191);
		agregarAvatar("/iconos/avatra7.png", 10, 322);
		agregarAvatar("/iconos/avatra8.png", 170, 322);
		agregarAvatar("/iconos/avatra9.png", 330, 322);

		JLabel lblTitulo = new JLabel("Choose avatar");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(170, 11, 160, 22);
		frame.getContentPane().add(lblTitulo);

		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBackground(new Color(192, 192, 192));
		btnContinuar.setBounds(208, 455, 112, 33);
		frame.getContentPane().add(btnContinuar);

		btnContinuar.addActionListener(e -> {
			if (avatarSeleccionado != null) {
				System.out.println("✅ Avatar seleccionado correctamente");
				// Aquí podrías obtener un ID según el avatar seleccionado
				// y pasarlo a la siguiente pantalla o guardarlo en DB
			} else {
				System.out.println("⚠ No seleccionaste ningún avatar");
			}
		});
	}

	private void agregarAvatar(String ruta, int x, int y) {
		ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
		Image imagenEscalada = icono.getImage().getScaledInstance(150, 110, Image.SCALE_SMOOTH);

		JButton boton = new JButton(new ImageIcon(imagenEscalada));
		boton.setBounds(x, y, 150, 110);
		estilizarBoton(boton);
		boton.addActionListener(e -> seleccionarBoton(boton));

		botones.add(boton);
		frame.getContentPane().add(boton);
	}
}
