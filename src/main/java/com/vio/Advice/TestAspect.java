package com.vio.Advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

/**
 * 说明：需要测试某个切点函数时，取消相应的注解就可以了。
 * @author 陈雄华
 *
 */
@Aspect
public class TestAspect{

	@AfterReturning("this(com.vio.User.Seller)")
	public void thisTest(){
		System.out.println("Test ok!");
	}
}
