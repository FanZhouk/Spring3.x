package chapter6.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

/**
 * �������棬����Ĺ��ܽ�ΪѰ�ҵ��ض��ķ���
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

	/**
	 * ����ƥ�����
	 */
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return "greetTo".equals(method.getName());

		// �������ַ�ʽ�������ɸѡ�������������getClassFilter��ȫ��ͬ
		//return "greetTo".equals(method.getName()) && Waiter.class.isAssignableFrom(targetClass);
	}

	/**
	 * ���Ǵ˷��������ڽ������ɸѡ
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
