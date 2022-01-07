package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) {
        List<ToDo> todos = List.of(
                new ToDo("normal3", false),
                new ToDo("urgent2", true),
                new ToDo("normal1", false),
                new ToDo("urgent1", true),
                new ToDo("urgent3", true),
                new ToDo("normal2", false)
        );

        ToDoList toDoList = new ToDoList(todos);
        Deque<ToDo> order = toDoList.getTodosInUrgencyOrder();
        System.out.println(order);
        System.out.println(order.pop());
    }

    private List<ToDo> todos;

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo toDo: todos) {
            if (toDo.isUrgent()) {
                result.push(toDo);
            } else {
                result.add(toDo);
            }
        }
        return result;
    }
}
