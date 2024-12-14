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

    @Column(name = "COD_ALTERNO", length = 10, nullable = false)
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
    @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO", insertable = false, updatable = false)
    private Building building;

    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO_BLOQUE", referencedColumnName = "COD_EDIFICIO_BLOQUE", insertable = false, updatable = false)
    private Block block;

    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", referencedColumnName = "COD_TIPO_AULA", insertable = false, updatable = false)
    private ClassroomType classroomType;

    public Classroom() { }

    public Classroom(ClassroomPk pk) {
        this.pk = pk;
    }

    public ClassroomPk getPk() {
        return pk;
    }

    public void setPk(ClassroomPk pk) {
        this.pk = pk;
    }

    public String getClassroomTypeCode() {
        return classroomTypeCode;
    }

    public void setClassroomTypeCode(String classroomTypeCode) {
        this.classroomTypeCode = classroomTypeCode;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public ClassroomType getClassroomType() {
        return classroomType;
    }

    public void setClassroomType(ClassroomType classroomType) {
        this.classroomType = classroomType;
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
