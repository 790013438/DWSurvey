package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.AnChenCheckbox;

/**
 * 矩陈多选题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenCheckboxDao extends BaseDao<AnChenCheckbox, String>{

	public void findGroupStats(Question question);

}
