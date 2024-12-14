package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "OFI_AULA")
public class Classroom {
    @EmbeddedId
    private ClassroomPk pk;

    @Column(name = "COD_TIPO_AULA", length = 10, nullable = false)
    private String classroomTypeCode;

    @Column(name = "COD_ALTERNO", length = 8, nullable = false)
    private String randomCode;

    @Column(name = "CAPACIDAD", precision = 4, nullable = false)
    private Integer capacity;

    @Column(name = "PISO", precision = 2, nullable = false)
    private Integer floor;

    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate creationDate;

    @Column(name = "FECHA_ULT_ACTUALIZACION", nullable = true)
    private LocalDateTime lastUpdateDate;

    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", referencedColumnName = "COD_TIPO_AULA", insertable = false, updatable = false)
    private ClassroomType classroomType;

    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", referencedColumnName = "COD_TIPO_AULA", insertable = false, updatable = false)
    private ClassroomType classroomType;

    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", referencedColumnName = "COD_TIPO_AULA", insertable = false, updatable = false)
    private ClassroomType classroomType;

    public Classroom() { }

    public Classroom(ClassroomPk pk) {
        this.pk = pk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return Objects.equals(pk, classroom.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pk);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "pk=" + pk +
                ", classroomTypeCode='" + classroomTypeCode + '\'' +
                ", randomCode='" + randomCode + '\'' +
                ", capacity=" + capacity +
                ", floor=" + floor +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
