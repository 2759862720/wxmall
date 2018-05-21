package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.CustomerApp;

public interface BusinessCustomerAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerApp record);

    int insertSelective(CustomerApp record);

    CustomerApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerApp record);

    int updateByPrimaryKey(CustomerApp record);
}