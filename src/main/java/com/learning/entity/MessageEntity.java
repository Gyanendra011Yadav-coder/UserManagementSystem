package com.learning.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "messages")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    @Column(name = "content")
    private String content;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "userId")
    private Long userId;


    // Getters and setters

    public MessageEntity() {
    }

    public MessageEntity(Long messageId, String content, Timestamp createdAt, Long userId) {
        this.messageId = messageId;
        this.content = content;
        this.createdAt = createdAt;
        this.userId = userId;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUser() {
        return userId;
    }

    public void setUser(Long user) {
        this.userId = user;
    }
}
