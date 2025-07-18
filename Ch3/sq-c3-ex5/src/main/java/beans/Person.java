package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";

    private final Parrot parrot; // Note this could not be final if we'd used field injection as in ch3-ex4

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName(){ return name; }

    public Parrot getParrot(){ return parrot; }

    public void setName(String name) { this.name = name; }
}
