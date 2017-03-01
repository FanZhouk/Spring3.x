package chapter6.pointcut;

/**
 * 销售员类，只实现业务逻辑
 */
public class Seller {
	public void greetTo(String name) {
		System.out.println("seller greet to " + name + "...");
	}
}
