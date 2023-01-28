package com.phrase.assignment.view;

import com.phrase.assignment.service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setup")
public class SetupController {
    private final LoginService loginService;

    public SetupController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public String login() {
        return null;
    }
}
