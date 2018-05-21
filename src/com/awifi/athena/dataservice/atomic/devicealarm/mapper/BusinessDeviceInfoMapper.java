package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessDeviceInfo;

public interface BusinessDeviceInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessDeviceInfo record);

    int insertSelective(BusinessDeviceInfo record);

    BusinessDeviceInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessDeviceInfo record);

    int updateByPrimaryKey(BusinessDeviceInfo record);
}