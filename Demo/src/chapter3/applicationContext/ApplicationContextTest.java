package chapter3.applicationContext;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import chapter3.Car;

public class ApplicationContextTest {
	/**
	 * ͨ��ʹ��ClassPathApplicationContext������xml�е���Ϣ��������
	 */
	@Test
	public void XmlApplicationContextTest() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter3/beans.xml");
		Car car = ctx.getBean("car1", Car.class);
		car.introduce();
	}

	/**
	 * ����ע�������ഴ�������ʾ��
	 */
	@Test
	public void AnnotationApplicationContext() throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car = ctx.getBean(Car.class);
		car.introduce();
	}
}
