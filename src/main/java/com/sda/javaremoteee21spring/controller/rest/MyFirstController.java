package com.sda.javaremoteee21spring.controller.rest;

import com.sda.javaremoteee21spring.dto.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class MyFirstController {

    //@Slf4j
    private static final Logger log = LoggerFactory.getLogger(MyFirstController.class);

    @GetMapping("/name")
    public String showMeMyName() {
         return "Almar";
    }
    @GetMapping("/me")
    public Person justMe()  {
        return new Person("Almar", "Vasar", 34);
    }

    @GetMapping(value = "me-and-friends")
    //@GetMapping("me-and-friends")
    public List<Person> meAndFriends() {
        List<Person> persons = new ArrayList<>();
        // persons.add(...);
        //persons.add(...);
        return List.of(
                new Person("Toomas", "Snje", 22),
                new Person("Jaak", "Ora", 32)
        );
    }

    //?param1=value1&param2=value2
    // /api/try-login?login=almar&password=12345

    @GetMapping("/try-login")
    public String logIn(@RequestParam(defaultValue = "John Doe", value = "login") String userLogin,
                        @RequestParam(defaultValue = "Login", value = "password") String userPassword) {
        log.info("recived login: [{}] and password: [{}]", userLogin, userPassword);
        return "OK";
    }

    @PostMapping("/try-login")
    public ResponseEntity<String> logInWithPost(String userLogin , String userPassword) {
        log.info("login with post");
        log.info("recived login: [{}] and password: [{}]", userLogin, userPassword);
        if (userLogin == null || userPassword == null) {
            return ResponseEntity.badRequest().body("Provide credentials");
        }
        return ResponseEntity.ok("Success");
    }
}
