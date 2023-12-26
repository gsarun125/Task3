package com.example.myapplication.Models;

public class MessageModel {
    String uId, message, messageId,UserName;
    Long timestamp;





    public MessageModel(String uId, String message,String userName) {
        this.uId = uId;
        this.message = message;
        this.UserName=userName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public MessageModel() {

    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
    public void getuId(String uId) {
        this.uId = uId;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
