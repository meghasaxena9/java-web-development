package org.launchcode.codingevents.zip.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

        @GetMapping("/index")
        public String getIndexTemplate(Model model) {
            List<String> eventNames = new ArrayList<>();
            eventNames.add("Event 1");
            eventNames.add("Event 2");
            eventNames.add("Event 3");


            model.addAttribute("eventNames", eventNames);


            return "index";
        }
        //lives at /events /create
        @GetMapping("create")
        public String renderCreateEventForm(){

            return "events/create";

        }
    }



