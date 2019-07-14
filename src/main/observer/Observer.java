package observer;

/**
 * Интерфейс Observer (наблюдатель).
 * C помощью данного интерфейса наблюдатель получает оповещение;
 */
public interface Observer {

    /**
     * Обрабатывать событие.
     */
    void handleEvent();
}