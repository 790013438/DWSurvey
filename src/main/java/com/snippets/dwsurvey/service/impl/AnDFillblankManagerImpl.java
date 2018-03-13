package com.snippets.dwsurvey.service.impl;

import java.util.List;

import com.snippets.dwsurvey.dao.AnDFillblankDao;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snippets.common.service.BaseServiceImpl;
import com.snippets.dwsurvey.entity.AnDFillblank;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.service.AnDFillblankManager;

/**
 * 多行填空题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
@Service
public class AnDFillblankManagerImpl extends BaseServiceImpl<AnDFillblank, String> implements AnDFillblankManager{

	@Autowired
	private AnDFillblankDao anDFillblankDao;

	@Override
	public void setBaseDao() {
		this.baseDao=anDFillblankDao;
	}

	//根据exam_user信息查询答案
	public List<AnDFillblank> findAnswer(String belongAnswerId,String quId){
		//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anDFillblankDao.find(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anDFillblankDao.findGroupStats(question);
	}
	
}
