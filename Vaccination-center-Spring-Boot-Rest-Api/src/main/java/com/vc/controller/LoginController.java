package com.vc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vc.entity.Users;
import com.vc.service.LoginService;
import com.vc.service.UsersService;

@Controller
public class LoginController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/User")
    public String doLogin(@RequestParam String email, @RequestParam String password, Model model) {
        if (usersService.signIn(new Users()).equals("success")) {
            return "redirect:/dashboard"; 
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
    
}
