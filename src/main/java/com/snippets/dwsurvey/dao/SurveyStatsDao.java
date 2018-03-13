package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.SurveyStats;

public interface SurveyStatsDao extends BaseDao<SurveyStats, String>{

	public void findStatsDataCross(Question rowQuestion, Question colQuestion);

}
