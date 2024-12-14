package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

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
}
