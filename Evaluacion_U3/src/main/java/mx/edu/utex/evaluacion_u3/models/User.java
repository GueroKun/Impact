package mx.edu.utex.evaluacion_u3.models;

public class User {
    private Long id_user;
    private String username, password;
    private Role role;

    public User() {
    }

    public User(Long id_user, String username, String password, Role role) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
