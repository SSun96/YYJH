package com.yyjh.mapper;

import com.yyjh.pojo.RelativeOldman;
import com.yyjh.pojo.RelativeOldmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelativeOldmanMapper {
    long countByExample(RelativeOldmanExample example);

    int deleteByExample(RelativeOldmanExample example);

    int insert(RelativeOldman record);

    int insertSelective(RelativeOldman record);

    List<RelativeOldman> selectByExample(RelativeOldmanExample example);

    int updateByExampleSelective(@Param("record") RelativeOldman record, @Param("example") RelativeOldmanExample example);

    int updateByExample(@Param("record") RelativeOldman record, @Param("example") RelativeOldmanExample example);
}