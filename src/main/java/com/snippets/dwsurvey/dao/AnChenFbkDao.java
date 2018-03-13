package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnChenFbk;
import com.snippets.dwsurvey.entity.Question;

/**
 * 矩陈填空题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenFbkDao extends BaseDao<AnChenFbk, String>{

	void findGroupStats(Question question);
	
}
