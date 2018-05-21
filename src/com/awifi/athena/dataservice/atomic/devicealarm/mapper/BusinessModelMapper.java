package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessModel;

public interface BusinessModelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessModel record);

    int insertSelective(BusinessModel record);

    BusinessModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessModel record);

    int updateByPrimaryKey(BusinessModel record);
}