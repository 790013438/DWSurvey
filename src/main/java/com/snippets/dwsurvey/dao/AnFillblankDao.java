package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnFillblank;
import com.snippets.dwsurvey.entity.Question;

/**
 * 填空题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnFillblankDao extends BaseDao<AnFillblank, String>{

	public void findGroupStats(Question question);

}
