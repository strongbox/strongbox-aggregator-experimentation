package org.carlspring.strongbox.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld2
{

    private String greeting = "Hello, World 2! Today is ";

    private boolean shouldGenerateDate;

    private boolean greeted;


    public HelloWorld2()
    {
    }

    public void greet()
    {
        if (shouldGenerateDate)
        {
            Date date = new Date(System.currentTimeMillis());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println(greeting + sdf.format(date));
        }
        else
        {
            System.out.println(greeting);
        }

        greeted = true;
    }

    public void method1()
    {
        System.out.println("Invoked method1!");
    }

    public void method2()
    {
        System.out.println("Invoked method2!");
    }

    public void method3()
    {
        System.out.println("Invoked method3!");
    }

    public String getGreeting()
    {
        return greeting;
    }

    public void setGreeting(String greeting)
    {
        this.greeting = greeting;
    }

    public boolean isShouldGenerateDate()
    {
        return shouldGenerateDate;
    }

    public void setShouldGenerateDate(boolean shouldGenerateDate)
    {
        this.shouldGenerateDate = shouldGenerateDate;
    }

    public boolean isGreeted()
    {
        return greeted;
    }

    public void setGreeted(boolean greeted)
    {
        this.greeted = greeted;
    }

}
