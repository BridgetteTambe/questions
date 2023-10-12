package org.example.Q104;

import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    private final ReentrantLock lock = new ReentrantLock();
     Thread.State state;

    public void Foo() throws Exception{
        try{ lock.lock();
           // state.mutate();
    }
        finally {
            lock.unlock();
        }
        }
}
