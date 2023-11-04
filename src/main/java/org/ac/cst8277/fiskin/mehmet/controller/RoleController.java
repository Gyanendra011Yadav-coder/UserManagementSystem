package org.ac.cst8277.fiskin.mehmet.controller;

import org.ac.cst8277.fiskin.mehmet.common.ResponseBean;
import org.ac.cst8277.fiskin.mehmet.common.ResponseCodeMsgs;
import org.ac.cst8277.fiskin.mehmet.entity.RoleEntity;
import org.ac.cst8277.fiskin.mehmet.service.RoleServiceImpl;
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
