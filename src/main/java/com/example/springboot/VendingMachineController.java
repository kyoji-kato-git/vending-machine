package com.example.springboot;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class VendingMachineController {
 
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("message", "こんにちは世界");
        return "index";
    }
 
}