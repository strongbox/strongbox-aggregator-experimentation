package org.carlspring.strongbox.test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorld2Test
{

    @Test
    public void testHelloWorld1()
    {
        HelloWorld2 helloWorld2 = new HelloWorld2();
        helloWorld2.greet();

        assertTrue(helloWorld2.isGreeted());
    }

}
