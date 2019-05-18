package sailing.cruises_log;

import sailing.cruises_log.dto.DaysDto;

import java.util.Collection;
import java.util.Optional;

public interface DaysService {
    Collection<DaysDto> getAllDays();


    Optional<DaysDto> getDayById(Integer id);

    Collection<DaysDto> getDayByDate(String dateEntity);
    void addDay(DaysDto daysDto);

}
