package abstract_factory;

public class AbstractFactory {

    public static void main(String[] args) {

        // car
        Factory carFactory = new CarFactory();
        System.out.println(carFactory.createWheel().getSize());
        System.out.println(carFactory.createMirror().getLayer());

        // airplane
        Factory airplaneFactory = new AirplaneFactory();
        System.out.println(airplaneFactory.createWheel().getSize());
        System.out.println(airplaneFactory.createMirror().getLayer());
    }
}

interface Wheel {
    int getSize();
}

interface Mirror {
    int getLayer();
}

class CarWheel implements Wheel {
    @Override
    public int getSize() {
        return 100;
    }
}

class AirplaneWheel implements Wheel {
    @Override
    public int getSize() {
        return 400;
    }
}

class CarMirror implements Mirror {
    @Override
    public int getLayer() {
        return 1;
    }
}

class AirplaneMirror implements Mirror {
    @Override
    public int getLayer() {
        return 3;
    }
}

// abstract factory
interface Factory {
    Wheel createWheel();
    Mirror createMirror();
}

// concrete factory 1
class CarFactory implements Factory {
    @Override
    public Wheel createWheel() {
        return new CarWheel();
    }

    @Override
    public Mirror createMirror() {
        return new CarMirror();
    }
}

// concrete factory 2
class AirplaneFactory implements Factory {
    @Override
    public Wheel createWheel() {
        return new AirplaneWheel();
    }

    @Override
    public Mirror createMirror() {
        return new AirplaneMirror();
    }
}
