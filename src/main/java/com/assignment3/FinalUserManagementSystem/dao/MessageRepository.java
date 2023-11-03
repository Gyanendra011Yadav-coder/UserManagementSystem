package com.assignment3.FinalUserManagementSystem.dao;

import com.assignment3.FinalUserManagementSystem.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: FinalUserManagementSystem
 */

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

    List<MessageEntity> findAllMessageByUserId(long userId);
}
