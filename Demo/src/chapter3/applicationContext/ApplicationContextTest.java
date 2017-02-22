package chapter3.applicationContext;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter3.Car;

public class ApplicationContextTest {
	/**
	 * 通过使用ClassPathApplicationContext，根据xml中的信息创建对象
	 */
	@Test
	public void XmlApplicationContextTest() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter3/beans.xml");
		Car car = ctx.getBean("car1", Car.class);
		car.introduce();
	}

	/**
	 * 利用注解配置类创建对象的示例
	 */
	@Test
	public void AnnotationApplicationContext() throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car = ctx.getBean(Car.class);
		car.introduce();
	}
}
