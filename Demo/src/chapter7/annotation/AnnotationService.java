package chapter7.annotation;

public class AnnotationService {
	@NeedTest(true)
	public void update() {
	}
	@NeedTest(false)
	public void delete() {
	}
}
