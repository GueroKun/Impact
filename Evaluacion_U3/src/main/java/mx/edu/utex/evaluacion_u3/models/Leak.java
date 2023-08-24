package mx.edu.utex.evaluacion_u3.models;

public class Leak {
    private Long id;
    private String name;
    private String title;
    private String description;
    private String status;

    public Leak() {
    }

    public Leak(Long id, String name, String title, String description, String status) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}