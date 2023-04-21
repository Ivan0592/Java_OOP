package HomeWork2.Task1;

public class GeoTreePC implements GeoTree {
    @Override
    public void append(Person parent, Person children) {
        tree.put( new Node( parent, Relationships.PARENT, children ), new Node( children, Relationships.CHILDREN, parent ) );
    }

    @Override
    public String toString() {
        return "GeoTreeImp{" +
                "tree=" + tree +
                '}';
    }
}
