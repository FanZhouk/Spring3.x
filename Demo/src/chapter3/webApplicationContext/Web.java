package chapter3.webApplicationContext;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class Web {
	@Test
	public void ddd() throws Exception {
		//ResourceLoader loader = new PathMatchingResourcePatternResolver();
		ResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
		Resource res = loader.getResource("classpath*:/chapter3/Car.java");
		System.out.println(res.exists());
	}
}
