package com.yyjh.mapper;

import com.yyjh.pojo.Complaints;
import com.yyjh.pojo.ComplaintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintsMapper {
    long countByExample(ComplaintsExample example);

    int deleteByExample(ComplaintsExample example);

    int insert(Complaints record);

    int insertSelective(Complaints record);

    List<Complaints> selectByExample(ComplaintsExample example);

    int updateByExampleSelective(@Param("record") Complaints record, @Param("example") ComplaintsExample example);

    int updateByExample(@Param("record") Complaints record, @Param("example") ComplaintsExample example);
}