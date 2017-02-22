package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	@Autowired
	LoginLogDao loginLogDao;

	/**
	 * ����û������������ȷ��
	 */
	public boolean hasMatchUser(String userName, String password) {
		return userDao.getMatchCount(userName, password) > 0;
	}

	/**
	 * �����û�����ȡ�û�ʵ��
	 */
	public User findUserByUserName(String userName) {
		return userDao.findUserByUserName(userName);
	}

	/**
	 * ��¼�ɹ�����ã������û�����¼ʱ���ip������¼��־
	 */
	public void loginSuccess(User user) {
		user.setCredits(user.getCredits() + 5);
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
		userDao.updateLoginInfo(user);
		loginLogDao.insertLoginLog(loginLog);
	}
}
