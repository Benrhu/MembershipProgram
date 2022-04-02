package com.example.MembershipProgram.Controllers;

import com.example.MembershipProgram.Dto.UserDTO;
import com.example.MembershipProgram.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/register")
@AllArgsConstructor
public class UserController {

    private UserService service;

    public String register(@RequestBody UserDTO dto){
        return service.register(dto);
    }
}
