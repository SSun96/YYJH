package com.yyjh.mapper;

import com.yyjh.pojo.Yongyaoxinxi;
import com.yyjh.pojo.YongyaoxinxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YongyaoxinxiMapper {
    long countByExample(YongyaoxinxiExample example);

    int deleteByExample(YongyaoxinxiExample example);

    int insert(Yongyaoxinxi record);

    int insertSelective(Yongyaoxinxi record);

    List<Yongyaoxinxi> selectByExample(YongyaoxinxiExample example);

    int updateByExampleSelective(@Param("record") Yongyaoxinxi record, @Param("example") YongyaoxinxiExample example);

    int updateByExample(@Param("record") Yongyaoxinxi record, @Param("example") YongyaoxinxiExample example);
}