package solvd.projects.multithread.threadpool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {
    private static final Logger LOGGER = LogManager.getLogger(MyCallable.class);
    @Override
    public Long call() {
        LOGGER.info("Thread Working :" +Thread.currentThread().getId());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            LOGGER.error("Error !!!");
        }
        LOGGER.info("Thread Finished !!! :"+Thread.currentThread().getId());
        return  Thread.currentThread().getId();
    }
}
