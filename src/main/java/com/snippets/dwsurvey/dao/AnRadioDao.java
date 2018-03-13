package com.snippets.dwsurvey.dao;

import java.util.List;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.AnRadio;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.DataCross;

/**
 * 单选题 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnRadioDao extends BaseDao<AnRadio, String> {

	public void findGroupStats(Question question);

	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion);

	public List<DataCross> findStatsDataChart(Question question);

}
