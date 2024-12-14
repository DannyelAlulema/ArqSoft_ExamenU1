package ec.edu.espe.office.repository;

import ec.edu.espe.office.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, String> {
}
