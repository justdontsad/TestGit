package com.vio.Aspectj;

import com.vio.User.Waiter;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class TestAspect {
//    @After("within(com.vio.User.*)"+"&& execution(* greetTo(..))")
//    public void greeToFun(){
//        System.out.println("切面一运行成功");
//    }
//
////   @After("within(com.vio.User.NaiveWaiter)")
////  public void test(){
////      System.out.println("Ok!");
////  }
//
//
//
//    @Before("!target(com.vio.User.NaiveWaiter)"+"&& execution(* severTo(..))")
//    public void notServeInNaiveWaiter(){
//        System.out.println("切面二运行成功");
//    }
//
//
//    @AfterReturning("target(com.vio.User.Waiter) ||"+"target(com.vio.User.Seller)")
//    public void WaiterOrSellerr(){
//        System.out.println("切面三运行成功");


//    } '
    @Before("target(waiter)")
    public void test(Waiter waiter){
        System.out.println("***Test()***");
        System.out.println(waiter.getClass().getName());
        System.out.println("***Test()***");

    }
}
