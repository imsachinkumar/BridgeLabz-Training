import java.util.PriorityQueue;
public class FileBackupScheduler {

    // Custom Exception
    static class InvalidBackupPathException extends Exception {
        InvalidBackupPathException(String msg) {
            super(msg);
        }
    }

    // Backup Task class
    static class BackupTask implements Comparable<BackupTask> {
        String path;
        int priority;

        BackupTask(String path, int priority) {
            this.path = path;
            this.priority = priority;
        }

        @Override
        public int compareTo(BackupTask other) {
            // higher priority first
            return other.priority - this.priority;
        }

        void execute() {
            System.out.println("Backing up: " + path + 
                               " | Priority: " + priority);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<BackupTask> pq = new PriorityQueue<>();

        try {
            addTask(pq, new BackupTask("C:/System", 5));
            addTask(pq, new BackupTask("D:/Work", 4));
            addTask(pq, new BackupTask("E:/Movies", 2));
            addTask(pq, new BackupTask("", 3)); // invalid path

        } catch (InvalidBackupPathException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nExecuting Backups:\n");

        while (!pq.isEmpty()) {
            pq.poll().execute();
        }
    }

    // Validation method
    static void addTask(PriorityQueue<BackupTask> pq, BackupTask task)
            throws InvalidBackupPathException {

        if (task.path == null || task.path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }
        pq.add(task);
    }
}
