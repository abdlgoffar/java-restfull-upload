package java.restfull.repositories;

import java.restfull.entities.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilesRepository extends JpaRepository<Files, Long> {
    Optional<Files> findByName(String name);
}
