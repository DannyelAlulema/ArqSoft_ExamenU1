package ec.edu.espe.office.repository;

import ec.edu.espe.office.model.Classroom;
import ec.edu.espe.office.model.ClassroomPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClassroomRepository extends JpaRepository<Classroom, ClassroomPk> {
    @Query("SELECT SUM(c.capacity) FROM Classroom c WHERE c.building.code = :branchCode AND c.building.branch.code = :buildingCode")
    Integer getTotalCapacity(@Param("branchCode") String branchCode, @Param("buildingCode") String buildingCode);
}
