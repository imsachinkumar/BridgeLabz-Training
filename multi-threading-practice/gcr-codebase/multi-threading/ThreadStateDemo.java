class TaskRunner extends Thread {
    TaskRunner(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(2000); // TIMED_WAITING
            for (int i = 0; i < 1000000; i++); // computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class StateMonitor extends Thread {
    private Thread t1, t2;

    StateMonitor(Thread t1, Thread t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void run() {
        try {
            while (t1.isAlive() || t2.isAlive()) {
                System.out.println("[Monitor] " + t1.getName() +
                        " state: " + t1.getState());
                System.out.println("[Monitor] " + t2.getName() +
                        " state: " + t2.getState());
                Thread.sleep(500);
            }
            System.out.println("Summary: Threads reached TERMINATED state");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) throws Exception {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        System.out.println("Initial state: " + t1.getState());
        StateMonitor monitor = new StateMonitor(t1, t2);

        monitor.start();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        monitor.join();
    }
}
