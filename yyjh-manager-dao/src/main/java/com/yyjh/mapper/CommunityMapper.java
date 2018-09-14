package com.yyjh.mapper;

import com.yyjh.pojo.Community;
import com.yyjh.pojo.CommunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunityMapper {
    long countByExample(CommunityExample example);

    int deleteByExample(CommunityExample example);

    int insert(Community record);

    int insertSelective(Community record);

    List<Community> selectByExample(CommunityExample example);

    int updateByExampleSelective(@Param("record") Community record, @Param("example") CommunityExample example);

    int updateByExample(@Param("record") Community record, @Param("example") CommunityExample example);
}