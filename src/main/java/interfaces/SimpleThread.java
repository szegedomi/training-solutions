package interfaces;

import java.util.List;

public class SimpleThread implements Runnable{

    private List<String> tasks;

    public List<String> getTasks() {
        return tasks;
    }

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(nextStep()){}
    }

    private boolean nextStep(){
        if(! (tasks == null || tasks.size() == 0)){
            tasks.remove(tasks.size()-1);
            return true;
        }
        return false;
    }



}
