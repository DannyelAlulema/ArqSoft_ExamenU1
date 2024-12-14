package ec.edu.espe.office.service;

import ec.edu.espe.office.model.Institution;

import java.util.List;

public interface IInstitutionService {
    public List<Institution> getAll();
    public Institution find(Integer code);
    public Institution save(Institution institution);
    public void delete(Integer code);
}
