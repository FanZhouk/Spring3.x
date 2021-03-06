package com.baobaotao.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) // ����JUnit4��Spring���Կ��
@ContextConfiguration(locations={"/applicationContext.xml"}) // ����Spring����
public class TestUserService {

	// ע��Spring������bean
	@Autowired
	private UserService userService;
	
	// ���Է���
	@Test
	public void hasMatchUser() {
		boolean b1 = userService.hasMatchUser("admin", "123456");
		boolean b2 = userService.hasMatchUser("admin", "111111");
		assertTrue(b1);
		assertTrue(b2);
	}
	
	@Test
	public void findUserByUserName() {
		User user = userService.findUserByUserName("admin");
		assertEquals(user.getUserName(), "admin");
	}
}
