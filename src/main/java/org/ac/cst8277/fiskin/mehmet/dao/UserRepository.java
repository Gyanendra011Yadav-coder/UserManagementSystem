package org.ac.cst8277.fiskin.mehmet.dao;

import org.ac.cst8277.fiskin.mehmet.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
