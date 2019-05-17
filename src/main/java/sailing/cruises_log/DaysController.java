package sailing.cruises_log;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;

@RestController
@RequestMapping("/api/days")
public class DaysController {
  DaysRepository daysRepository;

    public DaysController(DaysRepository daysRepository) {
        this.daysRepository = daysRepository;
    }
    @PostMapping
    public void addDaySummary(@RequestBody Days daySummary){
        daysRepository.save((daySummary));
    }

    @GetMapping
    public Collection<Days> getAllDays(){
        return daysRepository.findAll();
    }

    @GetMapping(params = "dateEntity")
    public Collection<Days> getDayEntity(LocalDate dateEntity){
        return daysRepository.findByDateEntity(dateEntity);
    }
    @GetMapping("/{id}")
    public Collection<Days> getDaySummaryById(@PathVariable int id){
        return daysRepository.findById(id);
    }

}
