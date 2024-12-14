package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "OFI_EDIFICIO")
public class Building {
    @Id
    @Column(name = "COD_EDIFICIO")
    private String code;

    @Column(name = "COD_SEDE")
    private String codeSede;

    @Column(name = "NOMBRES")
    private String name;

    @Column(name = "COD_ALEATORIO")
    private String randomCode;

    @Column(name = "DESCRIPCION")
    private String description;

    @Column(name = "DIRECCION")
    private String address;

    @Column(name = "COMENTARIO")
    private String comment;

    @Column(name = "MANEJA_BLOQUES")
    private Boolean hasBlocks;

    @Column(name = "POSEE_AULAS")
    private String hasClassrooms;

    @Column(name = "PISOS")
    private Integer floors;

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
