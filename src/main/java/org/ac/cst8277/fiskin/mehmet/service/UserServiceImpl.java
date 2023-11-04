package org.ac.cst8277.fiskin.mehmet.service;

import org.ac.cst8277.fiskin.mehmet.dao.UserRepository;
import org.ac.cst8277.fiskin.mehmet.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: FinalUserManagementSystem
 */
@Service
public class UserServiceImpl {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public void saveUserDetails(UserEntity user) {
        userRepository.save(user);
    }

    public List<UserEntity> testingAPI() {
        long id = 789987984L;
        return List.of(new UserEntity(id, "Gyanendra Yadav", "gyanu011yadav@gmail.com", "ghjk56789"),
                new UserEntity(id + 1, "Mnaya Sing", "manyaSingh@gmail.com", "56789fghjk"));
    }
}
