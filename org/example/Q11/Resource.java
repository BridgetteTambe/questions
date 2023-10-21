package org.example.Q11;

public class Resource {
    public static void main(String[] args) {

        Resource resource = new Resource();
        Worker worker = new Worker();
        Thread t1 = new Thread(() -> resource.processWork(worker));
        Thread t2 = new Thread(() -> worker.consumeResource(resource));

    }

    private void processWork(Worker worker) {
    }


}
