package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 根据用户名和密码返回是否匹配，有则1，否则0
	 */
	public int getMatchCount(String userName, String password) {
		String sqlStr = "SELECT count(*) FROM t_user "
				+ "WHERE user_name=? and password=?";
		return jdbcTemplate.queryForInt(sqlStr, new Object[] { userName,
				password });
	}

	/**
	 * 根据用户名获取实体
	 */
	public User findUserByUserName(final String userName) {
		String sqlStr = "SELECT user_id,user_name,credits FROM t_user WHERE user_name=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[] { userName },
		// 匿名类方式实现的回调函数
				new RowCallbackHandler() {
					@Override
					public void processRow(ResultSet rs) throws SQLException {
						user.setUserId(rs.getInt("user_id"));
						user.setUserName(userName);
						user.setCredits(rs.getInt("credits"));
					}
				});
		return user;
	}

	/**
	 * 根据用户名更新日志信息
	 */
	public void updateLoginInfo(User user) {
		String sqlStr = "UPDATE t_user SET last_visit=?, last_ip=?, credits=? "
				+ "WHERE user_id=?";
		jdbcTemplate.update(
				sqlStr,
				new Object[] { user.getLastVisit(), user.getLastIp(),
						user.getCredits(), user.getUserId() });
	}
}
