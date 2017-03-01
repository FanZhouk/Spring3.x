package chapter6.beforeAdvice;

/**
 * 原始类，即需要被代理的类
 */
public class NaiveWaiter implements Waiter{

	public void greetTo(String name) {
		System.out.println("greet to " + name + "...");
	}

	public void serveTo(String name) {
		System.out.println("server to " + name + "...");
	}
}
