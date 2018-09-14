package com.yyjh.mapper;

import com.yyjh.pojo.Zhuyuanxinxi;
import com.yyjh.pojo.ZhuyuanxinxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhuyuanxinxiMapper {
    long countByExample(ZhuyuanxinxiExample example);

    int deleteByExample(ZhuyuanxinxiExample example);

    int insert(Zhuyuanxinxi record);

    int insertSelective(Zhuyuanxinxi record);

    List<Zhuyuanxinxi> selectByExample(ZhuyuanxinxiExample example);

    int updateByExampleSelective(@Param("record") Zhuyuanxinxi record, @Param("example") ZhuyuanxinxiExample example);

    int updateByExample(@Param("record") Zhuyuanxinxi record, @Param("example") ZhuyuanxinxiExample example);
}