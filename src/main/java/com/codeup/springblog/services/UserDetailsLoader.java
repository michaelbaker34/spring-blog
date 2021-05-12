package com.codeup.springblog.services;

import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsLoader implements UserDetailsService {
    private final UserRepo userDao;

    public UserDetailsLoader(UserRepo userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findbyUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username + " not found.");
        }
        return new UserWithRoles(user);
    }
}
