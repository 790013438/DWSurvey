package com.snippets.dwsurvey.service;

import com.snippets.common.service.BaseService;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.AnAnswer;

/**
 * 答卷业务
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

public interface AnAnswerManager extends BaseService<AnAnswer, String> {
	public AnAnswer findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
