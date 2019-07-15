package strategy;

/**
 * Класс ConcreteStrategyA (конкретная стратегия A).
 *
 * Объявляет конкретный алгоритм A для решения стратегии.
 */
public class ConcreteStrategyA implements Strategy {

    /**
     * Выполняет конкретную операцию (или алгоритм) для стратегии А.
     */
    @Override
    public void operation() {
        System.out.println("Стратегия A");
    }
}