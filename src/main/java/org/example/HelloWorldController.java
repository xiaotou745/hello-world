package org.example;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("")
    public String sayHello(@RequestParam(required = false) String name) {
        if (StringUtils.isEmpty(name)) {
            name = "World.";
        }
        return "Hello " + name;
    }
}
