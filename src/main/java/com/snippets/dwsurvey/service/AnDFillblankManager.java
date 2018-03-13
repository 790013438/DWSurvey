package com.snippets.dwsurvey.service;

import java.util.List;

import com.snippets.common.service.BaseService;
import com.snippets.dwsurvey.entity.AnDFillblank;
import com.snippets.dwsurvey.entity.Question;

/**
 * 多项填空题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnDFillblankManager extends BaseService<AnDFillblank, String>{
	public List<AnDFillblank> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
