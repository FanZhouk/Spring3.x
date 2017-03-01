package chapter6.beforeAdviceXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ������ʹ��Spring�ṩ�ķ�ʽ����ȡxml�ļ���ʵ��ǰ����ǿ
 */
public class BeforeAdviceTest {
	public static void main(String[] args) {
		String configPath = "classpath:chapter6/beforeAdviceXML/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter) ctx.getBean("waiter"); // �˴�waiter��xml��bean���ƶ�Ӧ
		waiter.greetTo("John");
		System.out.println(waiter.getClass().getSuperclass());
	}
}
