package HomeWork2.Task1;

import java.util.HashMap;

public interface GeoTree {
    HashMap<Node, Node> tree = new HashMap<>();

    void append(Person p1, Person p2);
}
