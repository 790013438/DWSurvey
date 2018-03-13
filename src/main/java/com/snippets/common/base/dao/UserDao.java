package com.snippets.common.base.dao;

import com.snippets.common.base.entity.User;
import com.snippets.common.dao.BaseDao;
import com.snippets.common.plugs.page.Page;


/**
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public interface UserDao extends BaseDao<User, String> {

	public void resetUserGroup(String groupId);
	
}
