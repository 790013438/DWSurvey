package com.snippets.dwsurvey.dao;

import java.util.Map;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.SurveyStats;
import com.snippets.dwsurvey.entity.SurveyAnswer;

public interface SurveyAnswerDao extends BaseDao<SurveyAnswer, String>{

	public void saveAnswer(SurveyAnswer surveyAnswer,
			Map<String, Map<String, Object>> quMaps);

	public SurveyStats surveyStatsData(SurveyStats surveyStats);
}
