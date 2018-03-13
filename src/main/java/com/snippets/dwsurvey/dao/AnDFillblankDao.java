package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnDFillblank;
import com.snippets.dwsurvey.entity.Question;

/**
 * 多项填空题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnDFillblankDao extends BaseDao<AnDFillblank, String>{

	public void findGroupStats(Question question);

}
