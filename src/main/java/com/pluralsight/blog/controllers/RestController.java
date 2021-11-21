package com.pluralsight.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import java.util.List;
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(path = "/friends/{id}")
    public String getFriends(@PathVariable String id){
        return ("Dur mara " + id);
    }
}
