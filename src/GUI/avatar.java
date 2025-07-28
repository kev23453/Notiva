package GUI;

import Modules.User;
import App.conexion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class avatar extends JFrame {

    private List<JButton> botones = new ArrayList<>();
    private JButton avatarSeleccionado = null;

    // Asociamos IDs de avatar con sus rutas, deben coincidir con los datos en la BD
    private final int[] idsAvatares = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final String[] rutasAvatares = {
            "/iconos/avatar1.png", "/iconos/avatar2.png", "/iconos/avatar3.png",
            "/iconos/avatar4.png", "/iconos/avatra5.png", "/iconos/avatra6.png",
            "/iconos/avatra7.png", "/iconos/avatra8.png", "/iconos/avatra9.png"
    };

    public avatar() {
        initialize();
    }

    private void estilizarBoton(JButton boton) {
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
    }

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
        setBounds(100, 100, 507, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        for (int i = 0; i < rutasAvatares.length; i++) {
            int x = 10 + (i % 3) * 160; 
            int y = 57 + (i / 3) * 134; 
            agregarAvatar(rutasAvatares[i], x, y);
        }

        JLabel lblTitulo = new JLabel("Choose avatar");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(170, 11, 160, 22);
        getContentPane().add(lblTitulo);

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setBackground(new Color(192, 192, 192));
        btnContinuar.setBounds(208, 455, 112, 33);
        getContentPane().add(btnContinuar);

        btnContinuar.addActionListener(e -> {
            if (avatarSeleccionado != null) {
                int indice = botones.indexOf(avatarSeleccionado);
                int idAvatarSeleccionado = idsAvatares[indice];
                User usuarioActivo = User.getCurrentUser();

                if (usuarioActivo != null) {
                    boolean exito = conexion.actualizarAvatarUsuario(usuarioActivo.getUserId(), idAvatarSeleccionado);
                    if (exito) {
                        System.out.println("Avatar guardado correctamente");
                        
                        datosPersonales datos = new datosPersonales();
                        datos.setVisible(true);
                        this.dispose();
                    } else {
                        System.out.println("Error al guardar avatar");
                    }
                } else {
                    System.out.println("No hay usuario activo");
                }
            } else {
                System.out.println("No seleccionaste ningún avatar");
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
        getContentPane().add(boton);
    }
}
