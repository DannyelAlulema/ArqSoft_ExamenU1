package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "OFI_AULA")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_AULA")
    private Long code;

    @Column(name = "COD_EDIFICIO")
    private String buildingCode;

    @Column(name = "COD_EDIFICIO_BLOQUE")
    private String blockCode;

    @Column(name = "COD_TIPO_AULA")
    private String classroomTypeCode;

    @Column(name = "COD_ALTERNO", length = 8)
    private String randomCode;

    @Column(name = "CAPACIDAD", precision = 4)
    private Integer capacity;

    @Column(name = "PISO", precision = 2)
    private Integer floor;

    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate creationDate;

    @Column(name = "FECHA_ULT_ACTUALIZACION")
    private LocalDateTime lastUpdateDate;

    public Classroom() { }

    public Classroom(Long code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return Objects.equals(code, classroom.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "code=" + code +
                ", buildingCode='" + buildingCode + '\'' +
                ", blockCode='" + blockCode + '\'' +
                ", classroomTypeCode='" + classroomTypeCode + '\'' +
                ", randomCode='" + randomCode + '\'' +
                ", capacity=" + capacity +
                ", floor=" + floor +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
