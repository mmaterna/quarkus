package pl.marim.quarkus.mp.scheduler;

import java.util.concurrent.atomic.AtomicInteger;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.scheduler.Scheduled;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class ScheduledTask {

	  private AtomicInteger counter = new AtomicInteger();

	    public int get() {
	        return counter.get();
	    }

	    @Scheduled(every="10s")
	    void increment() {
	        counter.incrementAndGet();
	        log.info("Scheduled task incremental val: {}", counter.get());
	    }
}
