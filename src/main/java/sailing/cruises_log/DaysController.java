package sailing.cruises_log;

import org.springframework.web.bind.annotation.*;
import sailing.cruises_log.dto.DaysDto;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/days")
public class DaysController {
  private DaysServiceImplementation daysServiceImpl;

    public DaysController(DaysServiceImplementation daysServiceImpl) {
        this.daysServiceImpl = daysServiceImpl;
    }

    @PostMapping
    public void addDaySummary(@RequestBody DaysDto daysDto){
        daysServiceImpl.addDay(daysDto);
    }

    @GetMapping
    public Collection<DaysDto> getAllDays(){
        return daysServiceImpl.getAllDays();
    }

    @GetMapping(params = "dateEntity")
    public Collection<DaysDto> getDayEntity(String dateEntity){
        return daysServiceImpl.getDayByDate(dateEntity);
    }
    @GetMapping("/{id}")
    public Optional<DaysDto> getDaySummaryById(@PathVariable int id){
        return daysServiceImpl.getDayById(id);
    }

}
