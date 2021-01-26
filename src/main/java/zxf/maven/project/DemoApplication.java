package zxf.maven.project;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoApplication {
	private static final ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

	public static void main(String[] args) {
		scheduledExecutor.scheduleWithFixedDelay(DemoApplication::schedule, 0, 10, TimeUnit.SECONDS);
	}

	private static void schedule(){
		System.out.println("Running in " + Thread.currentThread().getName());
	}
}
