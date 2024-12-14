package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "OFI_EDIFICIO_BLOQUE")
public class Block {
    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String code;

    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String buildingCode;

    @Column(name = "NOMBRE_BLOQUE", length = 128, nullable = false)
    private String name;

    @Column(name = "DESCRIPCION", length = 500, nullable = true)
    private String description;

    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO", insertable = false, updatable = false)
    private Building building;

    public Block() { }

    public Block(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(code, block.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Block{" +
                "code='" + code + '\'' +
                ", buildingCode='" + buildingCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
