package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Print log by AOP
 * 
 * @author ThienMai
 * @since 17-10-2016
 */
@Aspect
public class LoggingAspect {

	@Before("execution(* dao.impl.ProductManagementDaoImpl.*(..))") 
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Hi : " + joinPoint.getSignature().getName());
	}

}
