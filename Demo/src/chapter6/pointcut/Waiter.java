package chapter6.pointcut;

/**
 * 服务生类，只实现业务逻辑
 */
public class Waiter {
	public void greetTo(String name) {
		System.out.println("waiter greet to " + name + "...");
	}

	public void serveTo(String name) {
		System.out.println("waiter serving " + name + "...");
	}
}
