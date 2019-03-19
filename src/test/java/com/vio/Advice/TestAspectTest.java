package com.vio.Advice;

import com.vio.User.Seller;
import com.vio.User.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestAspectTest {
    @Test
    public void test(){
        ApplicationContext ctx=new
                ClassPathXmlApplicationContext
                ("com/vio/Advice/Beans.xml");
        Waiter naiveywaiter=
                (Waiter) ctx.getBean("naiveWaiter");
        naiveywaiter.greetTo("GX");

        ((Seller)naiveywaiter).sell("smoke","GX");

    }
}