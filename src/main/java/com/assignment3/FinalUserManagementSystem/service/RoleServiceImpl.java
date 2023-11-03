package com.assignment3.FinalUserManagementSystem.service;

import com.assignment3.FinalUserManagementSystem.dao.RoleRepository;
import com.assignment3.FinalUserManagementSystem.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl {

    @Autowired
    RoleRepository roleRepository;

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

}
