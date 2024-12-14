package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "OFI_TIPO_AULA")
public class ClassroomType {
    @Id
    @Column(name = "COD_TIPO_AULA", length = 10)
    private String id;

    @Column(name = "DESCRIPCION", length = 128, nullable = false)
    private String description;

    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate creationDate;

    public ClassroomType() { }

    public ClassroomType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassroomType that = (ClassroomType) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ClassroomType{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
