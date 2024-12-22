package com.example.springsecurity.Controller;

import com.example.springsecurity.Model.MyUser;
import com.example.springsecurity.Service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/registration")
    public ResponseEntity registration(@RequestBody @Valid MyUser myUser){
        authService.registration(myUser);
        return ResponseEntity.status(200).body("Successful registration");
    }


}
