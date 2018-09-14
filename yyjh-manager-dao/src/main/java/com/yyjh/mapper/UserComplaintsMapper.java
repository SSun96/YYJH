package com.yyjh.mapper;

import com.yyjh.pojo.UserComplaints;
import com.yyjh.pojo.UserComplaintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserComplaintsMapper {
    long countByExample(UserComplaintsExample example);

    int deleteByExample(UserComplaintsExample example);

    int insert(UserComplaints record);

    int insertSelective(UserComplaints record);

    List<UserComplaints> selectByExample(UserComplaintsExample example);

    int updateByExampleSelective(@Param("record") UserComplaints record, @Param("example") UserComplaintsExample example);

    int updateByExample(@Param("record") UserComplaints record, @Param("example") UserComplaintsExample example);
}