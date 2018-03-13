package com.snippets.dwsurvey.dao.impl;

import com.snippets.dwsurvey.dao.SurveyDirectoryDao;
import org.springframework.stereotype.Repository;

import com.snippets.common.dao.BaseDaoImpl;
import com.snippets.dwsurvey.entity.SurveyDirectory;

/**
 * 问卷目录 dao
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

//@Repository("surveyDirectoryDao")
@Repository
public class SurveyDirectoryDaoImpl extends BaseDaoImpl<SurveyDirectory, String> implements SurveyDirectoryDao {
	
}
