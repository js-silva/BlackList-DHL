package blacklist.webservice.validator;


import java.math.BigInteger;


public class Validator {
	
	
	private String	sDate			=	null;
	private	String	fcCd			=	null;
	private String	nPcsId			=	null;
	private	String	pcsIdShipId		=	null;
	private	String	rCd				=	null;
	private	String	srvaCd			=	null;
	private	String	tyCd			=	null;
	
	
	private Validator() {
		super();
	}
	
	public Validator(String sDate, String fcCd, String nPcsId, String pcsIdShipId, String rCd, String srvaCd, String tyCd) throws DhlBlackListValidatorException {
		this();
		this.sDate			=	sDate;
		this.fcCd			=	fcCd;
		this.nPcsId			=	nPcsId;
		this.pcsIdShipId	=	pcsIdShipId;
		this.rCd			= 	rCd;
		this.srvaCd			=	srvaCd;
		this.tyCd			=	tyCd;
		
		if( this.sDate == null || this.sDate.trim().length() == 0) {
			throw new DhlBlackListValidatorException("LA FECHA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
		
		if( this.fcCd == null ||  this.fcCd.trim().length() == 0) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD DEBE SER NO NULO");
		}
		
		if( this.nPcsId != null) {
			if( this.nPcsId.trim().length() == 0) {
				throw new DhlBlackListValidatorException("EL CAMPO NPcsId DEBE SER DE LONGITUD NO CERO");
			}
		}
		
		if( this.pcsIdShipId == null ||  this.pcsIdShipId.trim().length() == 0) {
			throw new DhlBlackListValidatorException("EL CAMPO PcsIdShipId DEBE SER NO NULO");
		}
		
		if( this.rCd == null ||  this.rCd.trim().length() == 0) {
			throw new DhlBlackListValidatorException("EL CAMPO RCd DEBE SER NO NULO");
		}
		
		if( this.srvaCd == null ||  this.srvaCd.trim().length() == 0) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd DEBE SER NO NULO");
		}
		
		if( this.tyCd == null ||  this.tyCd.trim().length() == 0) {
			throw new DhlBlackListValidatorException("EL CAMPO TyCd DEBE SER NO NULO");
		}
		
		this.doIt();
	}
	
	
	private void validateYearFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(0,4);
		System.out.println("EL AÑO EXTRAIDO ES: "+ tmp02);
		
		try {
			Integer.parseInt(tmp02);
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL AÑO NO ES VÁLIDO, NO REPRESENTA UN ENTERO");
		}
		
		//2014 <= x <= 2017
		if( (Integer.parseInt(tmp02) > 2017) || (Integer.parseInt(tmp02) < 2014) ) {
			throw new DhlBlackListValidatorException("LA FECHA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateMonthFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(5,7);
		System.out.println("EL MES EXTRAIDO ES: "+ tmp02);
		
		try {
			Integer.parseInt(tmp02);
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL MES NO ES VÁLIDO, NO REPRESENTA UN ENTERO");
		}
		
		//1 <= x <= 12
		if( (Integer.parseInt(tmp02) > 12) || (Integer.parseInt(tmp02) < 1) ) {
			throw new DhlBlackListValidatorException("LA FECHA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateDayFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(8,10);
		System.out.println("EL DÍA EXTRAIDO ES: "+ tmp02);
		
		try {
			Integer.parseInt(tmp02);
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL DÍA NO ES VÁLIDO, NO REPRESENTA UN ENTERO");
		}
		
		//1 <= x <= 31
		if( (Integer.parseInt(tmp02) > 31) || (Integer.parseInt(tmp02) < 1) ) {
			throw new DhlBlackListValidatorException("LA FECHA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateSeparatorFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(10,11);
		System.out.println("EL SEPARADOR EXTRAIDO ES: "+ tmp02);
		
		if( !tmp02.equals("T") ) {
			throw new DhlBlackListValidatorException("LA FECHA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateHourFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(11,13);
		System.out.println("LA HORA EXTRAIDA ES: "+ tmp02);
		
		try {
			Integer.parseInt(tmp02);
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "LA HORA NO ES VÁLIDA, NO REPRESENTA UN ENTERO");
		}
		
		//0 <= x <= 23
		if( (Integer.parseInt(tmp02) > 23) || (Integer.parseInt(tmp02) < 0) ) {
			throw new DhlBlackListValidatorException("LA HORA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateMinutsFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(14,16);
		System.out.println("EL MINUTO EXTRAIDO ES: "+ tmp02);
		
		try {
			Integer.parseInt(tmp02);
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL MINUTO NO ES VÁLIDO, NO REPRESENTA UN ENTERO");
		}
		
		//0 <= x <= 59
		if( (Integer.parseInt(tmp02) > 59) || (Integer.parseInt(tmp02) < 0) ) {
			throw new DhlBlackListValidatorException("LA HORA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateSecondsFromDate() throws DhlBlackListValidatorException {
		String tmp01 = this.sDate.trim();
		String tmp02 = tmp01.substring(17,19);
		System.out.println("EL SEGUNDO EXTRAIDO ES: "+ tmp02);
		
		try {
			Integer.parseInt(tmp02);
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL SEGUNDO NO ES VÁLIDO, NO REPRESENTA UN ENTERO");
		}
		
		//0 <= x <= 59
		if( (Integer.parseInt(tmp02) > 59) || (Integer.parseInt(tmp02) < 0) ) {
			throw new DhlBlackListValidatorException("LA HORA NO ES VÁLIDA, EL FORMATO ES: YYYY-MM-ddTHH:mm:ss");
		}
	}
	
	private void validateFcCD() throws DhlBlackListValidatorException {
		String	tmp01	= this.fcCd.trim();
		String	tmp02	= tmp01.substring(0,1);
		String	tmp03	= tmp01.substring(1,2);
		String	tmp04	= tmp01.substring(2,3);
		System.out.println("EL CAMPO FcCD EXTRAIDO ES: "+ tmp01);
		
		if( tmp01.length() != 3 ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		
		if( !Character.isAlphabetic(tmp02.codePointAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		if( !Character.isUpperCase(tmp02.charAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		
		if( !Character.isAlphabetic(tmp03.codePointAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		if( !Character.isUpperCase(tmp03.charAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		
		if( !Character.isAlphabetic(tmp04.codePointAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		if( !Character.isUpperCase(tmp04.charAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO FcCD NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
	}
	
	private void validateNPcsId() throws DhlBlackListValidatorException {
		String	tmp01 = this.nPcsId.trim();
		System.out.println("EL CAMPO NPcsId EXTRAIDO ES: "+ tmp01);
		
		try {
			BigInteger bInt = new BigInteger(tmp01);
			
			//0 < x
			if( (bInt.signum()<1) ) {
				throw new DhlBlackListValidatorException("EL CAMPO NPcsId NO ES VÁLIDO, DEBE SER UN VALOR NO NEGATIVO");
			}
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL CAMPO NPcsId NO ES VÁLIDO, NO REPRESENTA UN BIG-INTEGER");
		}
	}
	
	private void validatePcsIdShipId() throws DhlBlackListValidatorException {
		String	tmp01 = this.pcsIdShipId.trim();
		System.out.println("EL CAMPO PcsIdShipId EXTRAIDO ES: "+ tmp01);
		
		if( !(tmp01.length() == 10) ) {
			throw new DhlBlackListValidatorException("EL CAMPO PcsIdShipId NO ES VÁLIDO, DEBE SER UN NUMÉRICO DE 10 POSICIONES, DEBE SER UN VALOR NO NEGATIVO");
		}
		
		try {
			BigInteger tBI = new BigInteger(tmp01);
			
			//0 < x
			if( (tBI.signum()<1) ) {
				throw new DhlBlackListValidatorException("EL CAMPO PcsIdShipId NO ES VÁLIDO, DEBE SER UN NUMÉRICO DE 10 POSICIONES, DEBE SER UN VALOR NO NEGATIVO");
			}
		} catch( NumberFormatException nfE ) {
			throw new DhlBlackListValidatorException(nfE.getMessage() + " -- " + "EL CAMPO PcsIdShipId NO ES VÁLIDO, NO REPRESENTA UN ENTERO");
		}
	}
	
	private void validateRCd() throws DhlBlackListValidatorException {
		String tmp01 = this.rCd.trim();
		System.out.println("EL CAMPO RCd EXTRAIDO ES: "+ tmp01);
		
		if( !tmp01.equals("ST200") ) {
			throw new DhlBlackListValidatorException("EL CAMPO RCd NO ES VÁLIDO, DEBE SER EL VALOR \"ST200\"");
		}
	}
	
	private void validateSrvaCd() throws DhlBlackListValidatorException {
		String	tmp01	= this.srvaCd.trim();
		String	tmp02	= tmp01.substring(0,1);
		String	tmp03	= tmp01.substring(1,2);
		String	tmp04	= tmp01.substring(2,3);
		System.out.println("EL CAMPO SrvaCd EXTRAIDO ES: "+ tmp01);
		
		if( tmp01.length() != 3 ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		
		if( !Character.isAlphabetic(tmp02.codePointAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		if( !Character.isUpperCase(tmp02.charAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		
		if( !Character.isAlphabetic(tmp03.codePointAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		if( !Character.isUpperCase(tmp03.charAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		
		if( !Character.isAlphabetic(tmp04.codePointAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
		if( !Character.isUpperCase(tmp04.charAt(0)) ) {
			throw new DhlBlackListValidatorException("EL CAMPO SrvaCd NO ES VÁLIDO, DEBE SER UN CAMPO NO NUMÉRICO, TENER UNA LONGITUD DE 3 CARACTERES, Y MAYÚSCULAS");
		}
	}
	
	private void validateTyCd() throws DhlBlackListValidatorException {
		String tmp01 = this.tyCd.trim();
		System.out.println("EL CAMPO TyCd EXTRAIDO ES: "+ tmp01);
		
		if( !tmp01.equals("ST") ) {
			throw new DhlBlackListValidatorException("EL CAMPO TyCd NO ES VÁLIDO, DEBE SER EL VALOR \"ST\"");
		}
	}
	
	
	private void doIt() throws DhlBlackListValidatorException {
		validateYearFromDate();
		validateMonthFromDate();
		validateDayFromDate();
		validateSeparatorFromDate();
		validateHourFromDate();
		validateMinutsFromDate();
		validateSecondsFromDate();
		//
		validateFcCD();
		//
		if(!(this.nPcsId == null)) {
			validateNPcsId();
		}
		//
		validatePcsIdShipId();
		//
		validateRCd();
		//
		validateSrvaCd();
		//
		validateTyCd();
	}
	
}
