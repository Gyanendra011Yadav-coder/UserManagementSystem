package com.assignment3.FinalUserManagementSystem.service;

import com.assignment3.FinalUserManagementSystem.dao.MessageRepository;
import com.assignment3.FinalUserManagementSystem.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: FinalUserManagementSystem
 */
@Service
public class MessageServiceImpl {

    @Autowired
    MessageRepository messageRepository;

    public List<MessageEntity> fetchAllMessages() {
        return messageRepository.findAll();
    }

    public List<MessageEntity> fetchMessageById(long userId) {
        return messageRepository.findAllMessageByUserId(userId);
    }
}
