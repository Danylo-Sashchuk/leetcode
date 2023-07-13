package trash;

import java.util.ArrayList;
import java.util.List;

public class BuildingTest {
    public static void main(String[] args) {
        Library libraries = new Library("asd");
        printBuildings(libraries);
    }

    public static void printBuildings(Building buildings) {
        System.out.println(buildings.getName());
    }
}
