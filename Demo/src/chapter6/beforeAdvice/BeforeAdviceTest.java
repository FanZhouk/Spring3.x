package chapter6.beforeAdvice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * ����������Java����ʵ�ֵ�ǰ����ǿ
 * 
 * ͨ���̳���MethodBeforeAdvice����ʵ����before()�������ڷ�����д��ͨ�õķ���ǰִ�е��߼�����
 * ע����Ҫ����com.springsource.org.aopalliance-1.0.0.jar������ᱨ��
 */
public class BeforeAdviceTest {
	public static void main(String[] args) {
		Waiter target = new NaiveWaiter();
		BeforeAdvice advice = new GreetingBeforeAdvice();
		// ������
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvice(advice);

		Waiter proxy = (Waiter) pf.getProxy();
		proxy.greetTo("John");
		proxy.serveTo("Tom");
	}
}
