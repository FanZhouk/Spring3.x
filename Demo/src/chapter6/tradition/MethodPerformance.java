package chapter6.tradition;

/**
 * һ�����ܼ������ݷ�װ��
 */
public class MethodPerformance {

	public MethodPerformance() {
	}

	/**
	 * ���췽������ʼ���������ͳ�ʼʱ��
	 */
	public MethodPerformance(String method) {
		this.serviceMethod = method;
		this.begin = System.currentTimeMillis();
	}

	private long begin;
	private long end;
	private String serviceMethod;

	/**
	 * �������ܼ�⣬������
	 */
	public void endMonitor() {
		end = System.currentTimeMillis();
		long elapse = end - begin;
		System.out.println(serviceMethod + "����" + elapse + "���롣");
	}
}
