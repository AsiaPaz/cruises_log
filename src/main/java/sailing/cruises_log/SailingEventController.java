package sailing.cruises_log;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cruise")
public class SailingEventController {
    private SailingEventRepository sailingEventRepository;

    public SailingEventController(SailingEventRepository sailingEventRepository) {
        this.sailingEventRepository = sailingEventRepository;
    }

    @PostMapping
    public void addCruise(@RequestBody SailingEvent sailingEvent){
        sailingEventRepository.save(sailingEvent);
    }

    @GetMapping
    public List<SailingEvent> getCruise(){
        sailingEventRepository.findAll();
        return sailingEventRepository.findAll();
    }

    @GetMapping("/id")
    public List<SailingEvent> getCruiseById(@PathVariable int id){
        return sailingEventRepository.findById(id);
    }
}
