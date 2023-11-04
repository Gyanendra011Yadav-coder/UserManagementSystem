package org.ac.cst8277.fiskin.mehmet.service;

import org.ac.cst8277.fiskin.mehmet.dao.RoleRepository;
import org.ac.cst8277.fiskin.mehmet.entity.RoleEntity;
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
