package interfaces.simpletasks;

import java.util.List;

public class SimpleTask implements Runnable {
    private List<String> tasks;

    public SimpleTask(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (nextStep()) {

        }
    }

    private boolean nextStep() {
        if (tasks.size() > 0) {
            String task = tasks.get(0);
            tasks.remove(0);
            return true;
        }
        return false;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
