package sailing.cruises_log;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;

public interface HoursRepository  extends JpaRepository<Hours, Integer> {
    Collection<Hours> findHourEntitiesByDateEntity(LocalDate dateEntity);
    Collection<Hours> findHourEntitiesByDateEntityAndTimeLog(LocalDate dateEntity, int timeLog);
    Collection<Hours> findById(int id);
}
