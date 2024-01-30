import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Це домашня сторінка!");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model, @RequestParam String clientData) {

        String processedData = clientData.toUpperCase();

        model.addAttribute("message", "Оброблені дані від клієнта: " + processedData);
        return "about";
    }
}
