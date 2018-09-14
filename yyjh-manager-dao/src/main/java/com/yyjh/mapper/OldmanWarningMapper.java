package com.yyjh.mapper;

import com.yyjh.pojo.OldmanWarning;
import com.yyjh.pojo.OldmanWarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldmanWarningMapper {
    long countByExample(OldmanWarningExample example);

    int deleteByExample(OldmanWarningExample example);

    int insert(OldmanWarning record);

    int insertSelective(OldmanWarning record);

    List<OldmanWarning> selectByExample(OldmanWarningExample example);

    int updateByExampleSelective(@Param("record") OldmanWarning record, @Param("example") OldmanWarningExample example);

    int updateByExample(@Param("record") OldmanWarning record, @Param("example") OldmanWarningExample example);
}