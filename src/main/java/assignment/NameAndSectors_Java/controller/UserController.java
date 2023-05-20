package assignment.NameAndSectors_Java.controller;

import assignment.NameAndSectors_Java.entity.User;
import assignment.NameAndSectors_Java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/users")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        if (userService.existsByName(user.getName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists.");
        }

        userService.saveUser(user);
        return ResponseEntity.ok("User data saved successfully.");
    }

}