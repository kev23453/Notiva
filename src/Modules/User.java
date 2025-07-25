package Modules;

public class User {
    private String userName;
    private String email;
    private String password;
    private Sesion lastSesion;

    public User(String userName, String email, String password, Sesion lastSesion) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.lastSesion = lastSesion;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Sesion getLastSesion() {
        return lastSesion;
    }
}
