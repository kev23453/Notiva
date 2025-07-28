package GUI;

import Modules.User;
import App.conexion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.*;

public class datosPersonales extends JFrame {

    private JTextField txtName;
    private JTextField txtLastName;
    private JTextArea txtBiografy;
    private JComboBox<String> cbSexo;
    private JLabel lblAvatarImagen;

    public datosPersonales() {
        initialize();
    }

    private void initialize() {
        setTitle("Datos Personales");
        setBounds(100, 100, 1064, 636);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0, 0, 1051, 21);
        getContentPane().add(toolBar);

        toolBar.add(new JButton("Dashboard"));
        toolBar.add(new JButton("Tareas"));
        toolBar.add(new JButton("Feed"));
        toolBar.add(new JButton("Perfil"));
        toolBar.add(new JButton("Notas"));
        toolBar.add(new JButton("Cerrar sesion"));

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 20, 1030, 600);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(264, 22, 497, 541);
        panel.add(panel_1);
        panel_1.setLayout(null);

        lblAvatarImagen = new JLabel("\tElegir Avatar", SwingConstants.CENTER);
        lblAvatarImagen.setBounds(177, 20, 138, 138);
        panel_1.add(lblAvatarImagen);

        lblAvatarImagen.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        lblAvatarImagen.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lblAvatarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAvatarImagen.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAvatarImagen.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatar ventanaAvatar = new avatar();
                ventanaAvatar.setVisible(true);
            }
        });

        User usuarioActivo = User.getCurrentUser();
        if (usuarioActivo != null) {
            String rutaAvatar = conexion.obtenerRutaAvatarPorUsuario(usuarioActivo.getUserId());
            if (rutaAvatar != null) {
                try {
                    ImageIcon icono;
                    if (rutaAvatar.startsWith("/") || rutaAvatar.contains("/")) {
                        URL url = getClass().getResource(rutaAvatar);
                        if (url == null) throw new Exception("Recurso no encontrado: " + rutaAvatar);
                        icono = new ImageIcon(url);
                    } else {
                        icono = new ImageIcon(rutaAvatar);
                    }

                    Image imgEscalada = icono.getImage().getScaledInstance(138, 138, Image.SCALE_SMOOTH);
                    lblAvatarImagen.setIcon(new ImageIcon(imgEscalada));
                    lblAvatarImagen.setText(null);
                } catch (Exception ex) {
                    System.err.println("Error al cargar avatar: " + ex.getMessage());
                    cargarAvatarPorDefecto();
                }
            } else {
                cargarAvatarPorDefecto();
            }
        }

        txtName = new JTextField();
        txtName.setBounds(46, 219, 183, 29);
        panel_1.add(txtName);
        txtName.setColumns(10);

        txtLastName = new JTextField();
        txtLastName.setBounds(260, 219, 193, 29);
        panel_1.add(txtLastName);
        txtLastName.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Nombre");
        lblNewLabel_1.setBounds(44, 196, 69, 13);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Apellido");
        lblNewLabel_2.setBounds(260, 196, 69, 13);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Biografia");
        lblNewLabel_3.setBounds(46, 258, 67, 13);
        panel_1.add(lblNewLabel_3);

        txtBiografy = new JTextArea();
        txtBiografy.setBounds(46, 279, 407, 125);
        panel_1.add(txtBiografy);

        cbSexo = new JComboBox<>();
        cbSexo.setModel(new DefaultComboBoxModel<>(new String[]{"Masculino", "Femenino", "No definido"}));
        cbSexo.setBounds(46, 440, 259, 29);
        panel_1.add(cbSexo);

        JLabel lblNewLabel_4 = new JLabel("Sexo");
        lblNewLabel_4.setBounds(46, 417, 45, 13);
        panel_1.add(lblNewLabel_4);

        JButton btnModificar = new JButton("Modificar");
        btnModificar.setBounds(331, 440, 122, 29);
        panel_1.add(btnModificar);

        cargarDatosUsuario();

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtName.getText().trim().isEmpty() || txtLastName.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, complete todos los campos.",
                            "Campos vacíos",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Connection conexionDB = App.conexion.obtenerConexion();
                if (conexionDB == null) {
                    JOptionPane.showMessageDialog(null,
                            "No se pudo conectar a la base de datos.",
                            "Error de conexión",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    if (existeDatosUsuario(conexionDB, User.getCurrentUser().getUserIdString())) {
                        String sqlUpdate = "UPDATE datos_usuario SET nombre = ?, apellido = ?, biografia = ?, sexo = ? WHERE id_usuario = ?";
                        try (PreparedStatement stmt = conexionDB.prepareStatement(sqlUpdate)) {
                            stmt.setString(1, txtName.getText().trim());
                            stmt.setString(2, txtLastName.getText().trim());
                            stmt.setString(3, txtBiografy.getText().trim());
                            stmt.setString(4, (String) cbSexo.getSelectedItem());
                            stmt.setString(5, User.getCurrentUser().getUserIdString());

                            int filas = stmt.executeUpdate();
                            if (filas > 0) {
                                JOptionPane.showMessageDialog(null,
                                        "Datos actualizados correctamente.",
                                        "Éxito",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "No se encontró registro para actualizar.",
                                        "Aviso",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    } else {
                        String sqlInsert = "INSERT INTO datos_usuario (id_usuario, nombre, apellido, biografia, sexo) VALUES (?, ?, ?, ?, ?)";
                        try (PreparedStatement stmt = conexionDB.prepareStatement(sqlInsert)) {
                            stmt.setString(1, User.getCurrentUser().getUserIdString());
                            stmt.setString(2, txtName.getText().trim());
                            stmt.setString(3, txtLastName.getText().trim());
                            stmt.setString(4, txtBiografy.getText().trim());
                            stmt.setString(5, (String) cbSexo.getSelectedItem());

                            int filas = stmt.executeUpdate();
                            if (filas > 0) {
                                JOptionPane.showMessageDialog(null,
                                        "Datos guardados correctamente.",
                                        "Éxito",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error al guardar datos:\n" + ex.getMessage(),
                            "Error SQL",
                            JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } finally {
                    App.conexion.cerrarConexion(conexionDB);
                }
            }
        });
    }

    private void cargarDatosUsuario() {
        User usuarioActivo = User.getCurrentUser();
        if (usuarioActivo == null) return;

        Connection conexionDB = App.conexion.obtenerConexion();
        if (conexionDB == null) return;

        String sql = "SELECT nombre, apellido, biografia, sexo FROM datos_usuario WHERE id_usuario = ?";

        try (PreparedStatement stmt = conexionDB.prepareStatement(sql)) {
            stmt.setString(1, usuarioActivo.getUserIdString());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                txtName.setText(rs.getString("nombre"));
                txtLastName.setText(rs.getString("apellido"));
                txtBiografy.setText(rs.getString("biografia"));
                cbSexo.setSelectedItem(rs.getString("sexo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            App.conexion.cerrarConexion(conexionDB);
        }
    }

    private boolean existeDatosUsuario(Connection conexionDB, String idUsuario) throws SQLException {
        String sql = "SELECT 1 FROM datos_usuario WHERE id_usuario = ?";
        try (PreparedStatement stmt = conexionDB.prepareStatement(sql)) {
            stmt.setString(1, idUsuario);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }
    }

    private void cargarAvatarPorDefecto() {
        try {
            URL url = getClass().getResource("/img/default-avatar.png");
            if (url != null) {
                ImageIcon icono = new ImageIcon(url);
                Image imgEscalada = icono.getImage().getScaledInstance(138, 138, Image.SCALE_SMOOTH);
                lblAvatarImagen.setIcon(new ImageIcon(imgEscalada));
                lblAvatarImagen.setText(null);
            } else {
                System.err.println("No se encontró el avatar por defecto.");
            }
        } catch (Exception ex) {
            System.err.println("Error al cargar avatar por defecto: " + ex.getMessage());
        }
    }
}
