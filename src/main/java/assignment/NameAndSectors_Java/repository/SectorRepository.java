package assignment.NameAndSectors_Java.repository;

import assignment.NameAndSectors_Java.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector, Long> {
}