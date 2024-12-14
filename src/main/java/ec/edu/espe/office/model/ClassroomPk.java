package ec.edu.espe.office.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ClassroomPk {
    @Column(name = "COD_EDIFICIO", length = 8)
    private String buildingId;

    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8)
    private String buildingBlockId;

    @Column(name = "COD_TIPO_AULA", length = 10)
    private String classroomTypeId;
}
