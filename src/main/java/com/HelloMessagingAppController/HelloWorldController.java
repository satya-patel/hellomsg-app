package com.HelloMessagingAppController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

   
    @RequestMapping(value = {"", "/", "/home"})
    public String hello(){
        return "Hello from Bridgelabz";
    }

    
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name){
        return "Hello " + name + " !!";
    }


    @GetMapping("/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name +" !!";
    }
}