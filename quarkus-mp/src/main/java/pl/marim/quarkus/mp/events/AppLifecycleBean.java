package pl.marim.quarkus.mp.events;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class AppLifecycleBean {

    private static final Logger LOGGER = LoggerFactory.getLogger("ListenerBean");

    /**
     * Inject a bean used in the callbacks.
     */
    @Inject
    MyOtherBean bean;

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("\n\n ======= The application is starting...{}\n\n", bean.hello());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("\n\n ====== The application is stopping... {}\n\n", bean.bye());
    }

}