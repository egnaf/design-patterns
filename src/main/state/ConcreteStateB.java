package state;

/**
 * Класс ConcreteStateA (конкретное состояние B).
 */
public class ConcreteStateB implements State {

    /**
     * Некоторое поведение.
     * В данном случае выводит на экран строку "State B".
     */
    @Override
    public void someMethod() {
        System.out.println("State B");
    }
}