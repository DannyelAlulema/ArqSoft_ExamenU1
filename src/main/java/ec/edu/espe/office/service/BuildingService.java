package ec.edu.espe.office.service;

import ec.edu.espe.office.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService implements IBuildingService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public Integer getBuildingCapacity(String branchCode, String buildingCode)
    {
        return classroomRepository.getTotalCapacity(branchCode, buildingCode);
    }
}
