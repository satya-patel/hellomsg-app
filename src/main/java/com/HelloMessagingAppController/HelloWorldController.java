package com.HelloMessagingAppController;

import org.springframework.web.bind.annotation.*;
import com.HelloMessagingAppModel.User;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    
    @RequestMapping(value = {"", "/", "/home"})
    public String hello() {
        return "Hello from Bridgelabz";
    }

    
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !!";
    }

   
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " !!";
    }

  
    @PostMapping("/post")
    public String hello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !!";
    }

  
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " !!";
    }
}