package pl.bgora.digester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DigesterController {

    private final Digester digester;

    @Autowired
    public DigesterController(Digester digester) {
        this.digester = digester;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/md5", method = RequestMethod.POST)
    public ModelAndView md5(@RequestParam String source, ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("result", digester.md5(source));
        modelAndView.addObject("source", source);
        return modelAndView;
    }

}
