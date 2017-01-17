package blacklist.persist.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STBlacklist")
public class STBlackList {


	@Id
	@Column(name = "STId", nullable = false)
	private		String	stId;

	@Column(name = "TyCd", nullable = false)
	private 	String	tyCd;

	@Column(name = "PcsIdShipId", nullable = false)
	private		Long	pcsIdShipId;

	@Column(name = "PudPnt", nullable = true)
	private		String	pudPnt;

	@Column(name = "Dt", nullable = true)
	private		Date	dt;

	@Column(name = "SrvaCd", nullable = false)
	private		String	srvaCd;

	@Column(name = "FcCd", nullable = false)
	private		String	fcCd;

	@Column(name = "CycCd", nullable = true)
	private		String	cycCd;

	@Column(name = "RouteCd", nullable = true)
	private		String	routeCd;

	@Column(name = "DateTime", nullable = false)
	private		Date	dateTime;

	@Column(name = "LegalEntity", nullable = true)
	private		String	legalEntity;

	@Column(name = "NoPcs", nullable = false)
	private		Integer	noPcs;

	@Column(name = "ComDevNo", nullable = true)
	private		String	comDevNo;

	@Column(name = "DayPrd", nullable = true)
	private		String	dayPrd;

	@Column(name = "DstFcCd", nullable = true)
	private		String	dstFcCd;

	@Column(name = "DstSrvaCd", nullable = true)
	private		String	dstSrvaCd;

	@Column(name = "NPcsId", nullable = true)
	private		String	nPcsId;

	@Column(name = "OrgFcCd", nullable = true)
	private		String	orgFcCd;

	@Column(name = "OrgSrvaCd", nullable = true)
	private		String	orgSrvaCd;

	@Column(name = "ShpId", nullable = true)
	private		String	shpId;

	@Column(name = "DocTyCdST", nullable = true)
	private		String	docTyCdST;

	@Column(name = "SpcFcId", nullable = true)
	private		String	spcFcId;

	@Column(name = "Instr", nullable = true)
	private		String	instr;

	@Column(name = "RCd", nullable = true)
	private		String	rCd;

	@Column(name = "HITyCd", nullable = true)
	private		String	hitYCd;

	@Column(name = "LoadDate", nullable = false)
	private		Date	loadDate;

	@Column(name = "Uploader", nullable = false)
	private		String	uploader;


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

}
