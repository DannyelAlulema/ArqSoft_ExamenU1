package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "OFI_EDIFICIO")
public class Building {
    @Id
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String code;

    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codeSede;

    @Column(name = "NOMBRES", length = 128, nullable = false)
    private String name;

    @Column(name = "COD_ALEATORIO", length = 16, nullable = false)
    private String randomCode;

    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    private String description;

    @Column(name = "DIRECCION", length = 256, nullable = false)
    private String address;

    @Column(name = "COMENTARIO", length = 1000, nullable = false)
    private String comment;

    @Column(name = "MANEJA_BLOQUES", nullable = false)
    private Boolean hasBlocks;

    @Column(name = "POSEE_AULAS", nullable = false)
    private String hasClassrooms;

    @Column(name = "PISOS", precision = 2, nullable = false)
    private Integer floors;

    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false)
    private Branch branch;

    public Building() { }

    public Building(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(code, building.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Building{" +
                "code='" + code + '\'' +
                ", codeSede='" + codeSede + '\'' +
                ", name='" + name + '\'' +
                ", randomCode='" + randomCode + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                ", hasBlocks=" + hasBlocks +
                ", hasClassrooms='" + hasClassrooms + '\'' +
                ", floors=" + floors +
                '}';
    }
}
