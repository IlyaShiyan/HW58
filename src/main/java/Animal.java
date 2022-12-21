import java.util.Collections;
import java.util.Comparator;

public class Animal{
    private String name;
    private String colour;

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString(){return String.valueOf(name + " " +colour);
    }

}
