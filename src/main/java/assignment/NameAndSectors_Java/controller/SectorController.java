package assignment.NameAndSectors_Java.controller;

import assignment.NameAndSectors_Java.entity.Sector;
import assignment.NameAndSectors_Java.service.SectorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sectors")
@CrossOrigin(origins = "http://localhost:3000")
public class SectorController {

    private final SectorService sectorService;

    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @GetMapping
    public List<Sector> getAllSectors() {
        return sectorService.getAllSectors();
    }
}