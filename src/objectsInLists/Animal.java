package objectsInLists;
import java.util.Scanner;
import java.util.ArrayList;

public class Animal {
    private String name;
    private boolean isDog;

    public Animal (String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    public String toString() {
        return "Animal Name: " + getName() + " Is a Dog?: " + isDog();
    }
}
