package com.amandeep.Recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/users")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public int createUser(@RequestBody Map<String,String> payload){
        userService.createUser(payload.get("emailAddress"),payload.get("password"));
        return 1;
    }
}
