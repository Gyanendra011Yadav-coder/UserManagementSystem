package com.assignment3.FinalUserManagementSystem.controller;

import com.assignment3.FinalUserManagementSystem.common.ResponseBean;
import com.assignment3.FinalUserManagementSystem.common.ResponseCodeMsgs;
import com.assignment3.FinalUserManagementSystem.entity.MessageEntity;
import com.assignment3.FinalUserManagementSystem.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageServiceImpl messageService;


    @GetMapping(path = "/getAllMessages")
    public ResponseBean<List<MessageEntity>> getAllMessages() {
        return new ResponseBean<>(ResponseCodeMsgs.SUCCESS_CODE.getValue(), ResponseCodeMsgs.SUCCESS, messageService.fetchAllMessages());
    }

    @GetMapping("/messagesByProducerId")
    public ResponseBean<List<MessageEntity>> getMessagesWithAuthors(@RequestParam int producerId) {
        return new ResponseBean<>(ResponseCodeMsgs.SUCCESS_CODE.getValue(), ResponseCodeMsgs.SUCCESS, messageService.fetchMessageById(producerId));
    }

}
