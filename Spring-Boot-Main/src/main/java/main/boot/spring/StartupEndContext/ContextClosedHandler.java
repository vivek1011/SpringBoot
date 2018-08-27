package main.boot.spring.StartupEndContext;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedHandler implements ApplicationListener<ContextClosedEvent>{

    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        /*
        * Anything which is required just before closing of Spring Application Context.
        * */
    }
}
