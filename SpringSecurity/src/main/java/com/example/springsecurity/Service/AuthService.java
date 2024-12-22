package com.example.springsecurity.Service;

import com.example.springsecurity.Model.MyUser;
import com.example.springsecurity.Repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

 private final AuthRepository authRepository;


    public void registration(MyUser myUser) {
         myUser.setRole("USUR");
         String hashPassword=new BCryptPasswordEncoder().encode(myUser.getPassword());
         myUser.setPassword(hashPassword);
         authRepository.save(myUser);

    }


}
