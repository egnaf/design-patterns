package prototype;

public class TestApplication {

    public static void main(String[] args) {

        // create repository object
        Repository master = new Repository("master", 2, 0);

        // create copy of the repository
        Repository develop = (Repository) master.copy();
    }
}
