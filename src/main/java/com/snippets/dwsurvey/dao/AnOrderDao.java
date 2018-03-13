package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnOrder;
import com.snippets.dwsurvey.entity.Question;

/**
 * 排序题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnOrderDao extends BaseDao<AnOrder, String>{

	public void findGroupStats(Question question);
	
}
