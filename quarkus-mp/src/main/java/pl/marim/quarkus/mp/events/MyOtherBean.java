package pl.marim.quarkus.mp.events;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyOtherBean {

    public String hello() {
        return "hello";
    }

    public String bye() {
        return "bye";
    }

}