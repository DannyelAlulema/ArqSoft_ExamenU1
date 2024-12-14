package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Embeddable
public class ClassroomPk {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_AULA", length = 10)
    private Long code;

    @Column(name = "COD_EDIFICIO", length = 8)
    private String buildingCode;

    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8)
    private String blockCode;
}
