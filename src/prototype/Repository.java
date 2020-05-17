package prototype;

public class Repository implements Copiable {

    private String name;
    private int startsCount;
    private int forksCount;


    public Repository(String name, int startsCount, int forksCount) {
        this.name = name;
        this.startsCount = startsCount;
        this.forksCount = forksCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartsCount() {
        return startsCount;
    }

    public void setStartsCount(int startsCount) {
        this.startsCount = startsCount;
    }

    public int getForksCount() {
        return forksCount;
    }

    public void setForksCount(int forksCount) {
        this.forksCount = forksCount;
    }

    @Override
    public Object copy() {
        return new Repository(name, startsCount, forksCount);
    }
}
