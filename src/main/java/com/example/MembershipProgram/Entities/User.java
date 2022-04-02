package com.example.MembershipProgram.Entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@AllArgsConstructor
@Table(name="users")
public class User implements UserDetails {

    @Id
    @NotNull
    @SequenceGenerator(
            name = "user",
            sequenceName = "user",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String username;

    @Column
    private String fullName;

    @Column
    private String email;

    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean locked;
    private boolean enabled;

    public Collection<? extends GrantedAuthority> getAuthorities(){
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}