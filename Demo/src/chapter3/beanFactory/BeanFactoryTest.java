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
	 * 本例通过使用XmlBeanFactory，根据xml中的信息创建一个Car对象
	 */
	@Test
	public void xmlBeanFactoryTest() throws Exception {
		// 通过ResourceLoader获取资源，不限定资源格式和来源。见3.3.2节
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:chapter3/beans.xml");
		if (res.exists()) {
			System.out.println("xml文件已找到...");

			// 利用XmlBeanFactory读取xml，并创建实例
			BeanFactory bf = new XmlBeanFactory(res);
			Car car = bf.getBean("car1", Car.class);
			car.introduce();
		} else {
			System.out.println("xml文件不存在！");
		}
	}
}
