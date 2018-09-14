package com.yyjh.mapper;

import com.yyjh.pojo.RolePower;
import com.yyjh.pojo.RolePowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePowerMapper {
    long countByExample(RolePowerExample example);

    int deleteByExample(RolePowerExample example);

    int insert(RolePower record);

    int insertSelective(RolePower record);

    List<RolePower> selectByExample(RolePowerExample example);

    int updateByExampleSelective(@Param("record") RolePower record, @Param("example") RolePowerExample example);

    int updateByExample(@Param("record") RolePower record, @Param("example") RolePowerExample example);
}