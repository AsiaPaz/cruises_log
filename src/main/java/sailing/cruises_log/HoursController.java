package sailing.cruises_log;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/hours")
public class HoursController {
    private HoursRepository hoursRepository;

    public HoursController(HoursRepository hoursRepository) {
        this.hoursRepository = hoursRepository;
    }

    @PostMapping
    public void addHoursEntity(@RequestBody Hours hourEntity){
        hoursRepository.save(hourEntity);
    }

    @GetMapping
    public List<Hours> getAllHours(){
        return hoursRepository.findAll();
    }

    @GetMapping(params = "dateEntity")
    public Collection<Hours> getHoursByDateEntity(LocalDate dateEntity){
        return hoursRepository.findHourEntitiesByDateEntity(dateEntity);
    }

    @GetMapping(params="dateEntity, timeLog")
    public Collection<Hours> getHoursByDateAndLogTime(LocalDate dateEntity, int timeLog) {
        return hoursRepository.findHourEntitiesByDateEntityAndTimeLog(dateEntity, timeLog);
    }
    @GetMapping("/{id}")
    public Collection<Hours> getHoursById(int id){
        return hoursRepository.findById(id);
    }

}