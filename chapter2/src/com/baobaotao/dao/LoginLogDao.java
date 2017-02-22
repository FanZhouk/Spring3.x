package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;

@Repository
public class LoginLogDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insertLoginLog(LoginLog log) {
		String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) "
				+ " VALUES(?,?,?)";
		Object[] args = { log.getUserId(), log.getIp(), log.getLoginDate() };
		jdbcTemplate.update(sqlStr, args);
	}
}
