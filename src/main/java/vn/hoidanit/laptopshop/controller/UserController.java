package vn.hoidanit.laptopshop.controller;

// import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * UserController
 */
@Controller
public class UserController {
    
    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getUserName(){
        return "duy.html";
    }
    
}
// @RestController
// public class UserController {
    
//     private UserService userService;
    
//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     @GetMapping("/")
//     public String getUserName(){
//         return this.userService.handleHello();
//     }
    
// }