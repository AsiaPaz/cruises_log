package sailing.cruises_log;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SailingEventRepository extends JpaRepository <SailingEvent, Integer>{
    List<SailingEvent> findAll();
    List<SailingEvent> findById(int id);
}
