package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (path={"/workshop"})
public class WorkshopController {

    @GetMapping (produces = {"text/html"})
    public String test() {
        
        return "workshop";
    }
}
