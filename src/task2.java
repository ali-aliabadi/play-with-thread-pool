import java.util.Date;

public class task2 implements Runnable {

    String name;

    task2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.err.print(this.getClass().getName() + ", " + name + " startedRunning. Date : " + new Date() + '\n');
                System.err.flush();
            } else {
                System.err.print(this.getClass().getName() + ", " + name + " isRunning. Date : " + new Date() + '\n');
                System.err.flush();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
