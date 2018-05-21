package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessVersion;

public interface BusinessVersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessVersion record);

    int insertSelective(BusinessVersion record);

    BusinessVersion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessVersion record);

    int updateByPrimaryKey(BusinessVersion record);
}