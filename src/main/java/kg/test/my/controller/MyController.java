package kg.test.my.controller;

import kg.test.my.service.MyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyInterface myInterface;

    @GetMapping("/hello")
    public String hello(){
        return "I'm a controller";
    }

    @GetMapping("/search/{name}")
    public String hello2(@PathVariable String name){
        return "result of search: " + myInterface.findByName(name);
    }

    @PostMapping("/insert/{name}")
    public String inserting(@PathVariable String name){
        myInterface.insert(name);
        return "I'm post controller " + name;
    }

    @GetMapping("/all")
    public List<String> getAll(){
        return  myInterface.getAll();
    }
}
