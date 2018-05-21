package com.awifi.athena.dataservice.atomic.devicealarm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BusinessDeviceInfo {
    private Long id;

    private String deviceId;

    private Long adminuserId;

    private Long broadbandAccountId;

    private Boolean online;

    private Integer acquisitionfrequency;

    private String deviceKey;

    private String deviceType;

    private String deviceName;

    private Long corporationId;

    private Long modelId;

    private String protocolCode;

    private String pinCode;

    private String ipAddr;

    private String macAddr;

    private Integer province;

    private Integer city;

    private Integer county;

    private BigDecimal xpos;

    private BigDecimal ypos;

    private Date bindDate;

    private Integer status;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Long getAdminuserId() {
        return adminuserId;
    }

    public void setAdminuserId(Long adminuserId) {
        this.adminuserId = adminuserId;
    }

    public Long getBroadbandAccountId() {
        return broadbandAccountId;
    }

    public void setBroadbandAccountId(Long broadbandAccountId) {
        this.broadbandAccountId = broadbandAccountId;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Integer getAcquisitionfrequency() {
        return acquisitionfrequency;
    }

    public void setAcquisitionfrequency(Integer acquisitionfrequency) {
        this.acquisitionfrequency = acquisitionfrequency;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey == null ? null : deviceKey.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public Long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getProtocolCode() {
        return protocolCode;
    }

    public void setProtocolCode(String protocolCode) {
        this.protocolCode = protocolCode == null ? null : protocolCode.trim();
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode == null ? null : pinCode.trim();
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr == null ? null : macAddr.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public BigDecimal getXpos() {
        return xpos;
    }

    public void setXpos(BigDecimal xpos) {
        this.xpos = xpos;
    }

    public BigDecimal getYpos() {
        return ypos;
    }

    public void setYpos(BigDecimal ypos) {
        this.ypos = ypos;
    }

    public Date getBindDate() {
        return bindDate;
    }

    public void setBindDate(Date bindDate) {
        this.bindDate = bindDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}