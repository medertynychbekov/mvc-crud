package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;
import peaksoft.model.User;
import peaksoft.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("find_all")
    public String findAll(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @GetMapping("/add")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "add_user";
    }

    @PostMapping("/posttt")
    public String saveUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "successfully_saved_page";
    }
}
