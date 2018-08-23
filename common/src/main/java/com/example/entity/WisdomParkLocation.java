package com.example.entity;

public class WisdomParkLocation {
    private String locationId;

    private String yardId;

    private String locationNumber;

    private Integer isDevice;

    private Long deviceId;

    private Integer isPile;

    private String pileId;

    private Integer isUse;

    private Long userId;

    private Integer occupy;

    private Integer status;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId == null ? null : locationId.trim();
    }

    public String getYardId() {
        return yardId;
    }

    public void setYardId(String yardId) {
        this.yardId = yardId == null ? null : yardId.trim();
    }

    public String getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber == null ? null : locationNumber.trim();
    }

    public Integer getIsDevice() {
        return isDevice;
    }

    public void setIsDevice(Integer isDevice) {
        this.isDevice = isDevice;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getIsPile() {
        return isPile;
    }

    public void setIsPile(Integer isPile) {
        this.isPile = isPile;
    }

    public String getPileId() {
        return pileId;
    }

    public void setPileId(String pileId) {
        this.pileId = pileId == null ? null : pileId.trim();
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getOccupy() {
        return occupy;
    }

    public void setOccupy(Integer occupy) {
        this.occupy = occupy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}