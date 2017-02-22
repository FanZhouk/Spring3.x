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
	 * 检查用户名、密码的正确性
	 */
	public boolean hasMatchUser(String userName, String password) {
		return userDao.getMatchCount(userName, password) > 0;
	}

	/**
	 * 根据用户名获取用户实体
	 */
	public User findUserByUserName(String userName) {
		return userDao.findUserByUserName(userName);
	}

	/**
	 * 登录成功后调用，更新用户最后登录时间和ip，并记录日志
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
