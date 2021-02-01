package collectionsqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    private Queue<Job> jobs = new PriorityQueue<>();

    public void addJob(Job... jobs){
        for(Job job : jobs){
            this.jobs.add(job);
        }
    }

    public Job dispatchNextJob(){
        if(this.jobs.isEmpty()){
            throw new NoJobException("no job available");
        }
        return this.jobs.poll();
    }

}
