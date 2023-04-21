package HomeWork2.Task1;

public class GeoTreeSpouses implements GeoTree {
    @Override
    public void append(Person husbant, Person wife) {
        tree.put( new Node( husbant, Relationships.HUSBANT, wife ), new Node( wife, Relationships.WIFE, husbant ) );
    }

    @Override
    public String toString() {
        return "GeoTreeSpouses{" +
                "tree=" + tree +
                '}';
    }
}
