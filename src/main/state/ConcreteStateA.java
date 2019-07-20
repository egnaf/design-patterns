package state;

/**
 * Класс ConcreteStateA (конкретное состояние A).
 */
public class ConcreteStateA implements State {

    /**
     * Некоторое поведение.
     * В данном случае выводит на экран строку "State A".
     */
    @Override
    public void someMethod() {
        System.out.println("State A");
    }
}