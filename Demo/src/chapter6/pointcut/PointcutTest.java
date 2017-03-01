package chapter6.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 本例是利用Spring AOP实现的静态普通方法名匹配的实例
 * 
 * 共有两个原始类，Waiter和Seller，但在GreetingAdvisor切面中定义了仅仅针对Waiter及其子类有效，Seller类无法应用此切面
 */
public class PointcutTest {
	public static void main(String[] args) {
		String configPath = "classpath:chapter6/pointcut/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter) ctx.getBean("waiter");
		waiter.greetTo("fanzhoukai");
		Seller seller = (Seller) ctx.getBean("seller");
		seller.greetTo("fanzhoukai");
	}
}
