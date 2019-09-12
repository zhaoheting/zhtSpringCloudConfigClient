package com.example.zhtSpringCloudConfigClient.controllers;

import com.example.zhtSpringCloudConfigClient.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
public class PersonController {

    @RequestMapping("/getPerson")
    public String getPersons(Model model){
        Person singlePerson = new Person("wc","33");
        List<Person> personList = new LinkedList<>();
        Person p1 = new Person("zs","20");
        Person p2 = new Person("ls","201");
        Person p3 = new Person("wemz","22");
        Person p4 = new Person("wemz","79");
        personList.add(p1);
        personList.add(p4);
        personList.add(p2);
        personList.add(p3);
        model.addAttribute("personList",personList);
        model.addAttribute("singlePerson",singlePerson);
        return "index";
    }
}
