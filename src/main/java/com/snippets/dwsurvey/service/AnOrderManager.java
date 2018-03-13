package com.snippets.dwsurvey.service;

import java.util.List;

import com.snippets.common.service.BaseService;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.AnOrder;

/**
 * 排序题
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface AnOrderManager extends BaseService<AnOrder, String>{
	public List<AnOrder>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
