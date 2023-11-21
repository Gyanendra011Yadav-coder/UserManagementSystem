package com.learning.controller;

import com.learning.common.ResponseBean;
import com.learning.common.ResponseCodeMsgs;
import com.learning.entity.UserEntity;
import com.learning.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/getUsersTest")
    public List<UserEntity> testing() {
        return userServiceImpl.testingAPI();
    }

    @GetMapping(path = "/getUsers")
    public ResponseBean<List<UserEntity>> getAllUsers() {
        return new ResponseBean<>(ResponseCodeMsgs.SUCCESS_CODE.getValue(), ResponseCodeMsgs.SUCCESS, userServiceImpl.getAllUsers());
    }

    @PostMapping(path = "/addUsers", headers = "Accept=application/json")
    public ResponseBean addUser(@RequestBody UserEntity user) {
        userServiceImpl.saveUserDetails(user);
        return new ResponseBean<>(ResponseCodeMsgs.SUCCESS_CODE.getValue(), ResponseCodeMsgs.DATA_SAVED_SUCCESSFULLY, user);
    }

}