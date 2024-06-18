import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie kolekcji ArrayList
        List<Item> items = new ArrayList<>();

        // Dodawanie 10 obiektów klasy Item do kolekcji
        for (int i = 1; i <= 10; i++) {
            items.add(new Item(i, "Item " + i));
        }

        // Wyłuskiwanie pięciu pierwszych elementów z listy za pomocą subList()
        List<Item> firstFiveItems = items.subList(0, 5);

        // Tworzenie kontenera HashSet i umieszczanie w nim elementów z subList
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        // Wyświetlanie elementów HashSet
        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}
