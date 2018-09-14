package com.yyjh.mapper;

import com.yyjh.pojo.OldmanInformation;
import com.yyjh.pojo.OldmanInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldmanInformationMapper {
    long countByExample(OldmanInformationExample example);

    int deleteByExample(OldmanInformationExample example);

    int insert(OldmanInformation record);

    int insertSelective(OldmanInformation record);

    List<OldmanInformation> selectByExample(OldmanInformationExample example);

    int updateByExampleSelective(@Param("record") OldmanInformation record, @Param("example") OldmanInformationExample example);

    int updateByExample(@Param("record") OldmanInformation record, @Param("example") OldmanInformationExample example);
}