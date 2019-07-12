package iterator;

/**
 * Паттерн проектирования - Итератор.
 *
 * Описания паттерна:
 * Итератор — это поведенческий паттерн проектирования, который даёт возможность последовательно обходить
 * элементы составных объектов, не раскрывая их внутреннего представления.
 */
public class IteratorApplication {

    /**
     * Метод для ручного тестирования шаблона проектирования - Итератор.
     *
     * @param args Параметры командрой строки.
     */
    public static void main(String[] args) {

        /* Создание экземпляра массива Array. */
        Array array = new Array();

        /* Создание экземпляра внутреннего класса - ArrayIterator */
        Iterator iterator = array.iterator();

        /* Последовательный обход элементов объекта array. */
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext()); // Вывод элемента на экран.
        }
    }
}