package chapter6.beforeAdvice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 本例是利用Java代码实现的前置增强
 * 
 * 通过继承类MethodBeforeAdvice，并实现其before()方法，在方法内写入通用的方法前执行的逻辑即可
 * 注意需要导包com.springsource.org.aopalliance-1.0.0.jar，否则会报错
 */
public class BeforeAdviceTest {
	public static void main(String[] args) {
		Waiter target = new NaiveWaiter();
		BeforeAdvice advice = new GreetingBeforeAdvice();
		// 代理工厂
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvice(advice);

		Waiter proxy = (Waiter) pf.getProxy();
		proxy.greetTo("John");
		proxy.serveTo("Tom");
	}
}
