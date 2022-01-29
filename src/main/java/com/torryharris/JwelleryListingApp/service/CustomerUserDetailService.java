package com.torryharris.JwelleryListingApp.service;

import com.torryharris.JwelleryListingApp.model.CustomerUserDetails;
import com.torryharris.JwelleryListingApp.model.User;
import com.torryharris.JwelleryListingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmail(username);
        user.orElseThrow(() -> new UsernameNotFoundException("User is not found in our database please register!"));
        return user.map(CustomerUserDetails::new).get();
    }
}
