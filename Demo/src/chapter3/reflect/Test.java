package chapter3.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import chapter3.Car;

public class Test {

	public static void main(String[] args) throws Throwable {
		Car car = createCar();
		car.introduce();
	}

	/**
	 * ���÷��䴴��һ����������
	 */
	public static Car createCar() throws Throwable {
		// ͨ�����������ȡCar��Ķ���
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("chapter3.Car");

		// �����ȡ��Ĺ��캯������ʵ����һ������
		Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
		Car car = (Car) cons.newInstance();

		// �����ȡgetter������������������������
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "black");
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "BMW");
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		return car;
	}
}
