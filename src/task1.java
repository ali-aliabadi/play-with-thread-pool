import java.util.Date;

public class task1 implements Runnable {

    String name;

    task1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.print(this.getClass().getName() + ", " + name + " startedRunning. Date : " + new Date() + '\n');
                System.out.flush();
            } else {
                System.out.print(this.getClass().getName() + ", " + name + " isRunning. Date : " + new Date() + '\n');
                System.out.flush();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
