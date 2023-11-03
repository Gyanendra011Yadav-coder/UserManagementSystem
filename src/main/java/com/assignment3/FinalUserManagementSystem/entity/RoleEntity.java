package com.assignment3.FinalUserManagementSystem.entity;

import javax.persistence.*;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: FinalUserManagementSystem
 */

@Entity
@Table(name = "roles")
public class RoleEntity {
    @Id
    @Column(name = "roleId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Column(name = "roleName")
    private String roleName;

    // Getters and setters
    public RoleEntity(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public RoleEntity() {
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}

