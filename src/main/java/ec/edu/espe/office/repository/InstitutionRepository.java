package ec.edu.espe.office.repository;

import ec.edu.espe.office.model.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Integer> {
}
