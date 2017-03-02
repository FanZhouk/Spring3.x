package chapter7.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * �����Ƕ��塢����ע���hello worldʵ��
 * 
 * ������һ��ע��NeedTest�������Ǳ�ע�ڷ����ϣ�ָ���÷����Ƿ���Ҫ���ԡ�
 * ���ͨ���������ʽ��ȡע���ע���еĲ���ֵ
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
					System.out.println(m.getName() + "������Ҫ����");
				else
					System.out.println(m.getName() + "��������Ҫ����");
			}
		}
	}
}
