package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "OFI_EDIFICIO_BLOQUE")
public class Block {
    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8)
    private String code;

    @Column(name = "COD_EDIFICIO")
    private String buildingCode;

    @Column(name = "NOMBRE_BLOQUE", length = 128, nullable = false)
    private String name;

    @Column(name = "DESCRIPCION", length = 500)
    private String description;

    public Block() { }

    public Block(String code) {
        this.code = code;
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
