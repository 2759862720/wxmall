package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessApp;

public interface BusinessAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessApp record);

    int insertSelective(BusinessApp record);

    BusinessApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessApp record);

    int updateByPrimaryKey(BusinessApp record);
}