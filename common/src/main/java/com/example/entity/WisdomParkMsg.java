package com.example.entity;

public class WisdomParkMsg {
    private Long id;

    private String msg;

    private Integer status;

    private Integer msgObject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMsgObject() {
        return msgObject;
    }

    public void setMsgObject(Integer msgObject) {
        this.msgObject = msgObject;
    }
}