package org.ac.cst8277.fiskin.mehmet.entity;

import javax.persistence.*;


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

