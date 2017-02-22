package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ��¼��־ʵ��
 */
public class LoginLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer loginLogId; // ��¼��־ID
	private Integer userId; // �û�ID
	private String ip; // ��¼ip
	private Date loginDate; // ��¼����

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
