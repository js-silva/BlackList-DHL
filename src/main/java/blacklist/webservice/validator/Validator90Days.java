package blacklist.webservice.validator;


import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Validator90Days {
	
	
	private		Date		now				=	null;
	private		Date		stDate			=	null;
	
	private		long		lNow			= 	0L;
	private		long		lSTDate			=	0L;
	
	private static final	Logger	logger	=	LogManager.getLogger(Validator.class);
	
	
	private Validator90Days() {
		super();
	}
	
	public Validator90Days(Date dSTDate) throws DhlBlackListValidatorException {
		this();
		
		this.now		=	new Date();
		this.stDate		=	dSTDate;
		this.lNow		=	this.now.getTime();
		this.lSTDate	=	this.stDate.getTime();
		
		if( !((lNow - lSTDate) >= 7776000000L) ) {
			logger.info("VALIDACIÓN DE 3 MESES KO");
			throw new DhlBlackListValidatorException("CARGADO PREVIAMENTE / MENOS DE 3 MESES EN BLACKLIST");
			
		} else {
			logger.info("VALIDACIÓN DE 3 MESES OK");
			
		}
	}
	
}
