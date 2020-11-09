package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    public Timer timer;
    @Autowired
    public AnimalsCage() {
        this.timer = new Timer();
    }


    @Autowired
    private Dog animal;

    //@Autowired
    public Timer getTimer() {
        return timer;
    };

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
