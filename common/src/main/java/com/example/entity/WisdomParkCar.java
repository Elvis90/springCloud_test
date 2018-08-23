package com.example.entity;

import java.util.Date;

public class WisdomParkCar {
    private Long id;

    private String carNumber;

    private Integer stopNum;

    private Long creater;

    private Date createrTime;

    private Integer isBlack;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public Integer getStopNum() {
        return stopNum;
    }

    public void setStopNum(Integer stopNum) {
        this.stopNum = stopNum;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public Integer getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Integer isBlack) {
        this.isBlack = isBlack;
    }
}