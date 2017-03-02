package chapter7.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * ������ʹ��AspectJע��+�����ʽ������xml������ʽ��ʵ�ֵ�AOP
 */
public class AspectJTest {
	public static void main(String[] args) {
		AspectJProxyFactory factory = new AspectJProxyFactory();
		NaiveWaiter target = new NaiveWaiter();

		// ����Ŀ�����
		factory.setTarget(target);
		// ���һ��������
		factory.addAspect(PreGreetingAspect.class);
		// ��ȡֲ��������Ĵ������
		Waiter proxy = factory.getProxy();
		proxy.greetTo("fanzhoukai");
		proxy.serveTo("fanzhoukai");
	}
}
