package com.snippets.dwsurvey.service;

import java.util.List;

import com.snippets.common.service.BaseService;
import com.snippets.dwsurvey.entity.AnScore;
import com.snippets.dwsurvey.entity.Question;

/**
 * 评分题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnScoreManager extends BaseService<AnScore, String>{
	public List<AnScore>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
