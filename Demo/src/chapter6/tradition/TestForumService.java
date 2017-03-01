package chapter6.tradition;

import org.junit.Test;

/**
 * 本例是不使用AOP，使用传统方式进行性能检测的实例
 */
public class TestForumService {
	@Test
	public void TestService() throws Exception {
		ForumService fs = new ForumService();
		fs.insert("aaa");
		fs.delete("bbb");
	}
}
