package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessVersionModel;

public interface BusinessVersionModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessVersionModel record);

    int insertSelective(BusinessVersionModel record);

    BusinessVersionModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessVersionModel record);

    int updateByPrimaryKey(BusinessVersionModel record);
}