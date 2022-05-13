package com.bridgelabz.greetingappdevelopment.Controller;

import com.bridgelabz.greetingappdevelopment.Model.Greeting;
import com.bridgelabz.greetingappdevelopment.Model.User;
import com.bridgelabz.greetingappdevelopment.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s";
    private static AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingService greetingService;

    @GetMapping("/getGreeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(String.format(template, name));
    }

    @PostMapping("/postGreeting")
    public Greeting sayHello(@RequestBody Greeting greeting) {
        return new Greeting(String.format(template, greeting.getContent()));
    }

    @PutMapping("/putMapping/{counter}")
    public Greeting sayHello(@PathVariable long counter, @RequestParam(value = "content") String content) {
        return new Greeting(String.format(template, content));
    }

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<String>(greetingService.getMessage(), HttpStatus.OK);
    }

    @GetMapping("/getGreetingMessage")
    public String getGreetingMessage (@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        return greetingService.getGreetingMessage(firstName,lastName);
    }

    @PostMapping("/post")
    public ResponseEntity<String> getGreeting(@RequestBody User user) {
        return new ResponseEntity<String>(greetingService.postMessage(user), HttpStatus.OK);
    }

    @PostMapping("/saveGreeting")
    public ResponseEntity<Greeting> saveGreeting(@RequestBody Greeting greeting) {
        return new ResponseEntity<Greeting>(greetingService.saveMessage(greeting), HttpStatus.OK);
    }

    @GetMapping("/findGreeting")
    public ResponseEntity<String> findGreeting(@RequestParam Integer id) {
        return new ResponseEntity<String>(greetingService.getData(id), HttpStatus.OK);
    }
}