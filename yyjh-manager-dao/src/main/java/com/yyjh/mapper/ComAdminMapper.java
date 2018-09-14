package com.yyjh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yyjh.pojo.ComAdmin;
import com.yyjh.pojo.ComAdminExample;

public interface ComAdminMapper {
	long countByExample(ComAdminExample example); //根据条件查询数量

    int deleteByExample(ComAdminExample example);//根据条件删除数据
    
    //int deleteByPrimaryKey(Integer id); //根据主键删除数据
    
    int insert(ComAdmin record);  //插入数据（1条）

    int insertSelective(ComAdmin record); //插入数据（插入一跳数据，只插入不为null的数据）

    List<ComAdmin> selectByExample(ComAdminExample example);  //根据条件查询数据
    
    /**
     * 示例：
     * public List<BUser> getList() {
     * BUserExample userExample = new BUserExample();
     * BUserExample.Criteria criteria = userExample.createCriteria();
     * criteria.andUsernameEqualTo("fan");
     * userExample.setOrderByClause("username desc");
     * List<BUser> users = userMapper.selectByExample(userExample);
     * return users;
     * }
     * 相当于：select * from user where username = 'fan' order by username desc
     */

    
    int updateByExampleSelective(@Param("record") ComAdmin record, @Param("example") ComAdminExample example);
    //按条件更新值不为null的字段

    int updateByExample(@Param("record") ComAdmin record, @Param("example") ComAdminExample example);
    //按条件更新
}
