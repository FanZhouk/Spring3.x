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
	 * �����û��������뷵���Ƿ�ƥ�䣬����1������0
	 */
	public int getMatchCount(String userName, String password) {
		String sqlStr = "SELECT count(*) FROM t_user "
				+ "WHERE user_name=? and password=?";
		return jdbcTemplate.queryForInt(sqlStr, new Object[] { userName,
				password });
	}

	/**
	 * �����û�����ȡʵ��
	 */
	public User findUserByUserName(final String userName) {
		String sqlStr = "SELECT user_id,user_name,credits FROM t_user WHERE user_name=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[] { userName },
		// �����෽ʽʵ�ֵĻص�����
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
	 * �����û���������־��Ϣ
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
