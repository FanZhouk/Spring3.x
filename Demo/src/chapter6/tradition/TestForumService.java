package chapter6.tradition;

import org.junit.Test;

/**
 * �����ǲ�ʹ��AOP��ʹ�ô�ͳ��ʽ�������ܼ���ʵ��
 */
public class TestForumService {
	@Test
	public void TestService() throws Exception {
		ForumService fs = new ForumService();
		fs.insert("aaa");
		fs.delete("bbb");
	}
}
