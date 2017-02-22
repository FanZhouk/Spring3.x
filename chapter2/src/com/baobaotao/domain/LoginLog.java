package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录日志实体
 */
public class LoginLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer loginLogId; // 登录日志ID
	private Integer userId; // 用户ID
	private String ip; // 登录ip
	private Date loginDate; // 登录日期

	public Integer getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(Integer loginLogId) {
		this.loginLogId = loginLogId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
}
