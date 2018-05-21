package com.awifi.athena.dataservice.atomic.devicealarm.mapper;

import com.awifi.athena.dataservice.atomic.devicealarm.entity.BusinessCorporation;

public interface BusinessCorporationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessCorporation record);

    int insertSelective(BusinessCorporation record);

    BusinessCorporation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessCorporation record);

    int updateByPrimaryKey(BusinessCorporation record);
}