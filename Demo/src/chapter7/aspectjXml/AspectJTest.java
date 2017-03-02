package chapter7.aspectjXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ������ʹ��AspectJע��+�����ʽ������xml������ʽ��ʵ�ֵ�AOP
 */
public class AspectJTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter7/aspectjXml/beans.xml");
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("fanzhoukai");
	}
}
