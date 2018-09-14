package com.yyjh.mapper;

import com.yyjh.pojo.Relatives;
import com.yyjh.pojo.RelativesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelativesMapper {
    long countByExample(RelativesExample example);

    int deleteByExample(RelativesExample example);

    int insert(Relatives record);

    int insertSelective(Relatives record);

    List<Relatives> selectByExample(RelativesExample example);

    int updateByExampleSelective(@Param("record") Relatives record, @Param("example") RelativesExample example);

    int updateByExample(@Param("record") Relatives record, @Param("example") RelativesExample example);
}