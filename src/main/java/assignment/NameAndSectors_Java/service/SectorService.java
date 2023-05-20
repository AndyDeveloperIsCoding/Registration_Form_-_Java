package assignment.NameAndSectors_Java.service;

import assignment.NameAndSectors_Java.entity.Sector;
import assignment.NameAndSectors_Java.repository.SectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorService {

    private final SectorRepository sectorRepository;

    public SectorService(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }

    public List<Sector> getAllSectors() {
        return sectorRepository.findAll();
    }

}
