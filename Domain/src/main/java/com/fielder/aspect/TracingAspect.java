package com.fielder.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TracingAspect {
	private Logger logger = LoggerFactory.getLogger(TracingAspect.class);
    
	@Before(
			"execution(* com.fielder..*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping))"
			)
	public void entering(JoinPoint joinPoint){
		try{
			MethodSignature signature = (MethodSignature)joinPoint.getSignature();
			String[] parameterNames = signature.getParameterNames();
			Object[] parameterValues = joinPoint.getArgs();
			String requestParams = "";
			for(int i=0;i<parameterValues.length;i++){
				if(!parameterNames[i].startsWith("model") && !parameterNames[i].startsWith("allRequestParams")){
					if(parameterValues[i] != null){					
						if(!requestParams.equalsIgnoreCase("")){
							requestParams += ";";
						}
						requestParams += parameterNames[i] + ": " + parameterValues[i].toString();
					}
				}			
			}
			logger.info("Entering " + joinPoint.getStaticPart().getSignature().toString() + " -- " + requestParams);
			
			if(requestParams.length() > 199){
				requestParams = requestParams.substring(0, 199);
			}			
		}catch(Exception e){
			
		}
	}	
}
