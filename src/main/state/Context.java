package state;

/**
 * Класс Context (контекст).
 */
class Context {

    /**
     * Внутреннее состояние.
     */
    private State state;

    /**
     * Задать новое значение для state.
     *
     * @param state Ссылка на объект state.
     */
    void setState(State state) {
        this.state = state;
    }

    /**
     * Получить ссылку на объект state.
     *
     * @return Возвращает ссылку на объект state.
     */
    State getState() {
        return state;
    }
}