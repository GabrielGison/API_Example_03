package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    public String getString(@RequestParam String s1, @RequestParam(required = false) String s2){
        if (s2 == null) return s1;
        else return s1 + " " + s2;
    }

}
