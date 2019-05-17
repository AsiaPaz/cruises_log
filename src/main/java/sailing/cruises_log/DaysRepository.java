package sailing.cruises_log;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;

public interface DaysRepository extends JpaRepository<Days,Integer> {
    Collection<Days> findByDateEntity(LocalDate dateEntity);

    Collection<Days> findById(int id);
}