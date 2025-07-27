package App;

import Modules.Sesion;
import Modules.User;

import java.sql.*;

public class conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/notiva";
    private static final String USER = "root";
    private static final String PASSWORD = "033004";

    public static Connection obtenerConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
            return null;
        }
    }

    public static void cerrarConexion(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // ✅ Método para login
    public static User loginAndGetUser(String email, String password) {
        String query = "SELECT id_usuario, username, correo, password FROM usuario WHERE correo = ? AND password = ?";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String correo = rs.getString("correo");
                String pass = rs.getString("password");

                Sesion sesion = new Sesion();
                sesion.login(); // marcamos como logueado

                return new User(id, username, correo, pass, sesion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // ❌ si no existe el usuario
    }
}
