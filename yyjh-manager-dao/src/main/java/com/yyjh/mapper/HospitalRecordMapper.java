package com.yyjh.mapper;

import com.yyjh.pojo.HospitalRecord;
import com.yyjh.pojo.HospitalRecordExample;
import com.yyjh.pojo.HospitalRecordWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalRecordMapper {
    long countByExample(HospitalRecordExample example);

    int deleteByExample(HospitalRecordExample example);

    int insert(HospitalRecordWithBLOBs record);

    int insertSelective(HospitalRecordWithBLOBs record);

    List<HospitalRecordWithBLOBs> selectByExampleWithBLOBs(HospitalRecordExample example);

    List<HospitalRecord> selectByExample(HospitalRecordExample example);

    int updateByExampleSelective(@Param("record") HospitalRecordWithBLOBs record, @Param("example") HospitalRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") HospitalRecordWithBLOBs record, @Param("example") HospitalRecordExample example);

    int updateByExample(@Param("record") HospitalRecord record, @Param("example") HospitalRecordExample example);
}