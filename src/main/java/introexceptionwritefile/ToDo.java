package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        String nextToDo;
        while(!"x".equals(nextToDo = toDo.getNextTodo())) {
            toDo.addToDo(nextToDo);
        }
        Path path = Paths.get("src/main/resources/introexceptionwritefile/todos.txt");
        toDo.writeToFile(path);
    }

    private List<String> toDos = new ArrayList<>();

    private String getNextTodo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Következő todo (x=vége): ");
        return scanner.nextLine();
    }

    private void addToDo(String toDo) {
        toDos.add(toDo);
    }

    private void writeToFile(Path path) {
        try {
            Files.write(path, toDos);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!", ioe);
        }
    }
}
