package ru.kpfu.animangia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.animangia.services.impl.UserService;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewMainPage() {
        return "main";
    }

    @GetMapping("/new_main")
    public String viewMainPageAfterAuth() {
        return "new_main";
    }
}
