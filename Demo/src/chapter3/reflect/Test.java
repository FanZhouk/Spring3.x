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
	 * 利用反射创建一个汽车对象
	 */
	public static Car createCar() throws Throwable {
		// 通过类加载器获取Car类的对象
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("chapter3.Car");

		// 反射获取类的构造函数，并实例化一个对象
		Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
		Car car = (Car) cons.newInstance();

		// 反射获取getter方法，并设置汽车各个属性
		Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "black");
		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "BMW");
		Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 200);
		return car;
	}
}
