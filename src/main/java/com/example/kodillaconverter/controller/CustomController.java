package com.example.kodillaconverter.controller;

import com.example.kodillaconverter.domain.MyCustomClass;
import com.example.kodillaconverter.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom/")
public class CustomController {

    @PostMapping(path = "add")
    public void acceptCustomTextType(@RequestBody MyCustomClass customObject) {
        System.out.println(customObject.getFieldOne());
        System.out.println(customObject.getFieldTwo());
        System.out.println(customObject.getFieldThree());
    }

    @PostMapping(path = "useradd")
    public void acceptCustomTextTypeUser(@RequestBody User user) {
        System.out.println(user.getAge());
        System.out.println(user.getEmail());
        System.out.println(user.getName());
    }

}

