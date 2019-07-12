package iterator;

/**
 * Интерфейс Iterator.
 *
 */
interface Iterator {

    /**
     * Получить следующий Элемент.
     *
     * @return Возвращает следующий элемент.
     */
    Object getNext();

    /**
     * Проверка на слуществование следующего элемента.
     *
     * @return Возвращает состояние следующего элемента.
     */
    boolean hasNext();
}