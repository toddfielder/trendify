package com.fielder.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.util.StringUtils;

/**
 * Class that logs information about method parameters and execution time.
 * 
 * Logs at different levels based on time that wrapped method takes to execute.
 * 
 */
@Component
@Aspect
public class TimingAspect {
	private Logger logger = LoggerFactory.getLogger(TimingAspect.class);
    
	public enum LOGGING_THRESHHOLD {
		TRACE(10), DEBUG(50), INFO(500);

		private final int value;

		LOGGING_THRESHHOLD(int param){
			value = param;
		}
		public int getValue() {
			return value;
		}
	}

	@Around("execution(* com.fielder..*.*(..))")
	public Object logBusinessMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return this.logTimeMethod(joinPoint); 
	}


	private Object logTimeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object retVal = joinPoint.proceed();

		stopWatch.stop();
		Object[] args = joinPoint.getArgs();

		if (stopWatch.getTotalTimeMillis() > LOGGING_THRESHHOLD.DEBUG.value){
			logger.info(String.format("INFO [{%d} ms] {%s}({%s})%n",
					stopWatch.getTotalTimeMillis(),
					joinPoint.getStaticPart().getSignature().toString(),
					StringUtils.arrayToCommaDelimitedString(args)
					));			
		}else if (stopWatch.getTotalTimeMillis() > LOGGING_THRESHHOLD.INFO.value){			
			logger.debug(String.format("DEBUG [{%d} ms] {%s}({%s})%n",
					stopWatch.getTotalTimeMillis(),
					joinPoint.getStaticPart().getSignature().toString(),
					StringUtils.arrayToCommaDelimitedString(args)
					));	
		}
		return retVal;
	}
}

