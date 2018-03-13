package com.snippets.dwsurvey.service.impl;

import com.snippets.dwsurvey.dao.SysEmailDao;
import com.snippets.dwsurvey.entity.SysEmail;
import com.snippets.dwsurvey.service.SysEmailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snippets.common.service.BaseServiceImpl;

@Service
public class SysEmailManagerImpl extends BaseServiceImpl<SysEmail, String> implements SysEmailManager {
	
	@Autowired
	private SysEmailDao sysEmailDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=sysEmailDao;
	}
	
}
