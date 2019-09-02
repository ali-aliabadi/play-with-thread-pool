import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Runnable> processes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            processes.add(new task1("my " + i));
            processes.add(new task2("your " + i));
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(5);

        for (Runnable r : processes) {
            executorService.submit(r);
        }

        executorService.shutdown();

    }
}
