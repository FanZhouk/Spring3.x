package chapter6.tradition;

/**
 * �����Եķ�����ʹ��Thread.sleepģ���ӳ�ʱ��
 */
public class ForumService {

	/**
	 * ģ�����һ������
	 */
	public void insert(String param) {
		PerformanceMonitor.begin("chapter5.tradition.ForumService.insert");
		System.out.println("ģ������¼��" + param);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}
	
	/**
	 * ģ��ɾ��һ������
	 */
	public void delete(String param) {
		PerformanceMonitor.begin("chapter5.tradition.ForumService.delete");
		System.out.println("ģ��ɾ����¼��" + param);
		try {
			Thread.sleep(40);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}
}
