package com.snippets.dwsurvey.dao;

import com.snippets.common.dao.BaseDao;
import com.snippets.dwsurvey.entity.Question;
import com.snippets.dwsurvey.entity.AnChenRadio;

/**
 * 矩陈单选题数据 interface
 * @author KeYuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 *
 */
public interface AnChenRadioDao extends BaseDao<AnChenRadio, String>{

	public void findGroupStats(Question question);

}
