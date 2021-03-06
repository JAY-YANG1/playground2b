package jaemukyang.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/list")
    public String list() {
        return "board/list";
    }

    @GetMapping("/board/write")
    public String write() {
        return "board/write";
    }

    @GetMapping("/board/view")
    public String view() {
        return "board/view";
    }
}
