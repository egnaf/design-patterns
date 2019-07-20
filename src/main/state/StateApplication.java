package state;

/**
 * Паттерн проектирования - State (состояние).
 *
 * Описания паттерна:
 * Стратегия — это поведенческий паттерн проектирования, Позволяет объекту варьировать свое поведение
 * при изменении внутреннего состояния. При этом создается впечатление, что поменялся класс объекта.
 */
public class StateApplication {

    /**
     * Метод для ручного тестирования шаблона проектирования - Состояние.
     *
     * @param args Параметры командрой строки.
     */
    public static void main(String[] args) {

        /* Создание состояний */
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        /* Создание контекста (клиента) */
        Context context = new Context();

        /* Поменять состояние на stateA */
        context.setState(stateA);
        context.getState().someMethod();

        /* Поменять состояние на stateB */
        context.setState(stateB);
        context.getState().someMethod();

        /*
         * Вывод:
         *
         * Состояние A
         * Состояние B
         *
         */
    }
}