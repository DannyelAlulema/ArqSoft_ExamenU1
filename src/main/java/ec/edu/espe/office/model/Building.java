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
    private String branchCode;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getHasBlocks() {
        return hasBlocks;
    }

    public void setHasBlocks(Boolean hasBlocks) {
        this.hasBlocks = hasBlocks;
    }

    public String getHasClassrooms() {
        return hasClassrooms;
    }

    public void setHasClassrooms(String hasClassrooms) {
        this.hasClassrooms = hasClassrooms;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
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
                ", codeSede='" + branchCode + '\'' +
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
