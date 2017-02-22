package chapter4.ioc;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import chapter4.Car;

public class IoCTest {

	/**
	 * ��������������ע��ķ�ʽ������������setter������ʵ������ע��
	 * 
	 * ��chapter3.beanFactory.BeanFactoryTest.xmlBeanFactoryTest()�����ƣ�
	 * ֻ��xml�ļ��ĸ�ʽ��������
	 */
	@Test
	public void AttributeIoC() throws Exception {
		ResourceLoader loader = new PathMatchingResourcePatternResolver();
		Resource res = loader.getResource("classpath:chapter4/beans.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);
		Car car = factory.getBean("attributeCar", Car.class);

		car.introduce();
	}

	public static void main(String[] args) {
		ResourceLoader loader = new PathMatchingResourcePatternResolver();
		Resource res = loader.getResource("classpath:chapter4/beans.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);
		Car car = factory.getBean("constructorCar", Car.class);

		car.introduce();
	}
}
