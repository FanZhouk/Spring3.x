package chapter6.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

/**
 * 定义切面，此类的功能仅为寻找到特定的方法
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

	/**
	 * 方法匹配规则
	 */
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return "greetTo".equals(method.getName());

		// 下面这种方式添加了类筛选，功能与下面的getClassFilter完全相同
		//return "greetTo".equals(method.getName()) && Waiter.class.isAssignableFrom(targetClass);
	}

	/**
	 * 覆盖此方法，用于进行类的筛选
	 */
	@Override
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				return Waiter.class.isAssignableFrom(clazz);
			}
		};
	}
}
