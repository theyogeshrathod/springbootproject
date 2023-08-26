package com.coolapps.yo.backendproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<String> list = new ArrayList<>();

    @GetMapping("/")
    public String heyThere() {
        return "Hey there!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String HelloName(@PathVariable String name) {
        if (list.size() > 0) {
            return "Hello " + name + " " + list.get(list.size() - 1);
        }
        return "Hello " + name;
    }

    @PostMapping("greetings")
    public void greetings(@RequestParam String greetings) {
        list.add(greetings);
    }
}
