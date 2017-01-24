package blacklist.webservice.validator;


import java.util.Date;


public class Validator90Days {
	
	
	private		Date		now				=	null;
	private		Date		stDate			=	null;
	
	private		long		lNow			= 	0L;
	private		long		lSTDate			=	0L;
	
	
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
			System.out.println("VALIDACIÓN DE 3 MESES KO");
			throw new DhlBlackListValidatorException("CARGADO PREVIAMENTE / MENOS DE 3 MESES EN BLACKLIST");
			
		} else {
			System.out.println("VALIDACIÓN DE 3 MESES OK");
			
		}
	}
	
}
