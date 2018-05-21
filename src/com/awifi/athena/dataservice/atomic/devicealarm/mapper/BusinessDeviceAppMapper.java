package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessDeviceApp;

public interface BusinessDeviceAppMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessDeviceApp record);

    int insertSelective(BusinessDeviceApp record);

    BusinessDeviceApp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessDeviceApp record);

    int updateByPrimaryKey(BusinessDeviceApp record);
}