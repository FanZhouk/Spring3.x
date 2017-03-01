package chapter6.tradition;

/**
 * 被测试的方法，使用Thread.sleep模拟延迟时间
 */
public class ForumService {

	/**
	 * 模拟插入一条数据
	 */
	public void insert(String param) {
		PerformanceMonitor.begin("chapter5.tradition.ForumService.insert");
		System.out.println("模拟插入记录：" + param);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}
	
	/**
	 * 模拟删除一条数据
	 */
	public void delete(String param) {
		PerformanceMonitor.begin("chapter5.tradition.ForumService.delete");
		System.out.println("模拟删除记录：" + param);
		try {
			Thread.sleep(40);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PerformanceMonitor.end();
	}
}
