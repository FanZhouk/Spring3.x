package chapter4.ioc;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import chapter4.Car;

public class IoCTest {

	/**
	 * 本例是利用属性注入的方式（即容器调用setter方法）实现依赖注入
	 * 
	 * 与chapter3.beanFactory.BeanFactoryTest.xmlBeanFactoryTest()很相似，
	 * 只是xml文件的格式有所区别
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
