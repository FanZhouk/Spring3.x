package chapter6.tradition;

/**
 * 性能检测工具类
 */
public class PerformanceMonitor {

	// 本次性能检测的数据
	private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

	/**
	 * 开始性能监测
	 */
	public static void begin(String method) {
		System.out.println("开始性能监测...");
		MethodPerformance mp = new MethodPerformance(method);
		performanceRecord.set(mp);
	}

	/**
	 * 结束性能监测
	 */
	public static void end() {
		System.out.println("结束性能监测...");
		MethodPerformance mp = performanceRecord.get();
		mp.endMonitor();
	}
}
