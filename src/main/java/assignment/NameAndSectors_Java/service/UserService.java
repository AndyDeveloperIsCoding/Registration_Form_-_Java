package assignment.NameAndSectors_Java.service;

import assignment.NameAndSectors_Java.entity.User;
import assignment.NameAndSectors_Java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean existsByName(String name) {
        return userRepository.existsByName(name);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}