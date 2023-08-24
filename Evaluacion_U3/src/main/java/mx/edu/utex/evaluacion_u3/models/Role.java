package mx.edu.utex.evaluacion_u3.models;

public class Role {
    private Long id_role;
    private String role;

    public Role() {
    }

    public Role(Long id_role, String role) {
        this.id_role = id_role;
        this.role = role;
    }

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
