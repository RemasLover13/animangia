package ru.kpfu.animangia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.animangia.services.impl.ProfileService;
import ru.kpfu.animangia.services.impl.UserService;

@Controller
public class ProfileController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }
}
