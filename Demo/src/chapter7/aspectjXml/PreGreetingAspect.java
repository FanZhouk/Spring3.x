package chapter7.aspectjXml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * ºáÇÐÂß¼­
 */
@Aspect
public class PreGreetingAspect {
	@Before("execution(* greetTo(..))")
	public void beforeGreeting() {
		System.out.println("How are you!");
	}
}
