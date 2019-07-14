package observer;

/**
 * Класс ConcreteObserver (конкретный наблюдаемый).
 */
public class ConcreteObserver implements Observer {

    /**
     * Поле для хранения сообщение.
     */
    private String message;

    /**
     * Конструктор для получения сообщения.
     * Инициализирует свойство message.
     *
     * @param message Текст сообщения.
     */
    ConcreteObserver(String message) {
        this.message = message;
    }

    /**
     * Обрабатывать событие.
     * Выводит текст сообщения из свойства message.
     */
    @Override
    public void handleEvent() {
        System.out.println(this.message);
    }
}