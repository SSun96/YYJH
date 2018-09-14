package com.yyjh.mapper;

import com.yyjh.pojo.Shoushuxinxi;
import com.yyjh.pojo.ShoushuxinxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoushuxinxiMapper {
    long countByExample(ShoushuxinxiExample example);

    int deleteByExample(ShoushuxinxiExample example);

    int insert(Shoushuxinxi record);

    int insertSelective(Shoushuxinxi record);

    List<Shoushuxinxi> selectByExample(ShoushuxinxiExample example);

    int updateByExampleSelective(@Param("record") Shoushuxinxi record, @Param("example") ShoushuxinxiExample example);

    int updateByExample(@Param("record") Shoushuxinxi record, @Param("example") ShoushuxinxiExample example);
}