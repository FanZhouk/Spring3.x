package chapter3.beanFactory;

import org.junit.Test;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.Assert;

import chapter3.Car;


public class BeanFactoryTest {
	/**
	 * ����ͨ��ʹ��XmlBeanFactory������xml�е���Ϣ����һ��Car����
	 */
	@Test
	public void xmlBeanFactoryTest() throws Exception {
		// ͨ��ResourceLoader��ȡ��Դ�����޶���Դ��ʽ����Դ����3.3.2��
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:chapter3/beans.xml");
		if (res.exists()) {
			System.out.println("xml�ļ����ҵ�...");

			// ����XmlBeanFactory��ȡxml��������ʵ��
			BeanFactory bf = new XmlBeanFactory(res);
			Car car = bf.getBean("car1", Car.class);
			car.introduce();
		} else {
			System.out.println("xml�ļ������ڣ�");
		}
	}
}
