package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDao;
import web.service.UserService;

@Controller
@RequestMapping("/pages")
public class UsersController {

     private  final UserService userService;

     @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String users(Model model) { model.addAttribute("pages", userService.getAllUsers());
        return "pages/users";
    }

}

