package com.snippets.dwsurvey.service.impl;

import java.util.List;

import com.snippets.dwsurvey.service.AnScoreManager;
import com.snippets.dwsurvey.dao.AnScoreDao;
import com.snippets.dwsurvey.entity.AnScore;
import com.snippets.dwsurvey.entity.Question;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snippets.common.service.BaseServiceImpl;

/**
 * 评分题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Service
public class AnScoreManagerImpl extends BaseServiceImpl<AnScore, String> implements AnScoreManager {

	@Autowired
	private AnScoreDao anScoreDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=anScoreDao;
	}

	@Override
	public List<AnScore> findAnswer(String belongAnswerId, String quId) {//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anScoreDao.find(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anScoreDao.findGroupStats(question);
	}
	
}
