package com.haydendurham.schedulebuilder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    @GetMapping("/classes")
    public String getClasses(Model model) {
        Lecture IntroAfr = new Lecture("Intro Afr/Afr American Study", "TR", "09:40 am-11:05 am", "TBA", "DH 119", "01/17-05/04", 3, "AAAS", 2100, 001);
        model.addAttribute("IntroAfr", IntroAfr);
        return "classes";
    }
}
