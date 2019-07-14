package observer;

/**
 * Паттерн проектирования - Observer (наблюдатель).
 *
 * Описания паттерна:
 * Наблюдатель — это поведенческий паттерн проектирования, определяющий между объектами
 * зависимость типа один-ко-многим, так что при изменении состоянии одного объекта все зависящие
 * от него получают извещение и автоматически обновляются.
 */
public class ObserverApplication {

    /**
     * Метод для ручного тестирования шаблона проектирования - Наблюдатель.
     *
     * @param args Параметры командрой строки.
     */
    public static void main(String[] args) {

        /* Наблюдатели */
        Observer firstObserver = new ConcreteObserver("Первый наблюдатель");
        Observer secondObserver = new ConcreteObserver("Второй наблюдатель");

        /* Наблюдаемый */
        Observable observable = new ConcreteObservable();

        /* Добавить наблюдателей в наблюдаемый */
        observable.addObserver(firstObserver);
        observable.addObserver(secondObserver);

        /* Уведомить всех наблюдателей */
        observable.notifyObserver();

        /* Удалить наблюдателей */
        observable.removeObserver(firstObserver);
        observable.removeObserver(secondObserver);

        /*
            out:
            Первый наблюдатель
            Второй наблюдатель
        */
    }
}