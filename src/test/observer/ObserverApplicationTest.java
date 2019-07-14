package observer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ObserverApplicationTest {

    private ByteArrayOutputStream output;
    private PrintStream old;

    @Before
    public void setUpStreams() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(old);
    }

    @Test
    public void test1() {
        // input
        Observer firstObserver = new ConcreteObserver("Первый наблюдатель");
        Observer secondObserver = new ConcreteObserver("Второй наблюдатель");

        Observable observable = new ConcreteObservable();

        observable.addObserver(firstObserver);
        observable.addObserver(secondObserver);

        // given
        observable.notifyObserver();

        // expected result
        String template = "Первый наблюдатель\nВторой наблюдатель\n";

        // assert
        Assert.assertEquals(template, output.toString());
    }
}