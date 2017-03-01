package chapter6.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����������Spring AOPʵ�ֵľ�̬��ͨ������ƥ���ʵ��
 * 
 * ��������ԭʼ�࣬Waiter��Seller������GreetingAdvisor�����ж����˽������Waiter����������Ч��Seller���޷�Ӧ�ô�����
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
