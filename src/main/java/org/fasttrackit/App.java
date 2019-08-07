package org.fasttrackit;

import org.fasttrackit.persistence.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {
        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
//        toDoItemRepository.createToDoItem("Learn JDBC",
//                LocalDateTime.now().plusMonths(6));

//        toDoItemRepository.deleteToDoItem(5);

        System.out.println(toDoItemRepository.getToDoItems());

        toDoItemRepository.updateToDoItem(3, true);

        System.out.println(toDoItemRepository.getToDoItems());
    }
}
