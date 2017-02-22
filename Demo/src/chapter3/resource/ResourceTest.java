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
 * �����Ƕ�Spring�µ�Resource�ӿڵ���ϰ
 */
public class ResourceTest {
	/**
	 * ����FileSystemResource�����ļ�ϵͳ��Դ
	 * 
	 * ����F�̴���һ��test.txt�ļ�
	 */
	@Test
	public void localResource() throws Exception {
		String filePath = "F:/test.txt";
		Resource resource = new FileSystemResource(filePath);
		readResource(resource);
		BeanFactory b;
	}

	/**
	 * ����ResourceLoader�Զ�ʶ���ʽ��������Դ
	 */
	@Test
	public void resource() throws Exception {
		// String filePath = "classpath:**/*.xml";
		// String filePath = "file:F:/MyEclipseWorkspace/**/*.xml";
		String filePath = "http://www.baidu.com";
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resources[] = resolver.getResources(filePath); // ��ȡ��Դ����

		// �����Ϣ
		System.out.println(resources.length);
		for (Resource r : resources) {
			System.out.println(r.getFilename());
		}
	}

	/**
	 * ��ȡ��Դ�ļ�����ӡ�ڿ���̨
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
