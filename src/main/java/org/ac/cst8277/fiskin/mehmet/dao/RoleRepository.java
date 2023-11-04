package org.ac.cst8277.fiskin.mehmet.dao;

import org.ac.cst8277.fiskin.mehmet.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: FinalUserManagementSystem
 */

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
