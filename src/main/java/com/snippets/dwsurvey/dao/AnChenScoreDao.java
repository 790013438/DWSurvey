package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnChenScore;
import com.snippets.dwsurvey.entity.Question;

/**
 * 矩陈评分题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenScoreDao extends BaseDao<AnChenScore, String>{

	public void findGroupStats(Question question);

}
