package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "OFI_SEDE")
public class Branch {
    @Id
    @Column(name = "COD_SEDE")
    private String code;

    @Column(name = "COD_INSTITUCION")
    private String institutionCode;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "DIRECCION")
    private String address;

    @Column(name = "ES_PRINCIPAL")
    private Boolean isPrincipal;

    @Column(name = "PRESUPUESTO")
    private BigDecimal budget;

    public Branch() { }

    public Branch(String code) {
        this.code = code;
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
                ", isPrincipal=" + isPrincipal +
                ", budget=" + budget +
                '}';
    }
}
