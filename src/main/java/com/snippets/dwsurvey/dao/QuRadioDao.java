package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.QuRadio;

public interface QuRadioDao extends BaseDao<QuRadio, String> {
	
	public void quOrderByIdDel1(String quId,Integer orderById);
	
}
