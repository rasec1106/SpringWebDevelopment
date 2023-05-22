/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiAuth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiAuth.Dao.UserRepository;
import pe.cibertec.ecommerce.ApiAuth.Entity.User;

/**
 *
 * @author Cesar.Herrera
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).get();
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName).get();
    }

    @Override
    public User findByUserNameOrEmail(String userName, String email) {
        return userRepository.findByUserNameOrEmail(userName, email).get();
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email).get();
    }

    @Override
    public Boolean existsByUserName(String userName) {
        return userRepository.existsByUserName(userName).get();
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
    
}
