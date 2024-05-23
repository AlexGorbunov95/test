//package ru.kata.spring.boot_security.demo.services;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import ru.kata.spring.boot_security.demo.models.User;
//
//import javax.transaction.Transactional;
//
//public class UserDetaildService {
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User is not found!");
//        }
//        return user;
//
//    }
//}
