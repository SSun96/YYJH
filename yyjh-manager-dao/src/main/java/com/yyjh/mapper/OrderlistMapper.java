package com.yyjh.mapper;

import com.yyjh.pojo.Orderlist;
import com.yyjh.pojo.OrderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlistMapper {
    long countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);
}