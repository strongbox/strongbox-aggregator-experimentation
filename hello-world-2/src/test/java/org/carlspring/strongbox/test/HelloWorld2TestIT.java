package org.carlspring.strongbox.test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorld2TestIT
{

    @Test
    public void testHelloWorld1Integration()
    {
        HelloWorld2 helloWorld2 = new HelloWorld2();
        helloWorld2.setShouldGenerateDate(true);
        helloWorld2.greet();
        helloWorld2.method3();
        helloWorld2.method2();
        helloWorld2.method1();

        assertTrue(helloWorld2.isGreeted());
    }

}
