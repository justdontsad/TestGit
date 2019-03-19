package com.vio.Advice;

import com.vio.User.Seller;
import com.vio.User.SmartSeller;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.Ordered;

@Aspect
public class EnableSellerAspect {
	@DeclareParents(value = "com.vio.User.NaiveWaiter", defaultImpl = SmartSeller.class)
	public static Seller seller;
	public int getOrder() {
		return 2;
	}
}
