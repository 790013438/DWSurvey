package com.snippets.dwsurvey.service;

import java.util.List;

import com.snippets.common.service.BaseService;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.AnChenCheckbox;

/**
 * 矩陈多选题业务
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */

public interface AnChenCheckboxManager extends BaseService<AnChenCheckbox, String> {
	public List<AnChenCheckbox> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
