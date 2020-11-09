package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    public Timer timer;

    @Autowired
    private  AnimalsCage cage;

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

    /*public Timer getTimer() {

        return timer;
    }*/
}
