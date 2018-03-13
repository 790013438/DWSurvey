package com.snippets.dwsurvey.dao;

import java.util.List;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnYesno;
import com.snippets.dwsurvey.entity.DataCross;
import com.snippets.dwsurvey.entity.Question;

/**
 * 是非题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnYesnoDao extends BaseDao<AnYesno, String>{

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion, Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
