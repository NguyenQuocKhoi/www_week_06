package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.backend.models.User;
import vn.edu.iuh.fit.backend.repositories.UserRepository;
import vn.edu.iuh.fit.backend.services.UserService;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  private UserRepository userRepository;
  @RequestMapping("/login")
  public String login(){
    return "login-form";
  }

  @PostMapping("/login")
  public String Login(String email, Model model){
    boolean login = userService.checkLogin(email);
    User user = userRepository.findByEmail(email);
    if(login){
      model.addAttribute("user",user);
      return "redirect:/blog";
    }
    else {
      return "login-form";
    }
  }

}
