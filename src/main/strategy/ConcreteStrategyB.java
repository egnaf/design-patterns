package strategy;

/**
 * Класс ConcreteStrategyB (конкретная стратегия B).
 *
 * Объявляет конкретный алгоритм B для решения стратегии.
 */
public class ConcreteStrategyB implements Strategy {

    /**
     * Выполняет конкретную операцию (или алгоритм) для стратегии B.
     */
    @Override
    public void operation() {
        System.out.println("Стратегия B");
    }
}