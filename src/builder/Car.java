package builder;

public class Car {
    private String model;
    private int year;
    private int speed;

    private Car() {
    }

    public Car(Builder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.speed = builder.speed;
    }

    public static class Builder {
        private String model;
        private int year;
        private int speed;

        public Builder() {
        }

        public Builder(String model) {
            this.model = model;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }
}
