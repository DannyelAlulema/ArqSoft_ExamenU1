package ec.edu.espe.office.repository;

import ec.edu.espe.office.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, String> {
}
