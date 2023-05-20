package assignment.NameAndSectors_Java.repository;

import assignment.NameAndSectors_Java.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByName(String name);
}