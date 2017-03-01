package chapter6.tradition;

/**
 * 一次性能检测的数据封装类
 */
public class MethodPerformance {

	public MethodPerformance() {
	}

	/**
	 * 构造方法，初始化方法名和初始时间
	 */
	public MethodPerformance(String method) {
		this.serviceMethod = method;
		this.begin = System.currentTimeMillis();
	}

	private long begin;
	private long end;
	private String serviceMethod;

	/**
	 * 结束性能检测，输出结果
	 */
	public void endMonitor() {
		end = System.currentTimeMillis();
		long elapse = end - begin;
		System.out.println(serviceMethod + "花费" + elapse + "毫秒。");
	}
}
