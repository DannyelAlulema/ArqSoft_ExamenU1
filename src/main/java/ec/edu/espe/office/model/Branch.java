package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "OFI_SEDE")
public class Branch {
    @Id
    @Column(name = "COD_SEDE", length = 6, nullable = false)
    private String code;

    @Column(name = "COD_INSTITUCION", precision = 3, nullable = false)
    private Long institutionCode;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String name;

    @Column(name = "DIRECCION", length = 128, nullable = false)
    private String address;

    @Column(name = "ES_PRINCIPAL", nullable = false)
    private Boolean isMain;

    @Column(name = "PRESUPUESTO", precision = 18, scale = 2, nullable = false)
    private BigDecimal budget;

    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", referencedColumnName = "COD_INSTITUCION", insertable = false, updatable = false)
    private Institution institution;

    public Branch() { }

    public Branch(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(Long institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getMain() {
        return isMain;
    }

    public void setMain(Boolean main) {
        isMain = main;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch sede = (Branch) o;
        return Objects.equals(code, sede.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Sede{" +
                "code='" + code + '\'' +
                ", institutionCode='" + institutionCode + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isPrincipal=" + isMain +
                ", budget=" + budget +
                '}';
    }
}
