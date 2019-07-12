package iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class IteratorApplicationTest {

    private Array array = new Array();
    private Iterator iterator = array.iterator();

    @Test
    public void test1() {
        // input
        Object[] expectedResult = {"One", "Two", 3, "Four"};

        // given
        int i = 0;
        ArrayList<Object> result = new ArrayList<>();

        while (iterator.hasNext()) {
            result.add(iterator.getNext());
        }

        // assert
        Assert.assertArrayEquals(result.toArray(), expectedResult);
    }
}