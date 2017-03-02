package chapter7.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 本例是定义、访问注解的hello world实例
 * 
 * 定义了一个注解NeedTest，作用是标注在方法上，指定该方法是否需要测试。
 * 最后通过反射的形式读取注解和注解中的参数值
 */
public class AnnotationTest {
	@Test
	public void annotationTest() throws Exception {
		Class<AnnotationService> clazz = AnnotationService.class;
		Method[] methods = clazz.getMethods();
		for (Method m : methods) {
			NeedTest ann = m.getAnnotation(NeedTest.class);
			if (ann != null) {
				if (ann.value())
					System.out.println(m.getName() + "方法需要测试");
				else
					System.out.println(m.getName() + "方法不需要测试");
			}
		}
	}
}
