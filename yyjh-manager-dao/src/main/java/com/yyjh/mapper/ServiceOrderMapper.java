package com.yyjh.mapper;

import com.yyjh.pojo.ServiceOrder;
import com.yyjh.pojo.ServiceOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceOrderMapper {
    long countByExample(ServiceOrderExample example);

    int deleteByExample(ServiceOrderExample example);

    int insert(ServiceOrder record);

    int insertSelective(ServiceOrder record);

    List<ServiceOrder> selectByExample(ServiceOrderExample example);

    int updateByExampleSelective(@Param("record") ServiceOrder record, @Param("example") ServiceOrderExample example);

    int updateByExample(@Param("record") ServiceOrder record, @Param("example") ServiceOrderExample example);
}