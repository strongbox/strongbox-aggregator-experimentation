package org.carlspring.strongbox.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.assertTrue;

@Category(IntegrationTest.class)
public class HelloWorld1TestIT
{

    @Test
    public void testHelloWorld1Integration()
    {
        HelloWorld1 helloWorld1 = new HelloWorld1();
        helloWorld1.setShouldGenerateDate(true);
        helloWorld1.greet();
        helloWorld1.method1();
        helloWorld1.method2();
        helloWorld1.method3();

        assertTrue(helloWorld1.isGreeted());
    }

}
