package strategy;

/**
 * Класс StrategyContext (контекст стратегии).
 */
class StrategyContext {

    /**
     * Свойство strategy класса StrategyContext.
     */
    private Strategy strategy;

    /**
     * Геттер для свойства Strategy.
     *
     * @param strategy Экземплар Strategy.
     */
    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Выполнить операцию текущего алгоритма стратегии.
     */
    void performOperation() {
        strategy.operation();
    }
}