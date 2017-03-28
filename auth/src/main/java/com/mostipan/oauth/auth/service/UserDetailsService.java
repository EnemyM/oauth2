package com.mostipan.oauth.auth.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by anton on 04.03.17.
 */

@Service("userDetails")
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private Map<String, String> userDetails;

    private final String userName = "testUserName";

    public UserDetailsService() {
        userDetails = new HashMap<>();
        userDetails.put(userName, "testUserPassword");
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User(userName, userDetails.get("testUserName"), true, true, true, true, getGrantedAuthorities(userDetails));
    }

    private Collection<? extends GrantedAuthority> getGrantedAuthorities(Map<String, String> userDetails) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
    }
}
