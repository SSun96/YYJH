package com.yyjh.mapper;

import com.yyjh.pojo.Socialworker;
import com.yyjh.pojo.SocialworkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialworkerMapper {
    long countByExample(SocialworkerExample example);

    int deleteByExample(SocialworkerExample example);

    int insert(Socialworker record);

    int insertSelective(Socialworker record);

    List<Socialworker> selectByExample(SocialworkerExample example);

    int updateByExampleSelective(@Param("record") Socialworker record, @Param("example") SocialworkerExample example);

    int updateByExample(@Param("record") Socialworker record, @Param("example") SocialworkerExample example);
}