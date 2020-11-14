package intromethods;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todos = new TodoList();

        Todo todo1 = new Todo("bevasarlas");
        Todo todo2 = new Todo("edzes");

        todos.addTodo(todo1);
        todos.addTodo(todo2);

        System.out.println(todos.numberOfFinishedTodos());
        System.out.println(todos.todosToFinish());

        System.out.println(todo1.toString());
        System.out.println(todo2.toString());


        todos.finishTodos(todo1.getCaption());

        System.out.println(todos.numberOfFinishedTodos());
        System.out.println(todos.todosToFinish());

        System.out.println(todo1.toString());
        System.out.println(todo2.toString());


    }

}
