package jaime.example.domain.repository;

import jaime.example.domain.entity.Racer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RacerRepository extends JpaRepository<Racer,Long> {
}
