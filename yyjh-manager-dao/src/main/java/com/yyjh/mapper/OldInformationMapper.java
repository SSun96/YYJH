package com.yyjh.mapper;

import com.yyjh.pojo.OldInformation;
import com.yyjh.pojo.OldInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldInformationMapper {
    long countByExample(OldInformationExample example);

    int deleteByExample(OldInformationExample example);

    int insert(OldInformation record);

    int insertSelective(OldInformation record);

    List<OldInformation> selectByExample(OldInformationExample example);

    int updateByExampleSelective(@Param("record") OldInformation record, @Param("example") OldInformationExample example);

    int updateByExample(@Param("record") OldInformation record, @Param("example") OldInformationExample example);
}