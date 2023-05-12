package overloading;

public class Animals {
    private String name;
    private boolean isDog;
    private int numLegs;
    private String hairColor;

    public Animals (String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animals (String name, boolean isDog, int numLegs, String hairColor) {
        this.name = name;
        this.isDog = isDog;
        this.numLegs = numLegs;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String toString() {
        return getName() + " is a dog = " + isDog() + ". It has " + numLegs + " legs\n" +
                "and " + hairColor + " hair.";
    }
}


