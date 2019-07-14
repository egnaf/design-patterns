package observer;

/**
 * Интерфейс Observable (наблюдаемый).
 * Данный интерфейс определяет методы для добавления, удаления и оповещения наблюдателей.
 */
public interface Observable {

    /**
     * Добавить наблюдателя.
     *
     * @param observer эеземпляр класса Observer.
     */
    void addObserver(Observer observer);

    /**
     * Удалить наблюдателя.
     *
     * @param observer эеземпляр класса Observer.
     */
    void removeObserver(Observer observer);

    /**
     * Уведомить всех наблюдателей.
     */
    void notifyObserver();
}