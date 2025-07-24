package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login {

    private JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
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
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 842, 524);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(32, 31, 359, 424);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Bienvenidos a Notiva");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel_2.setBounds(0, 25, 339, 50);
        panel.add(lblNewLabel_2);

        ImageIcon icono1 = new ImageIcon(getClass().getResource("/iconos/logoS.jpg"));
        Image imageH = icono1.getImage().getScaledInstance(270, 235, Image.SCALE_SMOOTH);
        ImageIcon iconoS = new ImageIcon(imageH);

        JLabel lblNewLabel_3 = new JLabel("", iconoS, JLabel.LEFT);
        lblNewLabel_3.setBounds(41, 86, 273, 211);
        panel.add(lblNewLabel_3);

        JLabel lblMensaje = new JLabel(
        	    "<html><div style='text-align:center;'> Tu espacio digital para organizar tus notas y colaborar con tus compañeros.</div></html>"
        	);

        lblMensaje.setForeground(new Color(0, 0, 0));
        lblMensaje.setFont(new Font("Calibri", Font.PLAIN, 16));
        lblMensaje.setBounds(10, 236, 319, 200);
        panel.add(lblMensaje);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(401, 31, 394, 424);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblNewLabel.setBounds(147, 11, 98, 48);
        panel_1.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBounds(55, 181, 281, 42);
        panel_1.add(textField);
        textField.setColumns(10);
        // Placeholder username
        String userPlaceholder = "Username";
        textField.setText(userPlaceholder);
        textField.setForeground(Color.GRAY);
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(userPlaceholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(userPlaceholder);
                }
            }
        });

        JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
        chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
        chckbxNewCheckBox.setBounds(47, 308, 117, 21);
        panel_1.add(chckbxNewCheckBox);

        JLabel lblNewLabel_1 = new JLabel("Forgot password?");
        lblNewLabel_1.setBounds(233, 312, 113, 13);
        panel_1.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Ingresar");
        btnNewButton.setBackground(new Color(192, 192, 192));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnNewButton.setBounds(147, 354, 117, 29);
        panel_1.add(btnNewButton);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordField.setBounds(55, 259, 281, 42);
        panel_1.add(passwordField);
        // Placeholder password
        String passPlaceholder = "Password";
        passwordField.setEchoChar((char)0); // Mostrar texto inicialmente
        passwordField.setText(passPlaceholder);
        passwordField.setForeground(Color.GRAY);
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals(passPlaceholder)) {
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                    passwordField.setEchoChar('•'); // O el carácter que quieras para ocultar
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setForeground(Color.GRAY);
                    passwordField.setText(passPlaceholder);
                    passwordField.setEchoChar((char)0); // Mostrar texto cuando está vacío
                }
            }
        });

        ImageIcon icono2 = new ImageIcon(getClass().getResource("/iconos/user4.png"));
        Image image = icono2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon icono5 = new ImageIcon(image);

        JLabel lblNewLabel_4 = new JLabel("", icono5, JLabel.LEFT);
        lblNewLabel_4.setBounds(147, 70, 117, 100);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("don't have an account yet?");
        lblNewLabel_5.setBounds(76, 399, 164, 14);
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("create account");
        lblNewLabel_6.setBounds(230, 399, 98, 14);
        panel_1.add(lblNewLabel_6);
    }
}
