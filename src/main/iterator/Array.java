package iterator;

/**
 * Класс Array.
 */
public class Array implements Collection {

    /**
     * Элементы класса Массив.
     */
    private Object[] list = {"One", "Two", 3, "Four"};

    /**
     * Переопределенный метод iterator.
     *
     * @return Возвращает объект ArrayIterator, специальный итератор для класса Array.
     */
    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }

    /**
     * Внутренний класс ArrayIterator, предназначенный для реализаций методов из интерфейса Iterator.
     */
    private class ArrayIterator implements Iterator {

        /**
         * Индекс массива.
         */
        private int index;

        /**
         * Реализация метода интерфейса Iterator - getNext, предназначена для получения следующего
         * элемента конкретного класса - класса Array.
         *
         * @return Возвращает экземпляр класса Object если элемент существует, иначе null.
         */
        @Override
        public Object getNext() {
            if (hasNext()) {
                return list[index++];
            }
            return null;
        }

        /**
         * Реализация метода интерфейса Iterator - hasNext, предназначена для получения состояния следующего
         * элемента конкретного класса - класса Array.
         *
         * @return Возвращает true если следующий элемент существует, иначе false.
         */
        @Override
        public boolean hasNext() {
            return index < list.length;
        }
    }
}