package sailing.cruises_log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sailing.cruises_log.dto.DaysDto;

import java.util.Collection;
import java.util.Optional;


@RequestMapping("/api/days/view")
@Controller
public class DaysMvcController {
    // private DaysController daysServiceImpl;
    private DaysController daysController;

    public DaysMvcController(DaysController daysController) {
        this.daysController = daysController;
    }

    @PostMapping
    public String addDaySummary(DaysDto daysDto){
        daysController.addDaySummary(daysDto);
        return "redirect:/api/days";
    }

    @GetMapping
    public String allDaysView(Model indexViewModel){

        Collection<DaysDto> tab = daysController.getAllDays();

        indexViewModel.addAttribute("alldays", daysController.getAllDays());
        return "DaysView.html";
    }

    @GetMapping("form_date")
    public String getDayEntity(String dateEntity){
        return "form_date";
    }


}