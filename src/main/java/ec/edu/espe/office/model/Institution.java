package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "OFI_INSTITUCION")
public class Institution {
    @Id
    @Column(name = "COD_INSTITUCION")
    private String institutionCode;

    @Column(name = "RUC")
    private String ruc;

    @Column(name = "RAZON_SOCIAL")
    private String companyName;

    @Column(name = "NOMBRE_COMERCIAL")
    private String bussinessName;

    public Institution() { }

    public Institution(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institution that = (Institution) o;
        return Objects.equals(institutionCode, that.institutionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(institutionCode);
    }

    @Override
    public String toString() {
        return "Institution{" +
                "institutionCode='" + institutionCode + '\'' +
                ", ruc='" + ruc + '\'' +
                ", companyName='" + companyName + '\'' +
                ", bussinessName='" + bussinessName + '\'' +
                '}';
    }
}
