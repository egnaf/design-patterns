package iterator;

public class Main {
    public static void main(String[] args) {

        NameContainer repository = new NameContainer();

        Iterator i = repository.getIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
