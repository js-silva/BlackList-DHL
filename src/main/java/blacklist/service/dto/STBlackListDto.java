package blacklist.service.dto;


import java.util.ArrayList;
import java.util.Date;

import org.dozer.Mapping;

import blacklist.persist.entity.STBlackList;


public class STBlackListDto {


	@Mapping("stId")
	private		String	stId;

	@Mapping("tyCd")
	private 	String	tyCd;

	@Mapping("pcsIdShipId")
	private		Long	pcsIdShipId;

	@Mapping("pudPnt")
	private		String	pudPnt;

	@Mapping("dt")
	private		Date	dt;

	@Mapping("srvaCd")
	private		String	srvaCd;

	@Mapping("fcCd")
	private		String	fcCd;

	@Mapping("cycCd")
	private		String	cycCd;

	@Mapping("routeCd")
	private		String	routeCd;

	@Mapping("dateTime")
	private		Date	dateTime;

	@Mapping("legalEntity")
	private		String	legalEntity;

	@Mapping("noPcs")
	private		Integer	noPcs;

	@Mapping("comDevNo")
	private		String	comDevNo;

	@Mapping("dayPrd")
	private		String	dayPrd;

	@Mapping("dstFcCd")
	private		String	dstFcCd;

	@Mapping("dstSrvaCd")
	private		String	dstSrvaCd;

	@Mapping("nPcsId")
	private		String	nPcsId;

	@Mapping("orgFcCd")
	private		String	orgFcCd;

	@Mapping("orgSrvaCd")
	private		String	orgSrvaCd;

	@Mapping("shpId")
	private		String	shpId;

	@Mapping("docTyCdST")
	private		String	docTyCdST;

	@Mapping("spcFcId")
	private		String	spcFcId;

	@Mapping("instr")
	private		String	instr;

	@Mapping("rCd")
	private		String	rCd;

	@Mapping("hitYCd")
	private		String	hitYCd;

	@Mapping("loadDate")
	private		Date	loadDate;

	@Mapping("uploader")
	private		String	uploader;

	@Mapping("records")
	private		ArrayList<STBlackList>	records = new ArrayList<STBlackList>();


	/**
	 * @return the stId
	 */
	public String getStId() {
		return stId;
	}
	/**
	 * @param stId the stId to set
	 */
	public void setStId(String stId) {
		this.stId = stId;
	}

	/**
	 * @return the tyCd
	 */
	public String getTyCd() {
		return tyCd;
	}
	/**
	 * @param tyCd the tyCd to set
	 */
	public void setTyCd(String tyCd) {
		this.tyCd = tyCd;
	}

	/**
	 * @return the pcsIdShipId
	 */
	public Long getPcsIdShipId() {
		return pcsIdShipId;
	}
	/**
	 * @param pcsIdShipId the pcsIdShipId to set
	 */
	public void setPcsIdShipId(Long pcsIdShipId) {
		this.pcsIdShipId = pcsIdShipId;
	}

	/**
	 * @return the pudPnt
	 */
	public String getPudPnt() {
		return pudPnt;
	}
	/**
	 * @param pudPnt the pudPnt to set
	 */
	public void setPudPnt(String pudPnt) {
		this.pudPnt = pudPnt;
	}

	/**
	 * @return the dt
	 */
	public Date getDt() {
		return dt;
	}
	/**
	 * @param dt the dt to set
	 */
	public void setDt(Date dt) {
		this.dt = dt;
	}

	/**
	 * @return the srvaCd
	 */
	public String getSrvaCd() {
		return srvaCd;
	}
	/**
	 * @param srvaCd the srvaCd to set
	 */
	public void setSrvaCd(String srvaCd) {
		this.srvaCd = srvaCd;
	}

	/**
	 * @return the fcCd
	 */
	public String getFcCd() {
		return fcCd;
	}
	/**
	 * @param fcCd the fcCd to set
	 */
	public void setFcCd(String fcCd) {
		this.fcCd = fcCd;
	}

	/**
	 * @return the cycCd
	 */
	public String getCycCd() {
		return cycCd;
	}
	/**
	 * @param cycCd the cycCd to set
	 */
	public void setCycCd(String cycCd) {
		this.cycCd = cycCd;
	}

	/**
	 * @return the routeCd
	 */
	public String getRouteCd() {
		return routeCd;
	}
	/**
	 * @param routeCd the routeCd to set
	 */
	public void setRouteCd(String routeCd) {
		this.routeCd = routeCd;
	}

	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the legalEntity
	 */
	public String getLegalEntity() {
		return legalEntity;
	}
	/**
	 * @param legalEntity the legalEntity to set
	 */
	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	/**
	 * @return the noPcs
	 */
	public Integer getNoPcs() {
		return noPcs;
	}
	/**
	 * @param noPcs the noPcs to set
	 */
	public void setNoPcs(Integer noPcs) {
		this.noPcs = noPcs;
	}

	/**
	 * @return the comDevNo
	 */
	public String getComDevNo() {
		return comDevNo;
	}
	/**
	 * @param comDevNo the comDevNo to set
	 */
	public void setComDevNo(String comDevNo) {
		this.comDevNo = comDevNo;
	}

	/**
	 * @return the dayPrd
	 */
	public String getDayPrd() {
		return dayPrd;
	}
	/**
	 * @param dayPrd the dayPrd to set
	 */
	public void setDayPrd(String dayPrd) {
		this.dayPrd = dayPrd;
	}

	/**
	 * @return the dstFcCd
	 */
	public String getDstFcCd() {
		return dstFcCd;
	}
	/**
	 * @param dstFcCd the dstFcCd to set
	 */
	public void setDstFcCd(String dstFcCd) {
		this.dstFcCd = dstFcCd;
	}

	/**
	 * @return the dstSrvaCd
	 */
	public String getDstSrvaCd() {
		return dstSrvaCd;
	}
	/**
	 * @param dstSrvaCd the dstSrvaCd to set
	 */
	public void setDstSrvaCd(String dstSrvaCd) {
		this.dstSrvaCd = dstSrvaCd;
	}

	/**
	 * @return the nPcsId
	 */
	public String getnPcsId() {
		return nPcsId;
	}
	/**
	 * @param nPcsId the nPcsId to set
	 */
	public void setnPcsId(String nPcsId) {
		this.nPcsId = nPcsId;
	}

	/**
	 * @return the orgFcCd
	 */
	public String getOrgFcCd() {
		return orgFcCd;
	}
	/**
	 * @param orgFcCd the orgFcCd to set
	 */
	public void setOrgFcCd(String orgFcCd) {
		this.orgFcCd = orgFcCd;
	}

	/**
	 * @return the orgSrvaCd
	 */
	public String getOrgSrvaCd() {
		return orgSrvaCd;
	}
	/**
	 * @param orgSrvaCd the orgSrvaCd to set
	 */
	public void setOrgSrvaCd(String orgSrvaCd) {
		this.orgSrvaCd = orgSrvaCd;
	}

	/**
	 * @return the shpId
	 */
	public String getShpId() {
		return shpId;
	}
	/**
	 * @param shpId the shpId to set
	 */
	public void setShpId(String shpId) {
		this.shpId = shpId;
	}

	/**
	 * @return the docTyCdST
	 */
	public String getDocTyCdST() {
		return docTyCdST;
	}
	/**
	 * @param docTyCdST the docTyCdST to set
	 */
	public void setDocTyCdST(String docTyCdST) {
		this.docTyCdST = docTyCdST;
	}

	/**
	 * @return the spcFcId
	 */
	public String getSpcFcId() {
		return spcFcId;
	}
	/**
	 * @param spcFcId the spcFcId to set
	 */
	public void setSpcFcId(String spcFcId) {
		this.spcFcId = spcFcId;
	}

	/**
	 * @return the instr
	 */
	public String getInstr() {
		return instr;
	}
	/**
	 * @param instr the instr to set
	 */
	public void setInstr(String instr) {
		this.instr = instr;
	}

	/**
	 * @return the rCd
	 */
	public String getrCd() {
		return rCd;
	}
	/**
	 * @param rCd the rCd to set
	 */
	public void setrCd(String rCd) {
		this.rCd = rCd;
	}

	/**
	 * @return the hitYCd
	 */
	public String getHitYCd() {
		return hitYCd;
	}
	/**
	 * @param hitYCd the hitYCd to set
	 */
	public void setHitYCd(String hitYCd) {
		this.hitYCd = hitYCd;
	}

	/**
	 * @return the loadDate
	 */
	public Date getLoadDate() {
		return loadDate;
	}
	/**
	 * @param loadDate the loadDate to set
	 */
	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}

	/**
	 * @return the uploader
	 */
	public String getUploader() {
		return uploader;
	}
	/**
	 * @param uploader the uploader to set
	 */
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	/**
	 * @return the records
	 */
	public ArrayList<STBlackList> getRecords() {
		return records;
	}
	/**
	 * @param records the records to set
	 */
	public void setRecords(ArrayList<STBlackList> records) {
		this.records = records;
	}

}
