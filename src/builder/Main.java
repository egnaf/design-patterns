package builder;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car.Builder()
                .setModel("Audi")
                .setYear(2018)
                .setSpeed(300)
                .build();

        System.out.println(audi);

        /*
         * Displayed:
         * Car{model='Audi', year=2018, speed=300}
         */
    }
}
