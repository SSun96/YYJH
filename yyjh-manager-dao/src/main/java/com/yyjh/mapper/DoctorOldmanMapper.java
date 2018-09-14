package com.yyjh.mapper;

import com.yyjh.pojo.DoctorOldman;
import com.yyjh.pojo.DoctorOldmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorOldmanMapper {
    long countByExample(DoctorOldmanExample example);

    int deleteByExample(DoctorOldmanExample example);

    int insert(DoctorOldman record);

    int insertSelective(DoctorOldman record);

    List<DoctorOldman> selectByExample(DoctorOldmanExample example);

    int updateByExampleSelective(@Param("record") DoctorOldman record, @Param("example") DoctorOldmanExample example);

    int updateByExample(@Param("record") DoctorOldman record, @Param("example") DoctorOldmanExample example);
}