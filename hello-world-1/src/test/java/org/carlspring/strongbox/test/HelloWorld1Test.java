package org.carlspring.strongbox.test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorld1Test
{

    @Test
    public void testHelloWorld1()
    {
        HelloWorld1 helloWorld1 = new HelloWorld1();
        helloWorld1.greet();

        assertTrue(helloWorld1.isGreeted());
    }

}
