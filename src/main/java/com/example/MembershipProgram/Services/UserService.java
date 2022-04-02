package com.example.MembershipProgram.Services;

import com.example.MembershipProgram.Dto.UserDTO;
import com.example.MembershipProgram.Entities.User;
import com.example.MembershipProgram.Repositories.UserRepository;
import com.example.MembershipProgram.Security.HasheablePass;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private List<User> user;

    @Autowired
    private UserRepository repo;

    private final String USER_NOT_FOUND = "Doesn't exists users with this email.";


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND, email)));
    }

    // @Autowired
    // private HasheablePass encode;

    public String register(UserDTO dto){
        // if is correct
        return "Registered";
    }

    public String login(){

        // if is correct
        System.out.println("¡Login successful!");

        // if is wrong
        System.out.println("You are not a member oir community. for  join with us, let's register(link)");

        return null;
    }

    public String deleteUser(){
        return null;
    }
}
