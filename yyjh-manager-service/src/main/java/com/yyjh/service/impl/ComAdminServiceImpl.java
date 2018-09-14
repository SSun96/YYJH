package com.yyjh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyjh.mapper.ComAdminMapper;
import com.yyjh.pojo.ComAdmin;
import com.yyjh.pojo.ComAdminExample;
import com.yyjh.service.ComAdminService;

@Service
public class ComAdminServiceImpl implements ComAdminService{
	@Autowired
	private ComAdminMapper comAdminmMpper;

	@Override
	public List<ComAdmin> selectByExample(String cadmin) {
		ComAdminExample cae = new ComAdminExample();
		ComAdminExample.Criteria criteria = cae.createCriteria();
		criteria.andComAdminEqualTo(cadmin);
		cae.setOrderByClause("cadmin desc");
		List<ComAdmin> users = comAdminmMpper.selectByExample(cae);
		return users;
	}


}
