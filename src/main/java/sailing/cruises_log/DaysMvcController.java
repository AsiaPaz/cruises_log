package sailing.cruises_log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sailing.cruises_log.dto.DaysDto;

import java.util.Collection;
import java.util.Optional;


@RequestMapping("/api/days/")
@Controller
public class DaysMvcController {
    // private DaysController daysServiceImpl;
    private DaysRepository daysRepository;

    public DaysMvcController(DaysRepository daysRepository) {
        this.daysRepository = daysRepository;
    }


    @PostMapping
    public String addDaySummary(Days days){
        daysRepository.save(days);
        return "redirect:/api/days";
    }

    @GetMapping
    public String allDaysView(Model indexViewModel){

        indexViewModel.addAttribute("allDays", daysRepository.findAll());
        return "DaysView";
    }

    @GetMapping("form_date")
    public String getDayEntity(String dateEntity){
        return "form_date";
    }


}