package com.train.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 培训成绩
 * 
 * @author Administrator
 * 
 */
@Entity
@Table(name = "T_TRAIN_SCORE")
public class TrainingScore extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "USERNAME_", length = 60)
	private String usreName;
	@Column(name = "CNAME_", length = 120)
	private String cname;
	@Column(name = "DEPT_ID_", length = 60)
	private String deptId;
	@Column(name = "DEPT_NAME_", length = 120)
	private String deptName;
	@Column(name = "ID_CARD_", length = 20)
	private String idCard;
	@Column(name = "SCORE_")
	private Double score;
	@Column(name = "CERT_NO_", length = 30)
	private String certNo;
	@Column(name = "CERT_NAME_", length = 120)
	private String certName;
	@Column(name = "AWARD_DEPT_ID_", length = 60)
	private String awardDeptId;
	@Column(name = "AWARD_DEPT_NAME_", length = 120)
	private String awardDeptName;
	@Column(name = "AWARD_DATE_")
	private Date awardDate;
	@Column(name = "REMARK_", length = 240)
	private String remark;
	
	@Column(name = "PROJECT_ID_")
	private String projectId;
	
	

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUsreName() {
		return usreName;
	}

	public void setUsreName(String usreName) {
		this.usreName = usreName;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getAwardDeptId() {
		return awardDeptId;
	}

	public void setAwardDeptId(String awardDeptId) {
		this.awardDeptId = awardDeptId;
	}

	public String getAwardDeptName() {
		return awardDeptName;
	}

	public void setAwardDeptName(String awardDeptName) {
		this.awardDeptName = awardDeptName;
	}

	public Date getAwardDate() {
		return awardDate;
	}

	public void setAwardDate(Date awardDate) {
		this.awardDate = awardDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
