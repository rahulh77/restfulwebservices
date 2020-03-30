package com.rest.webservices.restfulwebservices.helloworld;

import com.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // http://localhost:8080/hello-world
    //    @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello Rahul";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Rahul Bean");
    }

    @GetMapping(path = "/hello-world/{message}")
    public HelloWorldBean helloWorldmsg(@PathVariable String message){
        return new HelloWorldBean(String.format("Hey %s", message));
    }
}
