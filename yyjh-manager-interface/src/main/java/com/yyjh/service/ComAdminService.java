package com.yyjh.service;

import java.util.List;

import com.yyjh.pojo.ComAdmin;
import com.yyjh.pojo.ComAdminExample;

public interface ComAdminService {
	public List<ComAdmin> selectByExample(String cadmin);
}
