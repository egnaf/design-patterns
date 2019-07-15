package strategy;

/**
 * Паттерн проектирования - Strategy (стратегия).
 *
 * Описания паттерна:
 * Стратегия — это поведенческий паттерн проектирования, определяющий  семейство алгоритмов,
 * инкапсулируя их все и позволяя подставлять один вместо другого.
 * Можно менять алгоритм независимо от клиента, который им пользуется.
 */
public class StrategyApplication {

    /**
     * Метод для ручного тестирования шаблона проектирования - Стратегия.
     *
     * @param args Параметры командрой строки.
     */
    public static void main(String[] args) {

        /* Создать разные стратегии */
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        /* Создать контекста (клиента) для стратегии. */
        StrategyContext context = new StrategyContext();

        context.setStrategy(strategyA); // Стратегия A
        context.setStrategy(strategyB); // Стратегия B

        /* Вызвать операцию текущей стратегии */
        context.performOperation();

        /*
            out:
            Стратегия B
        */
    }
}