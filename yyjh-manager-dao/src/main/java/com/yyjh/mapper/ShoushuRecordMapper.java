package com.yyjh.mapper;

import com.yyjh.pojo.ShoushuRecord;
import com.yyjh.pojo.ShoushuRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoushuRecordMapper {
    long countByExample(ShoushuRecordExample example);

    int deleteByExample(ShoushuRecordExample example);

    int insert(ShoushuRecord record);

    int insertSelective(ShoushuRecord record);

    List<ShoushuRecord> selectByExample(ShoushuRecordExample example);

    int updateByExampleSelective(@Param("record") ShoushuRecord record, @Param("example") ShoushuRecordExample example);

    int updateByExample(@Param("record") ShoushuRecord record, @Param("example") ShoushuRecordExample example);
}