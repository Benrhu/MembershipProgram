package com.example.MembershipProgram.Dto;

import com.example.MembershipProgram.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDTO {

    private Long Id;
    private String username;
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private boolean locked;
    private boolean enabled;

}
