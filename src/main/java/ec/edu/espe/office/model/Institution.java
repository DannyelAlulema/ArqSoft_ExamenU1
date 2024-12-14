package ec.edu.espe.office.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "OFI_INSTITUCION")
public class Institution {
    @Id
    @Column(name = "COD_INSTITUCION", precision = 3, nullable = false)
    private Long code;

    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;

    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String companyName;

    @Column(name = "NOMBRE_COMERCIAL", length = 250, nullable = false)
    private String bussinessName;

    public Institution() { }

    public Institution(Long code) {
        this.code = code;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getBussinessName() {
        return bussinessName;
    }

    public void setBussinessName(String bussinessName) {
        this.bussinessName = bussinessName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institution that = (Institution) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Institution{" +
                "institutionCode='" + code + '\'' +
                ", ruc='" + ruc + '\'' +
                ", companyName='" + companyName + '\'' +
                ", bussinessName='" + bussinessName + '\'' +
                '}';
    }
}
