package assignment.NameAndSectors_Java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sectors")
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sector_name", nullable = false)
    private String sectorName;

    public Sector(Long id, String sectorName) {
        this.id = id;
        this.sectorName = sectorName;
    }

    public Sector() {
    }

    public Long getId() {
        return id;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
