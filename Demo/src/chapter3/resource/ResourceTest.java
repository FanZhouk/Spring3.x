package chapter3.resource;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 本例是对Spring下的Resource接口的练习
 */
public class ResourceTest {
	/**
	 * 利用FileSystemResource访问文件系统资源
	 * 
	 * 需在F盘创建一个test.txt文件
	 */
	@Test
	public void localResource() throws Exception {
		String filePath = "F:/test.txt";
		Resource resource = new FileSystemResource(filePath);
		readResource(resource);
		BeanFactory b;
	}

	/**
	 * 利用ResourceLoader自动识别格式，访问资源
	 */
	@Test
	public void resource() throws Exception {
		// String filePath = "classpath:**/*.xml";
		// String filePath = "file:F:/MyEclipseWorkspace/**/*.xml";
		String filePath = "http://www.baidu.com";
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resources[] = resolver.getResources(filePath); // 获取资源数组

		// 输出信息
		System.out.println(resources.length);
		for (Resource r : resources) {
			System.out.println(r.getFilename());
		}
	}

	/**
	 * 读取资源文件，打印在控制台
	 */
	private void readResource(Resource resource) throws IOException {
		InputStream in = resource.getInputStream();

		byte[] buffer = new byte[16];
		int len;
		while ((len = in.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}
	}
}
