import java.util.ArrayList;
import java.util.List;

public class TaskPlanner {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        if (tasks.isEmpty()) {
            // Если список пуст, просто добавляем задачу.
            tasks.add(task);
        } else {
            // Иначе, проверяем приоритет новой задачи.
            boolean added = false;
            for (int i = 0; i < tasks.size(); i++) {
                if (task.getPriority() > tasks.get(i).getPriority()) {
                    // Если новая задача имеет более высокий приоритет, вставляем ее перед текущей задачей.
                    tasks.add(i, task);
                    added = true;
                    break;
                }
            }
            if (!added) {
                // Если новая задача имеет самый низкий приоритет, добавляем ее в конец списка.
                tasks.add(task);
            } else {
                // Если новая задача была добавлена, устанавливаем статус "OnHold" для остальных задач.
                for (int i = tasks.indexOf(task) + 1; i < tasks.size(); i++) {
                    tasks.get(i).setStatus("OnHold");
                }
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}