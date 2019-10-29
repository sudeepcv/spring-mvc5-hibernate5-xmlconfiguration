package com.sudeep.controller;

import com.sudeep.entity.Person;
import com.sudeep.service.PersonService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PersonController {

    

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String hello() {
        System.out.println("inside hello");

        Person person=new Person();
        person.setName("sudeep");
        person.setAddress("basics-in-java.blogspot.com");
        personService.savePerson(person);

        return "index";
    }

}