package assignment.NameAndSectors_Java.service;

import assignment.NameAndSectors_Java.entity.Sector;
import assignment.NameAndSectors_Java.repository.SectorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class SectorServiceTest {

    @Mock
    private SectorRepository sectorRepository;

    private SectorService sectorService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        sectorService = new SectorService(sectorRepository);
    }

    @Test
    public void testGetAllSectors() {
        Sector sector1 = new Sector();
        sector1.setId(1L);
        sector1.setSectorName("Sector 1");

        Sector sector2 = new Sector();
        sector2.setId(2L);
        sector2.setSectorName("Sector 2");

        Mockito.when(sectorRepository.findAll()).thenReturn(Arrays.asList(sector1, sector2));

        List<Sector> sectors = sectorService.getAllSectors();
        Assertions.assertEquals(2, sectors.size());
        Assertions.assertEquals(sector1, sectors.get(0));
        Assertions.assertEquals(sector2, sectors.get(1));
    }
}
