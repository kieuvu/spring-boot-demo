package com.vukm.demo.services;

import com.vukm.demo.models.User;
import com.vukm.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author kieuvu
 * Created on 02/09/2022.
 */
@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return this.userRepository.save(user);
    }
}