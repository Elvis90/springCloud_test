package com.example.entity;

import java.util.Date;

public class WisdomParkAlarm {
    private Long id;

    private String alarmObj;

    private String alarmId;

    private Date alarmTime;

    private Integer type;

    private Long userId;

    private Long alarmRuleId;

    private String alarmRule;

    private String locationId;

    private String pushObj;

    private Integer companyId;

    private String yardId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlarmObj() {
        return alarmObj;
    }

    public void setAlarmObj(String alarmObj) {
        this.alarmObj = alarmObj == null ? null : alarmObj.trim();
    }

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId == null ? null : alarmId.trim();
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public String getAlarmRule() {
        return alarmRule;
    }

    public void setAlarmRule(String alarmRule) {
        this.alarmRule = alarmRule == null ? null : alarmRule.trim();
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId == null ? null : locationId.trim();
    }

    public String getPushObj() {
        return pushObj;
    }

    public void setPushObj(String pushObj) {
        this.pushObj = pushObj == null ? null : pushObj.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getYardId() {
        return yardId;
    }

    public void setYardId(String yardId) {
        this.yardId = yardId == null ? null : yardId.trim();
    }
}