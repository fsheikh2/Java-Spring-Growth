package beans;

public class Person {

    private String name;
    private final Parrot parrot;

    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName(){ return name; }

    public Parrot getParrot(){ return parrot; }

    public void setName(String name) { this.name = name; }
}