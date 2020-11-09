package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Autowired
    private Animal animal;

    @Override
    public String toString() {
        return "Im a Dog";
    }


}
