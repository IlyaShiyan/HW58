import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Monkey", "brown");
        Animal animal2 = new Animal("Cat", "white");
        Animal animal3 = new Animal("Cat", "black");
        Animal animal4 = new Animal("Dog", "white");
        Animal animal5 = new Animal("Dog", "golden");
        Animal animal6 = new Animal("Mouse", "grey");
        Animal animal7 = new Animal("Wolf", "grey");

        class ComparatorName implements Comparator<Animal> {
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        class ComparatorColour implements Comparator<Animal> {
            public int compare(Animal o1, Animal o2) {
                return o1.getColour().compareTo(o2.getColour());
            }
        }


        Comparator<Animal> comparator = new ComparatorName().thenComparing(new ComparatorColour());


        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(animal1, animal2, animal3, animal4,
                animal5, animal6, animal7));
        Collections.sort(animals, comparator);

        for (Animal i : animals) {
            System.out.println(i.getName() + " " + i.getColour());
        }

    }
}
