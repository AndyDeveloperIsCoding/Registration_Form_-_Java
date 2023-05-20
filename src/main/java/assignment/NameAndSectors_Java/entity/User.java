package assignment.NameAndSectors_Java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Sectors are required")
    private String sectors;

    private boolean agreeToTerms;

    public User(Long id, String name, String sectors, boolean agreeToTerms) {
        this.id = id;
        this.name = name;
        this.sectors = sectors;
        this.agreeToTerms = agreeToTerms;
    }

    public User() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSectors(String sectors) {
        this.sectors = sectors;
    }

    public void setAgreeToTerms(boolean agreeToTerms) {
        this.agreeToTerms = agreeToTerms;
    }

    public String getName() {
        return name;
    }
}