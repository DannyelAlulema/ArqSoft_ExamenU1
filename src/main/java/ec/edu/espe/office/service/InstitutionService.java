package ec.edu.espe.office.service;

import ec.edu.espe.office.model.Institution;
import ec.edu.espe.office.repository.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionService implements IInstitutionService {

    @Autowired
    private InstitutionRepository institutionRepository;

    public List<Institution> getAll()
    {
        return institutionRepository.findAll();
    }

    public Institution find(Integer code)
    {
        return institutionRepository.findById(code).get();
    }

    public Institution save(Institution institution)
    {
        return institutionRepository.save(institution);
    }

    public void delete(Integer code)
    {
        institutionRepository.deleteById(code);
    }
}
