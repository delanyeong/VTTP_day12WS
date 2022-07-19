package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// @RequestMapping (path={"/workshop"})
public class WorkshopController {

    @RequestMapping (path={"/workshop"})
    public String test() {
        
        return "workshop";
    }

    @RequestMapping (path={"/processNumber"})
    public String testResults
    (@RequestParam(name="inputNumber", defaultValue="1") Integer unit, //inputNumber is from the name in workshop.html
    Model model) {

        List<Integer> listInt = new ArrayList<>();
        int loopValue = Integer.parseInt(unit.toString());

        int loop = 1;
        while (loop <= loopValue) {
            int result = (int)((Math.random() * loopValue) + 1);

            if (!listInt.contains(Integer.valueOf(result))) {
                listInt.add(Integer.valueOf(result));
                loop++;
            }
        }

        for (int i = 0; i < listInt.size(); i++) {
            System.out.println("==>" + listInt.get(i));
            System.out.println();
        }

        model.addAttribute("numbers", listInt);

        return "workshopresult";
    }

    
}
