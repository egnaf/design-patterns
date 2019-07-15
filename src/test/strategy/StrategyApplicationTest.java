package strategy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StrategyApplicationTest {

    private ByteArrayOutputStream output;
    private PrintStream old;

    private StrategyContext context = new StrategyContext();
    private Strategy strategyA = new ConcreteStrategyA();
    private Strategy strategyB = new ConcreteStrategyB();

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
        context.setStrategy(strategyA);

        // given
        context.performOperation();

        // expected result
        String template = "Стратегия A\n";

        // assert
        Assert.assertEquals(template, output.toString());
    }

    @Test
    public void test2() {
        // input
        context.setStrategy(strategyA);
        context.setStrategy(strategyB);

        // given
        context.performOperation();

        // expected result
        String template = "Стратегия B\n";

        // assert
        Assert.assertEquals(template, output.toString());
    }
}