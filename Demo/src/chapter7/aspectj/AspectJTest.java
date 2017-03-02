package chapter7.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * 本例是使用AspectJ注解+编程形式（而非xml配置形式）实现的AOP
 */
public class AspectJTest {
	public static void main(String[] args) {
		AspectJProxyFactory factory = new AspectJProxyFactory();
		NaiveWaiter target = new NaiveWaiter();

		// 设置目标对象
		factory.setTarget(target);
		// 添加一个切面类
		factory.addAspect(PreGreetingAspect.class);
		// 获取植入了切面的代理对象
		Waiter proxy = factory.getProxy();
		proxy.greetTo("fanzhoukai");
		proxy.serveTo("fanzhoukai");
	}
}
