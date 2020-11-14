package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Todo> todos = new ArrayList<>();


    public void addTodo(Todo todo){
        this.todos.add(todo);
    }

    public void finishTodos(String caption){
        for(Todo todo : todos){
            if(todo.getCaption().equals(caption)){
                todo.finish();
            }
        }
    }

    public void finishAllTodos(){
        for (Todo todo : todos) {
            todo.finish();
        }
    }

    public List<String> todosToFinish(){
        List<String> result = new ArrayList<>();
        for(Todo todo : todos){
            if(!todo.isFinished()){
                result.add(todo.getCaption());
            }
        }
        return result;
    }

    public int numberOfFinishedTodos(){
        int result = 0;
        for(Todo todo : todos){
            if(todo.isFinished()){
                result += 1;
            }
        }
        return result;
    }

}
