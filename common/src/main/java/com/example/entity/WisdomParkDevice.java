package com.example.entity;

import java.util.Date;

public class WisdomParkDevice {
    private Long deviceId;

    private String deviceSn;

    private Integer status;

    private Integer deviceType;

    private Integer offlineStatus;

    private Integer electricity;

    private Integer bindStatus;

    private String locationId;

    private Integer isUse;

    private Long nbDeviceId;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String maintenanceMan;

    private String maintenanceManTel;

    private String deviceImei;

    private String deviceImsi;

    private String deviceName;

    private Integer csq;

    private Integer companyId;

    private String companyName;

    private String yardId;

    private Date lastConnectTime;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn == null ? null : deviceSn.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getOfflineStatus() {
        return offlineStatus;
    }

    public void setOfflineStatus(Integer offlineStatus) {
        this.offlineStatus = offlineStatus;
    }

    public Integer getElectricity() {
        return electricity;
    }

    public void setElectricity(Integer electricity) {
        this.electricity = electricity;
    }

    public Integer getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(Integer bindStatus) {
        this.bindStatus = bindStatus;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId == null ? null : locationId.trim();
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Long getNbDeviceId() {
        return nbDeviceId;
    }

    public void setNbDeviceId(Long nbDeviceId) {
        this.nbDeviceId = nbDeviceId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMaintenanceMan() {
        return maintenanceMan;
    }

    public void setMaintenanceMan(String maintenanceMan) {
        this.maintenanceMan = maintenanceMan == null ? null : maintenanceMan.trim();
    }

    public String getMaintenanceManTel() {
        return maintenanceManTel;
    }

    public void setMaintenanceManTel(String maintenanceManTel) {
        this.maintenanceManTel = maintenanceManTel == null ? null : maintenanceManTel.trim();
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei == null ? null : deviceImei.trim();
    }

    public String getDeviceImsi() {
        return deviceImsi;
    }

    public void setDeviceImsi(String deviceImsi) {
        this.deviceImsi = deviceImsi == null ? null : deviceImsi.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public Integer getCsq() {
        return csq;
    }

    public void setCsq(Integer csq) {
        this.csq = csq;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getYardId() {
        return yardId;
    }

    public void setYardId(String yardId) {
        this.yardId = yardId == null ? null : yardId.trim();
    }

    public Date getLastConnectTime() {
        return lastConnectTime;
    }

    public void setLastConnectTime(Date lastConnectTime) {
        this.lastConnectTime = lastConnectTime;
    }
}