package chapter3.applicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter3.Car;

/**
 * 基于注解的配置类
 */
@Configuration
public class Beans {
	@Bean(name = "car1")
	public Car buildCar1() {
		Car car = new Car();
		car.setBrand("BMW");
		car.setMaxSpeed(200);
		car.setColor("red");
		return car;
	}
}
