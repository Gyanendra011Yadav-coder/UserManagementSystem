package com.learning.controller;

import com.learning.common.ResponseBean;
import com.learning.common.ResponseCodeMsgs;
import com.learning.entity.RoleEntity;
import com.learning.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleServiceImpl;

    @GetMapping(path = "/getAllRoles")
    public ResponseBean<List<RoleEntity>> getAllRoles() {
        return new ResponseBean<>(ResponseCodeMsgs.SUCCESS_CODE.getValue(), ResponseCodeMsgs.SUCCESS, roleServiceImpl.getAllRoles());
    }
}
