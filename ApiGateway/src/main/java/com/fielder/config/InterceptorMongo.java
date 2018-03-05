//package gov.sandia.ode.config;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
//import org.springframework.stereotype.Component;
//
//import gov.sandia.ode.domain.CurrentUser;
//import gov.sandia.ode.domain.DatabaseProperties;
//import gov.sandia.ode.domain.IDatabaseVars;
//import gov.sandia.ode.domain.User;
//
//@Component
//public class InterceptorMongo extends AbstractMongoEventListener<IDatabaseVars> {
//
//	@Autowired
//	private CurrentUser appUser;
//
//	@Override
//	public void onBeforeConvert(IDatabaseVars source){
//		DatabaseProperties dbProperties = source.getDatabaseProperties();				
//		Date now = new Date();
//		User user = appUser.getUser();
//		
//		if(dbProperties.getCreatedDate() == null){
//			dbProperties.setCreatedDate(now);			
//			dbProperties.setCreatedApplication("ODE");
//			if(user != null){
//				dbProperties.setCreatedBy(user.getUserId());
//			}
//		}
//		dbProperties.setLastUpdatedDate(now);
//		dbProperties.setLastUpdatedApplication("ODE");
//		if(user != null){
//			dbProperties.setLastUpdatedBy(user.getUserId());
//		}
//	}
//}
//
