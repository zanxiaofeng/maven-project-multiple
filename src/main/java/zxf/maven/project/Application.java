package zxf.maven.project;

import com.sun.jna.Platform;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    private static final ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        scheduledExecutor.scheduleWithFixedDelay(Application::schedule, 0, 10, TimeUnit.SECONDS);
    }

    private static void schedule() {
        try {
            System.out.println(String.format("Running in %s printed by %s", Thread.currentThread().getName(), "java"));
            CLibrary.INSTANCE.printf("Running in %s printed by %s", Thread.currentThread().getName(), Platform.C_LIBRARY_NAME);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
