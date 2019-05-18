package sailing.cruises_log;

import org.springframework.stereotype.Service;
import sailing.cruises_log.dto.DaysDto;
import sailing.cruises_log.dto.DaysDtoConverter;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DaysServiceImplementation implements DaysService{
    private DaysRepository daysRepository;

    public DaysServiceImplementation(DaysRepository daysRepository) {
        this.daysRepository = daysRepository;
    }

    @Override
    public Collection<DaysDto> getAllDays() {
        return convertDaysListToDto(daysRepository.findAll());
    }

    @Override
    public Optional<DaysDto> getDayById(Integer id) {
        return daysRepository.findById(id).map(DaysDtoConverter::fromEntity);
    }

    @Override
    public Collection<DaysDto> getDayByDate(String dateEntity) {
        return convertDaysListToDto(daysRepository.findByDateEntity(LocalDate.parse(dateEntity)));
    }

    @Override
    public void addDay(DaysDto daysDto){
        daysRepository.save(DaysDtoConverter.toEntity(daysDto));
    }

    private Collection<DaysDto> convertDaysListToDto(Collection<Days> collection){
        return collection.stream()
                .map(DaysDtoConverter::fromEntity)
                .collect(Collectors.toList());
    }
}
