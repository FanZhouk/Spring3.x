package chapter7.aspectjXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 本例是使用AspectJ注解+编程形式（而非xml配置形式）实现的AOP
 */
public class AspectJTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter7/aspectjXml/beans.xml");
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("fanzhoukai");
	}
}
