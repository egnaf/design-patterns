package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс ConcreteObservable (конкретный наблюдаемый).
 */
public class ConcreteObservable implements Observable {

    /**
     * Список наблюдателей.
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * Добавить наблюдателя в список наблюдателей.
     *
     * @param observer эеземпляр класса Observer.
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Удалить наблюдателя из списка наблюдателей.
     *
     * @param observer эеземпляр класса Observer.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Уведомить всех наблюдателей из списка.
     */
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.handleEvent();
        }
    }
}