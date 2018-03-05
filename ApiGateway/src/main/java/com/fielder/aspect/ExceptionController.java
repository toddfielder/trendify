package com.fielder.aspect;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Handles all internal Spring MVC exceptions. Returns ExceptionResponse as the ResponseEntity.
 * @see http://springinpractice.com/2013/10/09/generating-json-error-object-responses-with-spring-web-mvc
 */
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {
	public static final String DATA_ACCESS_EXCEPTION_ERROR_HEADER = "Data access error";
	public static final String DATA_ACCESS_EXCEPTION_ERROR_MSG = "Verify database connection settings";
	public static final String INTEGRATION_EXCEPTION_ERROR_HEADER = "Integration error";
	public static final String INTEGRATION_EXCEPTION_ERROR_MSG = "Verify web services are up and user credentials are correct";
	public static final String ACCESS_DENIED_EXCEPTION_ERROR_HEADER = "Authorization error";
	public static final String ACCESS_DENIED_EXCEPTION_ERROR_MSG = "Access has been denied";
	public static final String EXCEPTION_ERROR_HEADER = "Unhandled server error";
	public static final String EXCEPTION_ERROR_MSG = "Server encountered unhandled runtime error";
	
	private Logger logger = LoggerFactory.getLogger(ExceptionController.class);

//	/**
//	 * Handles DataAccessException and all thrown custom exception subclasses like PersistenceException 
//	 */
//	@ExceptionHandler(DataAccessException.class)
//	public ResponseEntity<ErrorResponse> dataAccessException(DataAccessException ex){
//		logger.error(ex.getMessage(), ex);
//
//		List<String> errorMessages = new ArrayList<>();
//		errorMessages.add(DATA_ACCESS_EXCEPTION_ERROR_HEADER);
//		errorMessages.add(DATA_ACCESS_EXCEPTION_ERROR_MSG);
//		errorMessages.add(ex.getMessage());
//		ErrorResponse json = new ErrorResponse(errorMessages);
//		
//		return new ResponseEntity<>(json, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//
//	/**
//	 * Handles IntegrationException, thrown when problems are encountered with external web services and other resources 
//	 */
//	@ExceptionHandler(IntegrationException.class)
//	public ResponseEntity<ErrorResponse> integrationException(IntegrationException ex){
//		logger.error(ex.getMessage(), ex);
//
//		List<String> errorMessages = new ArrayList<>();
//		errorMessages.add(INTEGRATION_EXCEPTION_ERROR_HEADER);
//		errorMessages.add(INTEGRATION_EXCEPTION_ERROR_MSG);
//		errorMessages.add(ex.getMessage());
//		ErrorResponse json = new ErrorResponse(errorMessages);
//
//		return new ResponseEntity<>(json, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	/**
//	 * Handles GrantaAccessException, thrown when a user attempts to access the service layer of granta without being in the correct metagroup
//	 */
//	@ExceptionHandler(TrendsetterAccessException.class)
//	public ResponseEntity<ErrorResponse> odeAccessException(OdeAccessException ex){
//		logger.error(ex.getMessage(), ex);
//
//		List<String> errorMessages = new ArrayList<>();
//		errorMessages.add(ACCESS_DENIED_EXCEPTION_ERROR_HEADER);
//		errorMessages.add(ACCESS_DENIED_EXCEPTION_ERROR_MSG);
//		errorMessages.add(ex.getMessage());
//		ErrorResponse json = new ErrorResponse(errorMessages);
//
//		return new ResponseEntity<>(json, HttpStatus.UNAUTHORIZED);
//	}
//	/**
//	 * Handles AccessDeniedException, thrown when problems are encountered during authentication/authorization 
//	 */
//	@ExceptionHandler(AccessDeniedException.class)
//	public ResponseEntity<ErrorResponse> accessDeniedException(AccessDeniedException ex) {
//		logger.error(ex.getMessage(), ex);
//
//		List<String> errorMessages = new ArrayList<>();
//		errorMessages.add(ACCESS_DENIED_EXCEPTION_ERROR_HEADER);
//		errorMessages.add(ACCESS_DENIED_EXCEPTION_ERROR_MSG);
//		errorMessages.add(ex.getMessage());
//		ErrorResponse json = new ErrorResponse(errorMessages);
//		
//		return new ResponseEntity<>(json, HttpStatus.UNAUTHORIZED);
//	}
//
//	/**
//	 * Default handler for all other exceptions 
//	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<List<String>> handleAllException(Exception ex) {
		logger.error(ex.getMessage(), ex);
		
		List<String> errorMessages = new ArrayList<>();
		errorMessages.add(EXCEPTION_ERROR_HEADER);
		errorMessages.add(EXCEPTION_ERROR_MSG);
		errorMessages.add(ex.getMessage());
//		ErrorResponse json = new ErrorResponse(errorMessages);
		
		return new ResponseEntity<>(errorMessages, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}