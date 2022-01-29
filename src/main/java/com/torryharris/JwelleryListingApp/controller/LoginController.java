package com.torryharris.JwelleryListingApp.controller;

import com.torryharris.JwelleryListingApp.model.User;
import com.torryharris.JwelleryListingApp.repository.RoleRepository;
import com.torryharris.JwelleryListingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepo;
    @Autowired
    RoleRepository roleRepo;
    @GetMapping("/login")
    public String login(){
        return "sign";
    }
    @GetMapping("/register")
    public String register(){
        return "sign";
    }
//    @GetMapping("/error")
//    public String error(){
//        return "sign";
//    }
//    @RequestMapping("/register")
//    public String registerdb(User user){
//        userRepo.save(user);
//        return "sign";
//    }
//    @RequestMapping("/login")
//    public String user(User user, HttpServletRequest request){
//        String username=request.getParameter("email");
//        String password=request.getParameter("password");
//        User user1=userRepo.findUserByEmail(username).orElse(new User());
//        if(username.equals("admin_access@thbs.com") && password.equals("Jeswanth@2000")||(username.equals("anjanakrishna.muktha.1426@gmail.com")&&password.equals("123456789"))){
//            return "adminHome";
//        }
//        else if(username.equals(user1.getEmail()) && password.equals(user1.getPassword())){
//            return "index";
//        }
//        else {
//            return "error";
//        }
//    }
}
