package com.yyjh.mapper;

import com.yyjh.pojo.Warning;
import com.yyjh.pojo.WarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarningMapper {
    long countByExample(WarningExample example);

    int deleteByExample(WarningExample example);

    int insert(Warning record);

    int insertSelective(Warning record);

    List<Warning> selectByExample(WarningExample example);

    int updateByExampleSelective(@Param("record") Warning record, @Param("example") WarningExample example);

    int updateByExample(@Param("record") Warning record, @Param("example") WarningExample example);
}