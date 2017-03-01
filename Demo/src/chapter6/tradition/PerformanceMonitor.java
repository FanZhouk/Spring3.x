package chapter6.tradition;

/**
 * ���ܼ�⹤����
 */
public class PerformanceMonitor {

	// �������ܼ�������
	private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

	/**
	 * ��ʼ���ܼ��
	 */
	public static void begin(String method) {
		System.out.println("��ʼ���ܼ��...");
		MethodPerformance mp = new MethodPerformance(method);
		performanceRecord.set(mp);
	}

	/**
	 * �������ܼ��
	 */
	public static void end() {
		System.out.println("�������ܼ��...");
		MethodPerformance mp = performanceRecord.get();
		mp.endMonitor();
	}
}
