package com.yyjh.mapper;

import com.yyjh.pojo.Oldman;
import com.yyjh.pojo.OldmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldmanMapper {
    long countByExample(OldmanExample example);

    int deleteByExample(OldmanExample example);

    int insert(Oldman record);

    int insertSelective(Oldman record);

    List<Oldman> selectByExample(OldmanExample example);

    int updateByExampleSelective(@Param("record") Oldman record, @Param("example") OldmanExample example);

    int updateByExample(@Param("record") Oldman record, @Param("example") OldmanExample example);
}