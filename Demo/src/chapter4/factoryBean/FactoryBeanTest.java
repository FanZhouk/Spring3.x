package chapter4.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import chapter4.Car;

public class FactoryBeanTest {
	public static void main(String[] args) throws Exception {
		ResourceLoader loader = new PathMatchingResourcePatternResolver();
		Resource res = loader.getResource("classpath:chapter4/beans.xml");

		FactoryBean<Car> fb = new CarFactoryBean();
		Car car = fb.getObject();

		car.introduce();
	}
}
