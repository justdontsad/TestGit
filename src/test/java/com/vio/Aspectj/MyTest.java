package com.vio.Aspectj;

import com.vio.User.NaiveWaiter;
import com.vio.User.Seller;
import com.vio.User.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void Mytest(){

        String conflate="com/vio/Aspectj/Beans.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(conflate);
        NaiveWaiter waiter=(NaiveWaiter)ctx.getBean("naiveWaiter");
        //Seller seller=(Seller)ctx.getBean("smartSeller2");

      //  waiter.greetTo("GX");
        waiter.smile("GX",5);
        //waiter.serveTo("GX");


       // seller.sell("meet","GX");
    }
}