package chapter6.beforeAdviceXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 本例是使用Spring提供的方式，读取xml文件来实现前置增强
 */
public class BeforeAdviceTest {
	public static void main(String[] args) {
		String configPath = "classpath:chapter6/beforeAdviceXML/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter) ctx.getBean("waiter"); // 此处waiter与xml中bean名称对应
		waiter.greetTo("John");
		System.out.println(waiter.getClass().getSuperclass());
	}
}
